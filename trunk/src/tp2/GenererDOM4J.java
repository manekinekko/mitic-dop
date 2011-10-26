package tp2;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class GenererDOM4J {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("personne");

		Element nom = root.addElement("nom").addText("Durant");
		Element age = root.addElement("age").addText("28");
		Element taille = root.addElement("taille").addText("1.80");
		Element adresse = root.addElement("adresse");
		adresse.addElement("ville").addAttribute("codePostale", "3500")
				.addText("Rennes");
		adresse.addElement("voie").addAttribute("type", "rue")
				.addText("de l'Alma");

		EcrireXML.ecrireXML(document, "personne");
	}
	
	
}
