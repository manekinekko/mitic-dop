package tp2;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XPATH {

	public static void Question3() {
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read("src/tp1/xml/carnetDAdresse.xml");
			String xpath = "/carnetDAdresse/carteDeVisite/adresse/ville[ starts-with(@codepostal, '56') ]";
			List<?> list = document.selectNodes(xpath);

			System.out.println("Nombre de carte de visite de <<Vannes>> est de "
							+ list.size() + ".");

		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

	public static void Question4() {
		String inputXML = "src/tp1/xml/carnetDAdresse.xml";
		String outputXMLFileName = "my_carnetDAdresse";

		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputXML);
			String xpath = "/carnetDAdresse/carteDeVisite/adresse/ville[ starts-with(@codepostal, '35') ]";

			@SuppressWarnings("unchecked")
			List<Element> nodes = document.selectNodes(xpath);

			for (Element node : nodes) {
				
				// add permet de remplacer l'attribut s'il est deja present
				node.addAttribute("codepostal", "35000");
			}

			EcrireXML.ecrireXML(document, outputXMLFileName);

		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		XPATH.Question3();
		XPATH.Question4();
	}

}
