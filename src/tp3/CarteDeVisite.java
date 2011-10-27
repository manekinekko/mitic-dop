package tp3;

public class CarteDeVisite {

	private String nom_;
	private String id_;
	private String prenom_;
	private String organisme_;
	
	public CarteDeVisite() {
	}

	private Adresse adresse_;
	public Adresse getAdresse() {
		return adresse_;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse_ = adresse;
	}

	public String getNom() {
		return nom_;
	}

	public void setNom(String nom) {
		this.nom_ = nom;
	}

	public String getPrenom() {
		return prenom_;
	}

	public void setPrenom(String prenom) {
		this.prenom_ = prenom;
	}

	public String getOrganisme() {
		return organisme_;
	}

	public void setOrganisme(String organisme) {
		this.organisme_ = organisme;
	}


	public String getId() {
		return id_;
	}

	public void setId(String id) {
		this.id_ = id;
	}
	
	@Override
	public String toString() {
		return "Carte De Visite #"+id_+" [nom=" + nom_ + ", prenom=" + prenom_
				+ ", organisme=" + organisme_ + ", adresse=" + adresse_ + "]\n";
	}
}
