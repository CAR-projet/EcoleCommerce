package fr.sopra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="proposition")
public class Proposition {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PRO_ID")
	private Integer idProposition;
	
	@Column(name="PRO_CORRECT")
	@NotBlank
	private Boolean isCorrect;
	
	@Column(name="PRO_NUM")
	@NotBlank
	private char numeroProposition;
	
	@Column(name="PRO_IDQUESTO")
	@NotBlank
	private Integer idProposQuestion;
	
	@ManyToOne
	@JoinColumn(name="PRO_ID_QUESTO")
	private Question question;

	
	public Integer getIdProposition() {
		return idProposition;
	}




	public Integer getIdProposQuestion() {
		return idProposQuestion;
	}




	public void setIdProposQuestion(Integer idProposQuestion) {
		this.idProposQuestion = idProposQuestion;
	}




	public Question getQuestion() {
		return question;
	}




	public void setQuestion(Question question) {
		this.question = question;
	}




	public void setIdProposition(Integer idProposition) {
		this.idProposition = idProposition;
	}




	public Boolean getIsCorrect() {
		return isCorrect;
	}




	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}




	public char getNumeroProposition() {
		return numeroProposition;
	}




	public void setNumeroProposition(char numeroProposition) {
		this.numeroProposition = numeroProposition;
	}




	public Proposition() {	
		
	}

}
