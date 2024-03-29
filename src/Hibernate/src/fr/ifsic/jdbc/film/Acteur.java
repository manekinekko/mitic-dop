package Hibernate.src.fr.ifsic.jdbc.film;

// Generated 2 d�c. 2011 08:34:14 by Hibernate Tools 3.4.0.CR1

/**
 * Acteur generated by hbm2java
 */
public class Acteur implements java.io.Serializable {

	private int p;
	private Personne personne;
	private String nbFilm;

	public Acteur() {
	}

	public Acteur(Personne personne) {
		this.personne = personne;
	}

	public Acteur(Personne personne, String nbFilm) {
		this.personne = personne;
		this.nbFilm = nbFilm;
	}

	public int getP() {
		return this.p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public String getNbFilm() {
		return this.nbFilm;
	}

	public void setNbFilm(String nbFilm) {
		this.nbFilm = nbFilm;
	}

}
