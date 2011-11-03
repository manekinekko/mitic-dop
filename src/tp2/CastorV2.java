package tp2;

import java.io.FileWriter;
import java.io.IOException;
import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.ValidationException;

public class CastorV2 {

	private static void exporter() {

		String output = "src/tp2/personneV2.xml";
		String mappingFile = "src/tp2/mappingV2.xml";
		Ville ville = new Ville("35000", "Rennes");
		PersonneV2 personne = new PersonneV2("Durant", 28, (float) 1.80, ville);

		//
		FileWriter file;
		try {

			//
			Mapping mapping = new Mapping();
			mapping.loadMapping(mappingFile);

			//
			file = new FileWriter(output);

			//
			Marshaller marshaller = new Marshaller(file);
			marshaller.setMapping(mapping);
			marshaller.marshal(personne);

			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		} catch (MappingException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		CastorV2.exporter();
	}

}
