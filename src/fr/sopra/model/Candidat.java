package fr.sopra.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

public class Candidat extends Personne {
	
	
	@Entity
	@DiscriminatorValue("CANDIDAT")
	public Candidat() {
		// TODO Auto-generated constructor stub
		
		private static final long serialVersionUID = 1L;
		

		@Column(name="UTI_CLEACCES")
		@NotNull
		@Size(max=50)
		private String cleAcces;
		
		
		public String getCleAcces() {
			return cleAcces;
		}


		public void setCleAcces(String cleAcces) {
			this.cleAcces = cleAcces;
		}
		
		public Utilisateur(String cleAcces) {
		super();
			this.cleAcces = cleAcces;
}
	
}

