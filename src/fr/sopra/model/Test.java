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

import com.fasterxml.jackson.annotation.JsonIgnore;

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
