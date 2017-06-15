package fr.sopra.model;

@Entity
@Table(name = "forme")
@Inheritance(strategy = InheritanceType.JOINED)
public class Reponse {

	@id
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
