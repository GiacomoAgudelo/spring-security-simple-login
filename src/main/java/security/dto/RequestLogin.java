package security.dto;

import org.springframework.stereotype.Component;

/*
 * Class used to login request
 */
@Component
public class RequestLogin {
	
	private String nome;
	private String password;
	
	public RequestLogin() {
		super();
	}
	
	public RequestLogin(String nome, String password) {
		super();
		this.nome = nome;
		this.password = password;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
