package fr.sopra.model;

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
	}

}
