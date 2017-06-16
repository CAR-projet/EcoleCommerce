package fr.spora.idao;

import fr.sopra.exception.WrongUsernameOrPasswordException;
import fr.sopra.model.Personne;
import fr.sopra.model.Test;

public interface ITestDao extends IDAO<Test, Integer>{

	public Personne findWithIdTest(int idTest); 	
	
}
