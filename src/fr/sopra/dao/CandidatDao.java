package fr.sopra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.ascadis.model.Candidat;
import fr.spora.idao.IDAO;


@Repository("CandidatDao")
@Transactional
public class CandidatDao implements IDAO<Candidat, String>{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Candidat> findAll() {
		try {
			return this.entityManager.createQuery("from Candidat", Candidat.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Candidat find(Integer id) {
		try {
			return this.entityManager.find(Candidat.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Candidat save(Candidat candidat) {
		try {
			return this.entityManager.merge(candidat);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return candidat;
	}
	
	
	@Override
	public void delete(Candidat candidat) {
		try {
			this.entityManager.remove(this.entityManager.merge(candidat));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
