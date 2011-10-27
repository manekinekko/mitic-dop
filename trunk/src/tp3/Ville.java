package tp3;

public class Ville {

	private String nom_;
	private String codePostal_;
	
	public Ville() {
	}

	public String getNom() {
		return nom_;
	}

	public void setNom(String nom) {
		this.nom_ = nom;
	}

	public String getCodePostal() {
		return codePostal_;
	}

	public void setCodePostal(String string) {
		this.codePostal_ = string;
	}

	@Override
	public String toString() {
		return "[nom=" + nom_ + ", codePostal=" + codePostal_ + "]";
	}
	
}
