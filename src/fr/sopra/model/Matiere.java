package fr.sopra.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "matiere")
//@Inheritance(strategy = InheritanceType.JOINED)
public class Matiere {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAT_ID")
	private Integer idMatiere;
	
	@Column(name = "MAT_NOM", nullable = false)
	private String nomMatiere;
	
	@OneToMany(mappedBy="matiere")
	private List<Questionnaire> questionnaires;

	
	/**
	 * @return the idMatiere
	 */
	public Integer getIdMatiere() {
		return idMatiere;
	}




	public List<Questionnaire> getQuestionnaires() {
		return questionnaires;
	}




	public void setQuestionnaires(List<Questionnaire> questionnaires) {
		this.questionnaires = questionnaires;
	}




	/**
	 * @param idMatiere the idMatiere to set
	 */
	public void setIdMatiere(Integer idMatiere) {
		this.idMatiere = idMatiere;
	}




	/**
	 * @return the nomMatiere
	 */
	public String getNomMatiere() {
		return nomMatiere;
	}




	/**
	 * @param nomMatiere the nomMatiere to set
	 */
	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}




	public Matiere() {
		// TODO Auto-generated constructor stub
	}

}
