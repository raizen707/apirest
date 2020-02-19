package com.udeo.apirest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.udeo.apirest.service.UserService;
import com.udeo.apirest.Entity.User;
//Indiciamos que es un controlador rest
@RestController
@RequestMapping("/demo") //esta sera la raiz de la url, es decir http://127.0.0.1:8080/api/

public class UserRestController {
	
	//Inyectamos el servicio para poder hacer uso de el
	@Autowired
	private UserService userService;

	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
	http://127.0.0.1:8080/api/users*/
	@GetMapping("/users")
	public List<User> findAll(){
		//retornará todos los usuarios
		return userService.findAll();
	}
	 
	
}