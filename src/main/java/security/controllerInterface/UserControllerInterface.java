package security.controllerInterface;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import security.dto.RequestLogin;

public interface UserControllerInterface {
	
	
	@PostMapping(path = "/login")
	public ResponseEntity<?> login(@RequestBody RequestLogin loginRequest);

}
