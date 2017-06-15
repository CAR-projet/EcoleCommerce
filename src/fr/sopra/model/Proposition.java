package fr.sopra.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

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
	
	

	public Integer getIdProposition() {
		return idProposition;
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
