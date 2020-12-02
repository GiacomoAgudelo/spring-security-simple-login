package security.service;

import org.springframework.security.core.Authentication;

import security.dto.RequestLogin;

public interface UserService {
	
	public Authentication athenticationUser(RequestLogin requestLogin);

}
