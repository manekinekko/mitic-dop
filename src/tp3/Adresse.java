package tp3;

public class Adresse {

	private String numero_;
	private Ville ville_;
	private Voie voie_;

	public Adresse() {
	}
	
	public String getNumero() {
		return numero_;
	}

	public void setNumero(String lastText_) {
		this.numero_ = lastText_;
	}

	public Ville getVille() {
		return ville_;
	}

	public void setVille(Ville ville) {
		this.ville_ = ville;
	}

	public Voie getVoie() {
		return voie_;
	}

	public void setVoie(Voie voie) {
		this.voie_ = voie;
	}

	@Override
	public String toString() {
		return "[numero=" + numero_ + ", ville=" + ville_
				+ ", voie=" + voie_ + "]";
	}

}
