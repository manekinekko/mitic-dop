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
 * Class Fournisseurs.
 * 
 * @version $Revision$ $Date$
 */
public class Fournisseurs implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fournisseurList.
     */
    private java.util.Vector _fournisseurList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Fournisseurs() {
        super();
        this._fournisseurList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vFournisseur
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFournisseur(
            final JDBC.fr.ifsic.epicerie.Fournisseur vFournisseur)
    throws java.lang.IndexOutOfBoundsException {
        this._fournisseurList.addElement(vFournisseur);
    }

    /**
     * 
     * 
     * @param index
     * @param vFournisseur
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFournisseur(
            final int index,
            final JDBC.fr.ifsic.epicerie.Fournisseur vFournisseur)
    throws java.lang.IndexOutOfBoundsException {
        this._fournisseurList.add(index, vFournisseur);
    }

    /**
     * Method enumerateFournisseur.
     * 
     * @return an Enumeration over all
     * fr.ifsic.epicerie.Fournisseur elements
     */
    public java.util.Enumeration enumerateFournisseur(
    ) {
        return this._fournisseurList.elements();
    }

    /**
     * Method getFournisseur.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the fr.ifsic.epicerie.Fournisseur at
     * the given index
     */
    public JDBC.fr.ifsic.epicerie.Fournisseur getFournisseur(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._fournisseurList.size()) {
            throw new IndexOutOfBoundsException("getFournisseur: Index value '" + index + "' not in range [0.." + (this._fournisseurList.size() - 1) + "]");
        }
        
        return (JDBC.fr.ifsic.epicerie.Fournisseur) _fournisseurList.get(index);
    }

    /**
     * Method getFournisseur.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public JDBC.fr.ifsic.epicerie.Fournisseur[] getFournisseur(
    ) {
    	JDBC.fr.ifsic.epicerie.Fournisseur[] array = new JDBC.fr.ifsic.epicerie.Fournisseur[0];
        return (JDBC.fr.ifsic.epicerie.Fournisseur[]) this._fournisseurList.toArray(array);
    }

    /**
     * Method getFournisseurCount.
     * 
     * @return the size of this collection
     */
    public int getFournisseurCount(
    ) {
        return this._fournisseurList.size();
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
    public void removeAllFournisseur(
    ) {
        this._fournisseurList.clear();
    }

    /**
     * Method removeFournisseur.
     * 
     * @param vFournisseur
     * @return true if the object was removed from the collection.
     */
    public boolean removeFournisseur(
            final JDBC.fr.ifsic.epicerie.Fournisseur vFournisseur) {
        boolean removed = _fournisseurList.remove(vFournisseur);
        return removed;
    }

    /**
     * Method removeFournisseurAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public JDBC.fr.ifsic.epicerie.Fournisseur removeFournisseurAt(
            final int index) {
        java.lang.Object obj = this._fournisseurList.remove(index);
        return (JDBC.fr.ifsic.epicerie.Fournisseur) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vFournisseur
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setFournisseur(
            final int index,
            final JDBC.fr.ifsic.epicerie.Fournisseur vFournisseur)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._fournisseurList.size()) {
            throw new IndexOutOfBoundsException("setFournisseur: Index value '" + index + "' not in range [0.." + (this._fournisseurList.size() - 1) + "]");
        }
        
        this._fournisseurList.set(index, vFournisseur);
    }

    /**
     * 
     * 
     * @param vFournisseurArray
     */
    public void setFournisseur(
            final JDBC.fr.ifsic.epicerie.Fournisseur[] vFournisseurArray) {
        //-- copy array
        _fournisseurList.clear();
        
        for (int i = 0; i < vFournisseurArray.length; i++) {
                this._fournisseurList.add(vFournisseurArray[i]);
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
     * @return the unmarshaled fr.ifsic.epicerie.Fournisseurs
     */
    public static JDBC.fr.ifsic.epicerie.Fournisseurs unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (JDBC.fr.ifsic.epicerie.Fournisseurs) Unmarshaller.unmarshal(JDBC.fr.ifsic.epicerie.Fournisseurs.class, reader);
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
