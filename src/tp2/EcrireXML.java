package tp2;

import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class EcrireXML {

	public static void ecrireXML(Document doc, String name){
		// lets write to a file
        XMLWriter writer;
		try {
			
			writer = new XMLWriter(
			    new FileWriter( "src/tp2/"+name+".xml" )
			);
			writer.write( doc );
			writer.close();
			
			
			// Pretty print the document to System.out
			OutputFormat format = OutputFormat.createPrettyPrint();
			writer = new XMLWriter( System.out, format );
			writer.write( doc );
			
			// Compact format to System.out
//			format = OutputFormat.createCompactFormat();
//			writer = new XMLWriter( System.out, format );
//			writer.write( doc );
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
