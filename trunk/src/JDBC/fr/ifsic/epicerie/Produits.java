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
 * Class Produits.
 * 
 * @version $Revision$ $Date$
 */
public class Produits implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _produitList.
     */
    private java.util.Vector _produitList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Produits() {
        super();
        this._produitList = new java.util.Vector();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vProduit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProduit(
            final JDBC.fr.ifsic.epicerie.Produit vProduit)
    throws java.lang.IndexOutOfBoundsException {
        this._produitList.addElement(vProduit);
    }

    /**
     * 
     * 
     * @param index
     * @param vProduit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProduit(
            final int index,
            final JDBC.fr.ifsic.epicerie.Produit vProduit)
    throws java.lang.IndexOutOfBoundsException {
        this._produitList.add(index, vProduit);
    }

    /**
     * Method enumerateProduit.
     * 
     * @return an Enumeration over all fr.ifsic.epicerie.Produit
     * elements
     */
    public java.util.Enumeration enumerateProduit(
    ) {
        return this._produitList.elements();
    }

    /**
     * Method getProduit.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the fr.ifsic.epicerie.Produit at the
     * given index
     */
    public JDBC.fr.ifsic.epicerie.Produit getProduit(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._produitList.size()) {
            throw new IndexOutOfBoundsException("getProduit: Index value '" + index + "' not in range [0.." + (this._produitList.size() - 1) + "]");
        }
        
        return (JDBC.fr.ifsic.epicerie.Produit) _produitList.get(index);
    }

    /**
     * Method getProduit.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public JDBC.fr.ifsic.epicerie.Produit[] getProduit(
    ) {
    	JDBC.fr.ifsic.epicerie.Produit[] array = new JDBC.fr.ifsic.epicerie.Produit[0];
        return (JDBC.fr.ifsic.epicerie.Produit[]) this._produitList.toArray(array);
    }

    /**
     * Method getProduitCount.
     * 
     * @return the size of this collection
     */
    public int getProduitCount(
    ) {
        return this._produitList.size();
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
    public void removeAllProduit(
    ) {
        this._produitList.clear();
    }

    /**
     * Method removeProduit.
     * 
     * @param vProduit
     * @return true if the object was removed from the collection.
     */
    public boolean removeProduit(
            final JDBC.fr.ifsic.epicerie.Produit vProduit) {
        boolean removed = _produitList.remove(vProduit);
        return removed;
    }

    /**
     * Method removeProduitAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public JDBC.fr.ifsic.epicerie.Produit removeProduitAt(
            final int index) {
        java.lang.Object obj = this._produitList.remove(index);
        return (JDBC.fr.ifsic.epicerie.Produit) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vProduit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProduit(
            final int index,
            final JDBC.fr.ifsic.epicerie.Produit vProduit)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._produitList.size()) {
            throw new IndexOutOfBoundsException("setProduit: Index value '" + index + "' not in range [0.." + (this._produitList.size() - 1) + "]");
        }
        
        this._produitList.set(index, vProduit);
    }

    /**
     * 
     * 
     * @param vProduitArray
     */
    public void setProduit(
            final JDBC.fr.ifsic.epicerie.Produit[] vProduitArray) {
        //-- copy array
        _produitList.clear();
        
        for (int i = 0; i < vProduitArray.length; i++) {
                this._produitList.add(vProduitArray[i]);
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
     * @return the unmarshaled fr.ifsic.epicerie.Produits
     */
    public static JDBC.fr.ifsic.epicerie.Produits unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (JDBC.fr.ifsic.epicerie.Produits) Unmarshaller.unmarshal(JDBC.fr.ifsic.epicerie.Produits.class, reader);
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
