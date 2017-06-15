package fr.sopra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.ascadis.model.Bloc;
import fr.spora.idao.IDAO;
@Repository("QuestionnaireDao")
@Transactional
public class QuestionnaireDao implements IDAO<Questionnaire, String>{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Questionnaire> findAll() {
		try {
			return this.entityManager.createQuery("from Questionnaire", Questionnaire.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Questionnaire find(Integer id) {
		try {
			return this.entityManager.find(Questionnaire.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Questionnaire save(Questionnaire questionnaire) {
		try {
			return this.entityManager.merge(questionnaire);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return questionnaire;
	}
	
	
	@Override
	public void delete(Questionnaire questionnaire) {
		try {
			this.entityManager.remove(this.entityManager.merge(questionnaire));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

}
