package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService userDaoService;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@GetMapping("/users")
	public List<UserDTO> retrieveAllUsers() {
		List<User> users = userDaoService.findAll();
		List<UserDTO> userDTOs = convertToUserDTOList(users);
		return userDTOs;
		// return userDaoService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user = userDaoService.findOne(id);
		if (user == null) {
			throw new UserNotFoundException("id-"+id);
		}
		
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> creatUser(@Valid @RequestBody User user) {
		User savedUser = userDaoService.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedUser.getId())
			.toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		User deletedUser = userDaoService.deleteById(id);
		if (deletedUser==null) {
			throw new UserNotFoundException("id-" + id);
		}
	}
	
	private List<UserDTO> convertToUserDTOList(List<User> sourceList) {
		java.lang.reflect.Type listType = new TypeToken<List<UserDTO>>() {}.getType();
		return modelMapper.map(sourceList, listType);
	}

}
