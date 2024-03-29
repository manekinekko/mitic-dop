package Hibernate.src.fr.ifsic.jdbc.film;

// Generated 2 d�c. 2011 08:34:14 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Film generated by hbm2java
 */
public class Film implements java.io.Serializable {

	private Integer f;
	private Personne personne;
	private String titre;
	private String annee;
	private String genre;
	private String duree;
	private Set<Vedette> vedettes = new HashSet<Vedette>(0);

	public Film() {
	}

	public Film(Personne personne, String titre) {
		this.personne = personne;
		this.titre = titre;
	}

	public Film(Personne personne, String titre, String annee, String genre,
			String duree, Set<Vedette> vedettes) {
		this.personne = personne;
		this.titre = titre;
		this.annee = annee;
		this.genre = genre;
		this.duree = duree;
		this.vedettes = vedettes;
	}

	public Integer getF() {
		return this.f;
	}

	public void setF(Integer f) {
		this.f = f;
	}

	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAnnee() {
		return this.annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDuree() {
		return this.duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public Set<Vedette> getVedettes() {
		return this.vedettes;
	}

	public void setVedettes(Set<Vedette> vedettes) {
		this.vedettes = vedettes;
	}

}
