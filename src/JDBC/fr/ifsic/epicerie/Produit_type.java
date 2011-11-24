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
 * Class Produit_type.
 * 
 * @version $Revision$ $Date$
 */
public class Produit_type implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _p.
     */
    private java.lang.String _p;

    /**
     * Field _nom.
     */
    private java.lang.String _nom;

    /**
     * Field _couleur.
     */
    private java.lang.String _couleur;

    /**
     * Field _origine.
     */
    private java.lang.String _origine;


      //----------------/
     //- Constructors -/
    //----------------/

    public Produit_type() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'couleur'.
     * 
     * @return the value of field 'Couleur'.
     */
    public java.lang.String getCouleur(
    ) {
        return this._couleur;
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
     * Returns the value of field 'origine'.
     * 
     * @return the value of field 'Origine'.
     */
    public java.lang.String getOrigine(
    ) {
        return this._origine;
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
     * Sets the value of field 'couleur'.
     * 
     * @param couleur the value of field 'couleur'.
     */
    public void setCouleur(
            final java.lang.String couleur) {
        this._couleur = couleur;
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
     * Sets the value of field 'origine'.
     * 
     * @param origine the value of field 'origine'.
     */
    public void setOrigine(
            final java.lang.String origine) {
        this._origine = origine;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled fr.ifsic.epicerie.Produit_type
     */
    public static JDBC.fr.ifsic.epicerie.Produit_type unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (JDBC.fr.ifsic.epicerie.Produit_type) Unmarshaller.unmarshal(JDBC.fr.ifsic.epicerie.Produit_type.class, reader);
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
