/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id$
 */

package JDBC.fr.ifsic.epicerie;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class MaFourniture.
 * 
 * @version $Revision$ $Date$
 */
public class MaFourniture implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fournitureList.
     */
    private java.util.Vector _fournitureList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MaFourniture() {
        super();
        this._fournitureList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vFourniture
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFourniture(
            final JDBC.fr.ifsic.epicerie.Fourniture vFourniture)
    throws java.lang.IndexOutOfBoundsException {
        this._fournitureList.addElement(vFourniture);
    }

    /**
     * 
     * 
     * @param index
     * @param vFourniture
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFourniture(
            final int index,
            final JDBC.fr.ifsic.epicerie.Fourniture vFourniture)
    throws java.lang.IndexOutOfBoundsException {
        this._fournitureList.add(index, vFourniture);
    }

    /**
     * Method enumerateFourniture.
     * 
     * @return an Enumeration over all fr.ifsic.epicerie.Fourniture
     * elements
     */
    public java.util.Enumeration enumerateFourniture(
    ) {
        return this._fournitureList.elements();
    }

    /**
     * Method getFourniture.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the fr.ifsic.epicerie.Fourniture at the
     * given index
     */
    public JDBC.fr.ifsic.epicerie.Fourniture getFourniture(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._fournitureList.size()) {
            throw new IndexOutOfBoundsException("getFourniture: Index value '" + index + "' not in range [0.." + (this._fournitureList.size() - 1) + "]");
        }
        
        return (JDBC.fr.ifsic.epicerie.Fourniture) _fournitureList.get(index);
    }

    /**
     * Method getFourniture.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public JDBC.fr.ifsic.epicerie.Fourniture[] getFourniture(
    ) {
    	JDBC.fr.ifsic.epicerie.Fourniture[] array = new JDBC.fr.ifsic.epicerie.Fourniture[0];
        return (JDBC.fr.ifsic.epicerie.Fourniture[]) this._fournitureList.toArray(array);
    }

    /**
     * Method getFournitureCount.
     * 
     * @return the size of this collection
     */
    public int getFournitureCount(
    ) {
        return this._fournitureList.size();
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllFourniture(
    ) {
        this._fournitureList.clear();
    }

    /**
     * Method removeFourniture.
     * 
     * @param vFourniture
     * @return true if the object was removed from the collection.
     */
    public boolean removeFourniture(
            final JDBC.fr.ifsic.epicerie.Fourniture vFourniture) {
        boolean removed = _fournitureList.remove(vFourniture);
        return removed;
    }

    /**
     * Method removeFournitureAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public JDBC.fr.ifsic.epicerie.Fourniture removeFournitureAt(
            final int index) {
        java.lang.Object obj = this._fournitureList.remove(index);
        return (JDBC.fr.ifsic.epicerie.Fourniture) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vFourniture
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setFourniture(
            final int index,
            final JDBC.fr.ifsic.epicerie.Fourniture vFourniture)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._fournitureList.size()) {
            throw new IndexOutOfBoundsException("setFourniture: Index value '" + index + "' not in range [0.." + (this._fournitureList.size() - 1) + "]");
        }
        
        this._fournitureList.set(index, vFourniture);
    }

    /**
     * 
     * 
     * @param vFournitureArray
     */
    public void setFourniture(
            final JDBC.fr.ifsic.epicerie.Fourniture[] vFournitureArray) {
        //-- copy array
        _fournitureList.clear();
        
        for (int i = 0; i < vFournitureArray.length; i++) {
                this._fournitureList.add(vFournitureArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled fr.ifsic.epicerie.MaFourniture
     */
    public static JDBC.fr.ifsic.epicerie.MaFourniture unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (JDBC.fr.ifsic.epicerie.MaFourniture) Unmarshaller.unmarshal(JDBC.fr.ifsic.epicerie.MaFourniture.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
