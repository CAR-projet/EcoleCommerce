package fr.sopra.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends Personne {
	
	private static final long serialVersionUID = 1L;
	

	@Column(name="UTI_USERNAME")
	@NotNull
	@Size(max=50)
	private String username;
	
	@Column(name="UTI_PASSWORD")
	@NotNull
	@Size(max=50)
	private String password;


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	

		
	public Admin() {
		// TODO Auto-generated constructor stub
	}


}



	
