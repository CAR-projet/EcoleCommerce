package fr.sopra.model;

import javax.persistence.*;

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
	
	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
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
