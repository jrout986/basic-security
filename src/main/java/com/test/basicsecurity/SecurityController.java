package com.test.basicsecurity;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	@GetMapping("/home")
	public Principal renderHome(Principal principal) {
		return principal;
	}
}
