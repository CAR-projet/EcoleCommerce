package fr.sopra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.ascadis.model.Bloc;
import fr.sopra.model.Test;
import fr.spora.idao.IDAO;
@Repository("TestDao")
@Transactional
public class TestDao implements IDAO<Test, String>{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Test> findAll() {
		try {
			return this.entityManager.createQuery("from Test", Test.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Test find(Integer id) {
		try {
			return this.entityManager.find(Test.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Test save(Test test) {
		try {
			return this.entityManager.merge(test);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return test;
	}
	
	
	@Override
	public void delete(Test test) {
		try {
			this.entityManager.remove(this.entityManager.merge(test));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
