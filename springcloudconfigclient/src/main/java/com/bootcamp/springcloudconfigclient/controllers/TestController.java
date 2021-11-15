package com.bootcamp.springcloudconfigclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
		
	@Value("${some.value}")
	private String myValue;
		
	@GetMapping(path="/myValue")
	public String myValue()
	{
		return this.myValue;
	}
	
	@Value("${spring.profiles.active:}")
	private String activeProfile;
	
	public String getPerfilActivo()
	{
		for (String nombreProfile: activeProfile.split(",")) 
		{
			return ("Perfil Activo: "+ nombreProfile);
		}
		return activeProfile;
	}
}
