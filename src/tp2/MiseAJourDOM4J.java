package tp2;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class MiseAJourDOM4J {

	public static void main(String[] args) {
		SAXReader reader = new SAXReader();
		try {
			
			Document document = reader.read("src/tp2/personne.xml");
			Node node = document.selectSingleNode("//adresse/ville" );
			node.setText("Vern sur Seiche");
			
			EcrireXML.ecrireXML(document, "personneNew");
			
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
