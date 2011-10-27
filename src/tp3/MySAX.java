package tp3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MySAX {

	private static void compile() {
		String inputFile = "src/tp1/xml/carnetDAdresse.xml";
		CarteDeVisiteHandler handler = new CarteDeVisiteHandler();
		
		//
		XMLReader saxReader;
		try {
		
			saxReader = XMLReaderFactory.createXMLReader();
			saxReader.setContentHandler(handler);
			saxReader.parse(new InputSource(inputFile));

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		MySAX.compile();
	}
	
}
