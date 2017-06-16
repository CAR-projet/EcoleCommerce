package fr.spora.idao;

import fr.sopra.model.Candidat;
import fr.sopra.model.Test;

public interface ITestDao extends IDAO<Test, Integer>{

	public Candidat findWithIdTest(int idTest); 	
	
}
