package fr.sopra.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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

	
}

