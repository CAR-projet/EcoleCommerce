package fr.sopra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "forme")
@Inheritance(strategy = InheritanceType.JOINED)
public class Reponse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FORME_IDREPONSE")
	private Integer idReponse;
	
	@Column(name = "FORME_TEMPSREPONSE", nullable = false)
	private Integer tempsReponse;
	
	@Column(name = "FORME_REPONSE", nullable = false)
	private String reponse;
	
	
	
	/**
	 * @return the idReponse
	 */
	public Integer getIdReponse() {
		return idReponse;
	}



	/**
	 * @param idReponse the idReponse to set
	 */
	public void setIdReponse(Integer idReponse) {
		this.idReponse = idReponse;
	}



	/**
	 * @return the tempsReponse
	 */
	public Integer getTempsReponse() {
		return tempsReponse;
	}



	/**
	 * @param tempsReponse the tempsReponse to set
	 */
	public void setTempsReponse(Integer tempsReponse) {
		this.tempsReponse = tempsReponse;
	}



	/**
	 * @return the reponse
	 */
	public String getReponse() {
		return reponse;
	}



	/**
	 * @param reponse the reponse to set
	 */
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	


	public Reponse() {
	
	}

}
