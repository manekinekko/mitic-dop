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
 * Class Fourniture_type.
 * 
 * @version $Revision$ $Date$
 */
public class Fourniture_type implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _f.
     */
    private java.lang.String _f;

    /**
     * Field _p.
     */
    private java.lang.String _p;

    /**
     * Field _qte.
     */
    private long _qte;

    /**
     * keeps track of state for field: _qte
     */
    private boolean _has_qte;


      //----------------/
     //- Constructors -/
    //----------------/

    public Fourniture_type() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteQte(
    ) {
        this._has_qte= false;
    }

    /**
     * Returns the value of field 'f'.
     * 
     * @return the value of field 'F'.
     */
    public java.lang.String getF(
    ) {
        return this._f;
    }

    /**
     * Returns the value of field 'p'.
     * 
     * @return the value of field 'P'.
     */
    public java.lang.String getP(
    ) {
        return this._p;
    }

    /**
     * Returns the value of field 'qte'.
     * 
     * @return the value of field 'Qte'.
     */
    public long getQte(
    ) {
        return this._qte;
    }

    /**
     * Method hasQte.
     * 
     * @return true if at least one Qte has been added
     */
    public boolean hasQte(
    ) {
        return this._has_qte;
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
     * Sets the value of field 'f'.
     * 
     * @param f the value of field 'f'.
     */
    public void setF(
            final java.lang.String f) {
        this._f = f;
    }

    /**
     * Sets the value of field 'p'.
     * 
     * @param p the value of field 'p'.
     */
    public void setP(
            final java.lang.String p) {
        this._p = p;
    }

    /**
     * Sets the value of field 'qte'.
     * 
     * @param qte the value of field 'qte'.
     */
    public void setQte(
            final long qte) {
        this._qte = qte;
        this._has_qte = true;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled fr.ifsic.epicerie.Fourniture_type
     */
    public static JDBC.fr.ifsic.epicerie.Fourniture_type unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (JDBC.fr.ifsic.epicerie.Fourniture_type) Unmarshaller.unmarshal(JDBC.fr.ifsic.epicerie.Fourniture_type.class, reader);
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
