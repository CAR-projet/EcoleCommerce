package fr.sopra.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@DiscriminatorValue("CANDIDAT")
public class Candidat extends Personne {
	
	

	public Candidat() {}
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
		
	
}

