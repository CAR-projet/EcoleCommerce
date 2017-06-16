package fr.spora.idao;

import fr.sopra.exception.WrongUsernameOrPasswordException;
import fr.sopra.model.Admin;
import fr.sopra.model.Personne;


public interface IPersonneDao extends IDAO<Personne, String>
{
	public Admin auth(String username, String password) throws WrongUsernameOrPasswordException; 	
}
