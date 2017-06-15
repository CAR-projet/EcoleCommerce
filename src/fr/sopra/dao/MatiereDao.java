package fr.sopra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.ascadis.model.Bloc;
import fr.spora.idao.IDAO;


@Repository("MatiereDao")
@Transactional
public class MatiereDao implements IDAO<Matiere, String>{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Matiere> findAll() {
		try {
			return this.entityManager.createQuery("from Matiere", Matiere.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Matiere find(Integer id) {
		try {
			return this.entityManager.find(Matiere.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Matiere save(Matiere matiere) {
		try {
			return this.entityManager.merge(matiere);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return matiere;
	}
	
	
	@Override
	public void delete(Matiere matiere) {
		try {
			this.entityManager.remove(this.entityManager.merge(matiere));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

