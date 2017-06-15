package fr.sopra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.ascadis.model.Proposition;
import fr.spora.idao.IDAO;
@Repository("PropositionDao")
@Transactional
public class PropositionDao implements IDAO<Proposition, String>{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Proposition> findAll() {
		try {
			return this.entityManager.createQuery("from Proposition", Proposition.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Proposition find(Integer id) {
		try {
			return this.entityManager.find(Proposition.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Proposition save(Proposition proposition) {
		try {
			return this.entityManager.merge(proposition);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return proposition;
	}
	
	
	@Override
	public void delete(Proposition proposition) {
		try {
			this.entityManager.remove(this.entityManager.merge(proposition));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

