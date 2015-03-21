package br.fucapi.psi.szone.modelo.vo;

import java.util.Date;

public class Usuario {

	private String name;
	private String user;
	private String password;
	private String cpf;
	private Date birthdate;
	private String email;
	
	public Usuario(String name, String user, String password, String cpf, Date birthDate, String email){
		this.name = name;
		this.user = user;
		this.password = password;
		this.cpf = cpf;
		this.birthdate = birthDate;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
