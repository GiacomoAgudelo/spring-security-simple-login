package security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import security.controllerInterface.UserControllerInterface;
import security.dto.RequestLogin;
import security.service.UserService;

@RestController
@RequestMapping(path = "user")
public class UserController implements UserControllerInterface {
	
	@Autowired
	UserService userService;

	@Override
	public ResponseEntity<?> login(RequestLogin loginRequest){
		return this.loginException(loginRequest);
	}
	
	private ResponseEntity<?> loginException(RequestLogin loginRequest)  {
		try {
			return ResponseEntity.ok(userService.athenticationUser(loginRequest));
		} catch (BadCredentialsException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body("Invalid credential");
		}
	}
}
