package Hibernate.src.fr.ifsic.jdbc.film;

import org.hibernate.Session;

public class MaPersonne extends Personne {
	
	public MaPersonne() {
		super();
	}
	
	@Override
	public String toString() {
		return "Personne [getP()=" + getP() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getSexe()=" + getSexe()
				+ "]";
	}
	
	public Personne detailsPersonne(Session session, Integer id){
		return (Personne) session.get(Personne.class, id);
	}
	
	
}
