package br.com.codevelopment.api.config.jwt;

import lombok.Data;

@Data
public class AccountCredentials {
	
	private String username;
	private String password;
}
