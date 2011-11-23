package tp2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

public class Castor {

	@SuppressWarnings("static-access")
	private static void exporter() {

		String output = "src/tp2/personne.xml";
		String mappingFile = "src/tp2/mapping.xml";
		Personne personne = new Personne("Durant", 28, (float) 1.80);

		//
		FileWriter file;
		try {

			//
			Mapping mappgin = new Mapping();
			mappgin.loadMapping(mappingFile);
			
			//
			file = new FileWriter(output);
			
			//
			Marshaller marshaller = new Marshaller(file);
			marshaller.setMapping(mappgin);
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

	/**
	 * Question5: lorsqu'on saisie des valeurs de type different de int ou float
	 * dans le fichier XML, castor provoque une java.lang.NumberException
	 */
	private static void importer() {
		String inputName = "src/tp2/personne.xml";
		FileReader reader;
		try {

			reader = new FileReader(inputName);
			Personne personne = (Personne) Unmarshaller.unmarshal(
					Personne.class, reader);

			System.out.println("Nom: " + personne.getNom() + ", age: "
					+ personne.getAge() + ", taille: " + personne.getTaille());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MarshalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		//Castor.exporter();
		Castor.importer();
	}

}
