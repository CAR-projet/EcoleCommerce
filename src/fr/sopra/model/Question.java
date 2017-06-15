package fr.sopra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name="question")
public class Question {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QUESTO_ID")
	private Integer idQuestion;
	
	
	@Column(name="QUESTO_ID")
	@NotBlank
	private String intitule;
	
	
	@Column(name="QUESTO_ID")
	@NotBlank
	private Integer numeroQuestion;
	
	
	
	
	public Integer getIdQuestion() {
		return idQuestion;
	}



	public void setIdQuestion(Integer idQuestion) {
		this.idQuestion = idQuestion;
	}



	public String getIntitule() {
		return intitule;
	}



	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}



	public Integer getNumeroQuestion() {
		return numeroQuestion;
	}



	public void setNumeroQuestion(Integer numeroQuestion) {
		this.numeroQuestion = numeroQuestion;
	}


	public Question() {}

	
}
