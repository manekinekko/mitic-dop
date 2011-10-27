package tp3;

public class Voie {

	private String type_;
	private String nom_;
	
	public Voie() {
	}

	public String getNom() {
		return nom_;
	}

	public void setNom(String nom) {
		this.nom_ = nom;
	}

	public String getType() {
		return type_;
	}

	public void setType(String type) {
		this.type_ = type;
	}

	@Override
	public String toString() {
		return "[type=" + type_ + ", nom=" + nom_ + "]";
	}

}
