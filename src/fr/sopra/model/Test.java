package fr.sopra.model;



import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Test {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="TES_ID")
		private Integer idTest;
		
		@Column(name="TES_NIVEAU")
		private NiveauTest niveau;
		
		@Column(name="TES_BRANCHE")
		private BrancheTest branche;
		
		@Column(name="TES_DATE")
		private Date date;

		@OneToMany(mappedBy="test")	
		private List<Questionnaire> questionnaires;
		
		
		@OneToMany(mappedBy="test")
		private List<Reponse> reponses;
		
		
		@OneToOne
		@JoinColumn(name="TES_ID_CANDIDAT")
		private Candidat candidat;
		
		
		
		
		public List<Questionnaire> getQuestionnaires() {
			return questionnaires;
		}

		public void setQuestionnaires(List<Questionnaire> questionnaires) {
			this.questionnaires = questionnaires;
		}

		public List<Reponse> getReponses() {
			return reponses;
		}

		public void setReponses(List<Reponse> reponses) {
			this.reponses = reponses;
		}

		public Candidat getCandidat() {
			return candidat;
		}

		public void setCandidat(Candidat candidat) {
			this.candidat = candidat;
		}

		public Integer getIdTest() {
			return idTest;
		}

		public void setIdTest(Integer idTest) {
			this.idTest = idTest;
		}

		public NiveauTest getNiveau() {
			return niveau;
		}

		public void setNiveau(NiveauTest niveau) {
			this.niveau = niveau;
		}

		public BrancheTest getBranche() {
			return branche;
		}

		public void setBranche(BrancheTest branche) {
			this.branche = branche;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
		
	
}
