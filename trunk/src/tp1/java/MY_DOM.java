package tp1.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import tp1.fr.irisa.bekkers.GregorianMonth;

public class MY_DOM {

	public static void Question1() {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		String nomFichier = "src/tp1/my_xml/question1.xml";

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

				docToXml(nomFichier, source);

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
		String nomFichier = "src/tp1/my_xml/question2.xml";

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

				docToXml(nomFichier, source);

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

			Document doc = xmlToDoc("src/tp1/xml/carnetDAdresse.xml");

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
			Document doc = xmlToDoc("src/tp1/xml/carnetDAdresse.xml");

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
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Document xmlToDoc(String xmlInputFile)
			throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setNamespaceAware(true);
		DocumentBuilder domparser = dbFactory.newDocumentBuilder();
		Document doc = domparser.parse(new File(xmlInputFile));
		return doc;
	}

	private static void docToXml(String nomFichier, Source source)
			throws TransformerFactoryConfigurationError, TransformerException {
		Result result = new StreamResult(new File(nomFichier));
		Transformer trans;
		trans = TransformerFactory.newInstance().newTransformer();
		trans.transform(source, result);
	}

	
	public static void Question5() {

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			factory.setValidating(true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document xmlDocument = builder.parse(new File(
					"src/tp1/xml/carnetDAdresse.xml"));
			DOMSource source = new DOMSource(xmlDocument);
			StreamResult result = new StreamResult(System.out);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,
					"src/tp1/xml/carnetDAdresse.dtd");
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

	public static void Question6() {
		String xmlInputFile = "src/tp1/xml/rawCalendar.xml";
		String xsltInputFile = "src/tp1/xslt/calendar.xslt";
		String xmlOutputFile = "src/tp1/my_xml/calendar_v1.html";
		xsltTransform(xmlInputFile, xsltInputFile, xmlOutputFile);
	}

	public static void Question7() {
		String simpleCalendar = "src/tp1/xml/calendar.xml";
		String xsltInputFile = "src/tp1/xslt/calendar.xslt";
		String rawCalendar = "src/tp1/my_xml/my_raw_calendar.xml";
		String outputCalendar = "src/tp1/my_xml/calendar_v2.html";
		
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbFactory.newDocumentBuilder();
			Document inputDoc = xmlToDoc(simpleCalendar);
			NodeList nodeList = inputDoc.getElementsByTagName("MONTH");
			int count = nodeList.getLength();
			int y;
			int m;
			GregorianMonth month;
			NamedNodeMap att;
			Element currentElement, newChild;
			for(short i=0; i<count; i++){
				
				// cache the current element
				currentElement = (Element) nodeList.item(i);
				
				// cache the current element's attribbutes
				att = currentElement.getAttributes();
				
				// get the current element's month and year
				m = Integer.parseInt(att.getNamedItem("num").getTextContent());
				y = Integer.parseInt(att.getNamedItem("year").getTextContent());
				
				// compute the gregorian date
				month = new GregorianMonth(y, m);
				
				// create new attribute so the xslt sheet can proccess the xml file
				currentElement.setAttribute("start", ""+month.start());
				currentElement.setAttribute("end", ""+month.last());
				
				// create and append a new "title" element
				newChild = inputDoc.createElement("TITLE");
				newChild.setTextContent(month.titre());
				currentElement.appendChild(newChild);
				
				// clean the current element's attribute
				currentElement.removeAttribute("num");
				currentElement.removeAttribute("year");
				
			}
			
			// build the new raw_calendar file and proccess it with xslt sheet
			docToXml(rawCalendar, new DOMSource(inputDoc));
			xsltTransform(rawCalendar, xsltInputFile, outputCalendar);
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Transform an XML file using XSLT sheet
	 * @param xmlInputFile
	 * @param xsltInputFile
	 * @param xmlOutputFile
	 */
	public static void xsltTransform(String xmlInputFile, String xsltInputFile,
			String xmlOutputFile) {
		try {

			//
			Source xmlSource = new StreamSource(new FileInputStream(
					xmlInputFile));
			Source xsltSource = new StreamSource(new FileInputStream(
					xsltInputFile));
			Result transResult = new StreamResult(new FileOutputStream(
					xmlOutputFile));

			//
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer(xsltSource);

			//
			t.transform(xmlSource, transResult);

		} catch (FileNotFoundException | TransformerException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		MY_DOM.Question1();
		MY_DOM.Question2();
		MY_DOM.Question3();
		MY_DOM.Question4();
		MY_DOM.Question5();
		MY_DOM.Question6();
		MY_DOM.Question7();
	}

}
