import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class MY_DOM {

	public static void Question1() {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		String nomFichier = "my_xml/question1.xml";

		try {

			builder = dbFactory.newDocumentBuilder();
			Document doc = builder.newDocument();
			Source source = new DOMSource(doc);

			Element root = doc.createElement("personne");

			//
			Element newChild = doc.createElement("nom");
			Text text = doc.createTextNode("Durant");
			newChild.appendChild(text);
			root.appendChild(newChild);

			//
			newChild = doc.createElement("age");
			text = doc.createTextNode("28");
			newChild.appendChild(text);
			root.appendChild(newChild);

			//
			newChild = doc.createElement("hauteur");
			text = doc.createTextNode("1.80");
			newChild.appendChild(text);
			root.appendChild(newChild);

			//
			doc.appendChild(root);

			try {

				Result result = new StreamResult(new File(nomFichier));
				Transformer trans;
				trans = TransformerFactory.newInstance().newTransformer();
				trans.transform(source, result);

			} catch (TransformerConfigurationException e) {
				e.printStackTrace();
			} catch (TransformerFactoryConfigurationError e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}

		} catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		}

	}

	public static void Question2() {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		String nomFichier = "my_xml/question2.xml";

		try {

			builder = dbFactory.newDocumentBuilder();
			Document doc = builder.newDocument();
			Source source = new DOMSource(doc);

			Element root = doc.createElement("personne");
			root.setAttribute("age", "28");

			//
			Element newChild = doc.createElement("nom");
			Text text = doc.createTextNode("Durant");
			newChild.appendChild(text);
			root.appendChild(newChild);

			//
			newChild = doc.createElement("hauteur");
			text = doc.createTextNode("1.80");
			newChild.appendChild(text);
			root.appendChild(newChild);

			//
			doc.appendChild(root);

			try {

				Result result = new StreamResult(new File(nomFichier));
				Transformer trans;
				trans = TransformerFactory.newInstance().newTransformer();
				trans.transform(source, result);

			} catch (TransformerConfigurationException e) {
				e.printStackTrace();
			} catch (TransformerFactoryConfigurationError e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}

		} catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		}

	}

	public static void Question3() {

		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder domparser = dbFactory.newDocumentBuilder();
			Document doc = domparser.parse(new File("xml/carnetDAdresse.xml"));

			NodeList nodes = doc.getElementsByTagName("ville");
			Node node;
			String texte = "";
			short nbCartesRennes = 0;
			for (short i = 0; i < nodes.getLength(); i++) {

				node = nodes.item(i);
				texte = node.getTextContent();
				if (texte.equals("Rennes")) {
					nbCartesRennes++;
				}

			}

			System.out.println(nbCartesRennes);

		} catch (ParserConfigurationException pce) {
			System.out.println("Erreur de configuration du parseur DOM");
			System.out
					.println("lors de l'appel à fabrique.newDocumentBuilder();");
		} catch (SAXException se) {
			System.out.println("Erreur lors du parsing du document");
			System.out.println("lors de l'appel à construteur.parse(xml)");
		} catch (IOException ioe) {
			System.out.println("Erreur d'entrée/sortie");
			System.out.println("lors de l'appel à construteur.parse(xml)");
		}
	}

	public static void Question4() {

		try {

			//
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			dbFactory.setNamespaceAware(true);
			DocumentBuilder domparser = dbFactory.newDocumentBuilder();
			Document doc = domparser.parse(new File("xml/carnetDAdresse.xml"));

			//
			String xpath20String = "for carte in "
					+ " (//ville[ starts-with(@codepostal, '56') ]/parent::adresse/parent::carteDeVisite) "
					+ " return "
					+ " string-join($carte/nom, $carte/prénom, ' ')";

			String xpath10String = "//ville[ starts-with(@codepostal, '56') ]/parent::adresse/parent::carteDeVisite";

			//
			XPathFactory factory = XPathFactory.newInstance();
			XPath xpath = factory.newXPath();
			XPathExpression expr = xpath.compile(xpath10String);

			//
			Object result = expr.evaluate(doc, XPathConstants.NODESET);
			NodeList nodes = (NodeList) result, subChild;

			Node node;
			ArrayList<String> personnes = new ArrayList<String>();
			String nom = "";
			for (short i = 0; i < nodes.getLength(); i++) {

				node = nodes.item(i);

				// nom
				expr = xpath.compile("./nom");
				result = expr.evaluate(node, XPathConstants.NODESET);
				subChild = (NodeList) result;
				nom += subChild.item(0).getTextContent() + " ";

				// prénom
				expr = xpath.compile("./prénom");
				result = expr.evaluate(node, XPathConstants.NODESET);
				subChild = (NodeList) result;
				nom += subChild.item(0).getTextContent();

				//
				personnes.add(nom);
				nom = "";

			}

			System.out.println(personnes);

		} catch (ParserConfigurationException pce) {
			System.out.println("Erreur de configuration du parseur DOM");
			System.out
					.println("lors de l'appel à fabrique.newDocumentBuilder();");
		} catch (SAXException se) {
			System.out.println("Erreur lors du parsing du document");
			System.out.println("lors de l'appel à construteur.parse(xml)");
		} catch (IOException ioe) {
			System.out.println("Erreur d'entrée/sortie");
			System.out.println("lors de l'appel à construteur.parse(xml)");
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
	}

	public static void Question5() {

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			factory.setValidating(true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document xmlDocument = builder.parse(new File(
					"xml/carnetDAdresse.xml"));
			DOMSource source = new DOMSource(xmlDocument);
			StreamResult result = new StreamResult(System.out);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,
					"carnetDAdresse.dtd");
			transformer.transform(source, result);

		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// MY_DOM.Question1();
		// MY_DOM.Question2();
		// MY_DOM.Question3();
		// MY_DOM.Question4();
		MY_DOM.Question5();
	}

}
