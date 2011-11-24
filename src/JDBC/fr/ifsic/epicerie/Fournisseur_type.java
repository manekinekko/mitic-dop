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
 * Class Fournisseur_type.
 * 
 * @version $Revision$ $Date$
 */
public class Fournisseur_type implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _f.
     */
    private java.lang.String _f;

    /**
     * Field _nom.
     */
    private java.lang.String _nom;

    /**
     * Field _remise.
     */
    private java.math.BigDecimal _remise;

    /**
     * Field _ville.
     */
    private java.lang.String _ville;


      //----------------/
     //- Constructors -/
    //----------------/

    public Fournisseur_type() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'nom'.
     * 
     * @return the value of field 'Nom'.
     */
    public java.lang.String getNom(
    ) {
        return this._nom;
    }

    /**
     * Returns the value of field 'remise'.
     * 
     * @return the value of field 'Remise'.
     */
    public java.math.BigDecimal getRemise(
    ) {
        return this._remise;
    }

    /**
     * Returns the value of field 'ville'.
     * 
     * @return the value of field 'Ville'.
     */
    public java.lang.String getVille(
    ) {
        return this._ville;
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
     * Sets the value of field 'nom'.
     * 
     * @param nom the value of field 'nom'.
     */
    public void setNom(
            final java.lang.String nom) {
        this._nom = nom;
    }

    /**
     * Sets the value of field 'remise'.
     * 
     * @param remise the value of field 'remise'.
     */
    public void setRemise(
            final java.math.BigDecimal remise) {
        this._remise = remise;
    }

    /**
     * Sets the value of field 'ville'.
     * 
     * @param ville the value of field 'ville'.
     */
    public void setVille(
            final java.lang.String ville) {
        this._ville = ville;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled fr.ifsic.epicerie.Fournisseur_type
     */
    public static JDBC.fr.ifsic.epicerie.Fournisseur_type unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (JDBC.fr.ifsic.epicerie.Fournisseur_type) Unmarshaller.unmarshal(JDBC.fr.ifsic.epicerie.Fournisseur_type.class, reader);
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
