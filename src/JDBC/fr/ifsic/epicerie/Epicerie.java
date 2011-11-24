package JDBC.fr.ifsic.epicerie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

public class Epicerie {
	private Fournisseur[] lesFournisseurs;
	private Produit[] lesProduits;
	private Fourniture[] maFourniture;

	public Epicerie() throws FileNotFoundException, InitEpicerieException {

		try {
			FileReader inf = new FileReader("src/JDBC/xml/fournisseur.xml");
			lesFournisseurs = Fournisseurs.unmarshal(inf).getFournisseur();

			FileReader inp = new FileReader("src/JDBC/xml/produit.xml");
			lesProduits = Produits.unmarshal(inp).getProduit();

			FileReader inmf = new FileReader("src/JDBC/xml/maFourniture.xml");
			maFourniture = MaFourniture.unmarshal(inmf).getFourniture();
		} catch (Exception e) {
			throw new InitEpicerieException(e.getMessage());
		} 

	}

	public Fournisseur[] getLesFournisseurs() {
		return lesFournisseurs;
	}

	public Produit[] getLesProduits() {
		return lesProduits;
	}

	public Fourniture[] getMaFourniture() {
		return maFourniture;
	}

}
