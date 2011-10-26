package tp2;

import java.io.Serializable;

public class PersonneV2 implements Serializable{

	private static final long serialVersionUID = 1L;
	private int age_;
	private String nom_;
	private float taille_;
	private Ville ville_;
	
	public PersonneV2(){
		super();
	}
	
	public PersonneV2(String nom, int age, float taille, Ville ville){
		nom_ = nom;
		age_ = age;
		taille_ = taille;
		setVille(ville);
	}

	public int getAge() {
		return age_;
	}

	public void setAge(int age) {
		this.age_ = age;
	}

	public String getNom() {
		return nom_;
	}

	public void setNom(String nom) {
		this.nom_ = nom;
	}

	public float getTaille() {
		return taille_;
	}

	public void setTaille(float taille) {
		this.taille_ = taille;
	}

	public Ville getVille() {
		return ville_;
	}

	public void setVille(Ville ville) {
		this.ville_ = ville;
	}
}
