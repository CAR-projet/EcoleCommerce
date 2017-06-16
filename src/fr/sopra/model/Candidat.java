package fr.sopra.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;
@Entity
@DiscriminatorValue("CANDIDAT")
public class Candidat extends Personne {
	

	public Candidat() {}
		// TODO Auto-generated constructor stub
		
		private static final long serialVersionUID = 1L;
		

		@Column(name="CAN_CLEACCES")
		@Size(max=6)
		private String cleAcces;
	
		@OneToOne(mappedBy="candidat")
		private Test test;
		
			
		public String getCleAcces() {
			return cleAcces;
		}


		public void setCleAcces(String cleAcces) {
			this.cleAcces = cleAcces;
		}
		
	
}

