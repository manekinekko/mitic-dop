package tp2;

import java.io.Serializable;

public class Personne implements Serializable{

	private static final long serialVersionUID = 1L;
	private int age_;
	private String nom_;
	private float taille_;
	
	public Personne(){
		super();
	}
	
	public Personne(String nom, int age, float taille){
		nom_ = nom;
		age_ = age;
		taille_ = taille;
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
}
