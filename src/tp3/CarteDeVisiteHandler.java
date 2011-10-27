package tp3;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CarteDeVisiteHandler extends DefaultHandler {

	List<CarteDeVisite> listCarteDeVisite_;
	private int listSize_ = 0;
	private String lastText_;

	public CarteDeVisiteHandler() {
		super();
	}

	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		listCarteDeVisite_ = new ArrayList<CarteDeVisite>();
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);

		if ("cartedevisite".equalsIgnoreCase(qName)) {
			CarteDeVisite carnetDAdresse = new CarteDeVisite();
			carnetDAdresse.setId(attributes.getValue("id"));
			listCarteDeVisite_.add(carnetDAdresse);
			listSize_++;
		} else if ("adresse".equalsIgnoreCase(qName)) {
			if (!listCarteDeVisite_.isEmpty()) {
				Adresse adresse = new Adresse();
				listCarteDeVisite_.get(listSize_ - 1).setAdresse(adresse);
			}
		} else if ("voie".equalsIgnoreCase(qName)) {
			if (!listCarteDeVisite_.isEmpty()) {
				Voie voie = new Voie();
				voie.setType(attributes.getValue("type"));
				listCarteDeVisite_.get(listSize_ - 1).getAdresse()
						.setVoie(voie);
			}
		} else if ("ville".equalsIgnoreCase(qName)) {
			if (!listCarteDeVisite_.isEmpty()) {
				Ville ville = new Ville();
				ville.setCodePostal(attributes.getValue("codepostal"));
				listCarteDeVisite_.get(listSize_ - 1).getAdresse()
						.setVille(ville);
			}
		}

	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		super.characters(ch, start, length);
		StringBuffer s = new StringBuffer("");
		for (int i = start; i < start + length; i++) {
			s.append(ch[i]);
		}
		lastText_ = s.toString();
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		super.endElement(uri, localName, qName);

		if ("nom".equalsIgnoreCase(qName)) {
			listCarteDeVisite_.get(listSize_ - 1).setNom(lastText_);
		} else if ("prénom".equalsIgnoreCase(qName)) {
			listCarteDeVisite_.get(listSize_ - 1).setPrenom(lastText_);
		} else if ("organisme".equalsIgnoreCase(qName)) {
			listCarteDeVisite_.get(listSize_ - 1).setOrganisme(lastText_);
		} else if ("numéro".equalsIgnoreCase(qName)) {
			listCarteDeVisite_.get(listSize_ - 1).getAdresse()
					.setNumero(lastText_);
		} else if ("voie".equalsIgnoreCase(qName)) {
			Voie voie = listCarteDeVisite_.get(listSize_ - 1).getAdresse()
					.getVoie();
			voie.setNom(lastText_);
		} else if ("ville".equalsIgnoreCase(qName)) {
			Ville ville = listCarteDeVisite_.get(listSize_ - 1).getAdresse()
					.getVille();
			ville.setNom(lastText_);
		}

	}

	@Override
	public void endDocument() throws SAXException {
		super.endDocument();

		for (int i = 0; i < listSize_ - 1; i++) {
			System.out.println(listCarteDeVisite_.get(i));
		}
	}
}
