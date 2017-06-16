package fr.sopra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reponse")
@Inheritance(strategy = InheritanceType.JOINED)
public class Reponse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REP_ID")
	private Integer idReponse;
	
	@Column(name = "REP_TEMPSREP", nullable = false)
	private Integer tempsReponse;
	
	@Column(name = "REP_REPONSE", nullable = false)
	private String reponse;
	
	@ManyToOne
	@JoinColumn(name="REP_ID_TEST")
	private Test test;
	
	@OneToOne
	@JoinColumn(name="REP_ID_QUESTION")
	private Question question;
	
	
	/**
	 * @return the idReponse
	 */
	public Integer getIdReponse() {
		return idReponse;
	}



	public Test getTest() {
		return test;
	}



	public void setTest(Test test) {
		this.test = test;
	}



	public Question getQuestion() {
		return question;
	}



	public void setQuestion(Question question) {
		this.question = question;
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
