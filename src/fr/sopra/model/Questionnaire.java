package fr.sopra.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="questionnaire")
public class Questionnaire {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="QUESTA_ID")
	private Integer idQuestionnaire;
	
	@Column(name="QUESTA_DUREE")
	private Integer duree;
	
	@Column(name="QUESTA_TITRE")
	private String titre;
	
	@OneToMany(mappedBy="questionnaire")
	private List<Question> questions;

	@ManyToOne
	@JoinColumn(name="QUESTO_ID_TEST")
	private Test test;
	
	@ManyToOne
	@JoinColumn(name="QUESTO_ID_MAT")
	private Matiere matiere;
	
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}



	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Integer getIdQuestionnaire() {
		return idQuestionnaire;
	}



	public void setIdQuestionnaire(Integer idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
	}



	public Integer getDuree() {
		return duree;
	}



	public void setDuree(Integer duree) {
		this.duree = duree;
	}



	@Override
	public String toString() {
		return "Questionnaire [idQuestionnaire=" + idQuestionnaire + ", duree=" + duree + ", titre=" + titre + "]";
	}



	public Questionnaire() {
		
	}

}
