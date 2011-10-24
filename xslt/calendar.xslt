<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:output method="html"/>

<xsl:template match="/">                   <!--root rule-->
   <xsl:apply-templates select="CALENDAR"/> <!--restrict instances-->
</xsl:template>

<xsl:template match="CALENDAR"> <!--each month belongs in a table-->
   <html>
    <head>
<!--     <link rel="stylesheet" type="text/css" href="e:\pxa\sheets\course.css"/> -->
     <style type="text/css">
      .CALENDARTITLE  	{font-family:Arial,Helvetica;font-size:23pt;text-align:center;background:gray;color:black;}
      .CDATE 		{display:block;font-size:12pt;margin-left:0pt;}
      .CTEXT 		{display:block;font-size:10pt;margin-left:0pt;}
      .Weekday 		{font-family:Arial,Helvetica; font-size:12pt; font-weight:bold; color:black; text-align:center;background:lightgrey;}
     </style>
    </head>
     <xsl:for-each select="MONTH">
       <xsl:apply-templates select="TITLE"/>
       <table border="1" valign="top" width="75%" align="center">
	 <colgroup>
           <col width="14%" span="7"/>
         </colgroup>
	 <tr class="Weekday">
	  <td>Sunday</td><td>Monday</td><td>Tuesday</td><td>Wednesday</td>
          <td>Thursday</td><td>Friday</td><td>Saturday</td>
 	 </tr>
         <xsl:call-template name="doweek">
           <xsl:with-param name="start" select="@start - 1"/>
           <xsl:with-param name="end" select="@end"/>
         </xsl:call-template>
       </table>
     </xsl:for-each>
   </html>
</xsl:template>

<xsl:template name="doweek">    <!--each week belongs in a row-->
   <xsl:param name="start" select="0"/>
   <xsl:param name="end"/>
   <xsl:param name="day" select="1"/>
   <xsl:if test="$day &lt;= $end">
     <tr valign="top">
       <xsl:call-template name="doday">
         <xsl:with-param name="day" select="$day"/>
         <xsl:with-param name="start" select="$start"/>
         <xsl:with-param name="end" select="$end"/>
       </xsl:call-template>
     </tr>
     <xsl:call-template name="doweek">
       <xsl:with-param name="day" select="$day+7-$start"/>
       <xsl:with-param name="end" select="$end"/>
     </xsl:call-template>
   </xsl:if>
</xsl:template>

<xsl:template name="doday">     <!--each day belongs in a column-->
   <xsl:param name="start" select="0"/> <!--only def'd first time-->
   <xsl:param name="end"/>
   <xsl:param name="day"/>
   <xsl:param name="weekday" select="7"/>
   <xsl:choose>
     <xsl:when test="$start>0">  <!--not started days yet-->
       <td>
       </td>
       <xsl:call-template name="doday">
         <xsl:with-param name="start" select="$start - 1"/>
         <xsl:with-param name="end" select="$end"/>
         <xsl:with-param name="day" select="$day"/>
         <xsl:with-param name="weekday" select="$weekday - 1"/>
       </xsl:call-template>
     </xsl:when>
     <xsl:otherwise>             <!--a typical day of the week-->
       <td height="87">
         <DIV class="CDATE"><xsl:value-of select="$day"/></DIV>
<!-- <b><xsl:value-of select="substring('SFTWTMS', $weekday, 1)"/><xsl:text> </xsl:text> -->

         <xsl:for-each select=".//EVENT[@date=$day]">
           <p class="CTEXT"><xsl:value-of select="position()"/>:
              <xsl:value-of select="PARA[1]"/></p>
           <xsl:for-each select="PARA[position()>1]">
             <P class="CTEXT"><xsl:value-of select="."/></P>
           </xsl:for-each>
         </xsl:for-each>
       </td>
       <xsl:if test="$weekday > 1 and $day &lt; $end">
         <xsl:call-template name="doday">
           <xsl:with-param name="end" select="$end"/>
           <xsl:with-param name="day" select="$day+1"/>
           <xsl:with-param name="weekday" select="$weekday - 1"/>
         </xsl:call-template>
       </xsl:if>
     </xsl:otherwise>
   </xsl:choose>
</xsl:template>

<xsl:template match="TITLE">
 <table width="75%" align="center">
 <tr><td>

 <DIV class="CALENDARTITLE">
  <xsl:apply-templates/>
 </DIV></td></tr>
 </table>
</xsl:template>

</xsl:stylesheet>