package fr.sopra.model;

import java.io.Serializable;


@DiscriminatorColumn(name="TYPE_PERSONNE")
@Entity
@Table(name="personne")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Personne implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UTI_IDPERSONNE", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idPersonne;


	@Column(name="UTI_NOM")
	@NotNull
	@Size(max=50)
	private String nom;
	
	@Column(name="UTI_PRENOM")
	@NotNull
	@Size(max=50)
	private String prenom;

	/**
	 * @return the idPersonne
	 */
	public String getIdPersonne() {
		return idPersonne;
	}

	/**
	 * @param idPersonne the idPersonne to set
	 */
	public void setIdPersonne(String idPersonne) {
		this.idPersonne = idPersonne;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Utilisateur(String nom, String prenom, String idPersonne) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		
		
		
	}
	
}

