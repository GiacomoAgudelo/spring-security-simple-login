package security.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import security.dto.RequestLogin;
import security.service.UserService;

/*
 * In this class we have the login logic with the authentication
 */
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	AuthenticationManager authenticationManager;
	
	@Override
	public Authentication athenticationUser(RequestLogin requestLogin) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(requestLogin.getNome(), requestLogin.getPassword()));
		return authentication;
	}
}
