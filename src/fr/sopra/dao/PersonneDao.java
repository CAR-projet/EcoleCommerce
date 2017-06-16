package fr.sopra.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.sopra.exception.WrongUsernameOrPasswordException;
import fr.sopra.model.Admin;
import fr.sopra.model.Personne;
import fr.spora.idao.IPersonneDao;


@Repository("PersonneDao")
@Transactional
public class PersonneDao implements IPersonneDao
{
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Personne> findAll() {
		try {
			return this.entityManager.createQuery("from Personne", Personne.class).getResultList();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Personne find(String id) {
		try {
			return this.entityManager.find(Personne.class, id);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Personne save(Personne personne) {
		try {
			return this.entityManager.merge(personne);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return personne;
	}
	
	
	@Override
	public void delete(Personne personne) {
		try {
			this.entityManager.remove(this.entityManager.merge(personne));
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public Admin auth(String username, String password) throws WrongUsernameOrPasswordException {
		try {
			return this.entityManager.createQuery("from Admin u where u.username = :username AND u.password = :password", Admin.class)
					.setParameter("username", username)
					.setParameter("password", password)
					.getSingleResult();
		}
		
		catch (Exception e) {
			e.printStackTrace();
			throw new WrongUsernameOrPasswordException();
		}
	}
}