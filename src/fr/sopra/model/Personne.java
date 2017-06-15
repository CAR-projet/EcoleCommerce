package fr.sopra.model;

import java.io.Serializable;


@DiscriminatorColumn(name="TYPE_PERSONNE")
@Entity
@Table(name="personne")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Personne implements Serializable {


	private static final long serialVersionUID = 1L;


	@Column(name="UTI_NOM")
	@NotNull
	@Size(max=50)
	private String nom;
	
	@Column(name="UTI_PRENOM")
	@NotNull
	@Size(max=50)
	private String prenom;


	@Id
	@Column(name="UTI_ID", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

}

