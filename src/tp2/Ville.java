package tp2;

import java.io.Serializable;

public class Ville implements Serializable{

	private static final long serialVersionUID = 1L;
	private String codePostal_;
	private String nom_;
	
	public Ville() {
		super();
	}
	
	public Ville(String codePostal, String nom){
		setCodePostal(codePostal);
		setNom(nom);
	}

	public String getCodePostal() {
		return codePostal_;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal_ = codePostal;
	}

	public String getNom() {
		return nom_;
	}

	public void setNom(String nom) {
		this.nom_ = nom;
	}
	
}
