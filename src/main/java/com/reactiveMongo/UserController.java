package com.reactiveMongo;


import java.util.List;


import org.reactivestreams.Publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;


import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

  


@RestController
public class UserController {
	
	@Autowired
	private UserService service;

	@RequestMapping(method= RequestMethod.GET,value="/test")
	public Flux<Integer> test(){
		return Flux.just(1,2,3,4,5,6);
	}

	//To Get All User
	
	
//	@GetMapping(value = "/user", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	//@ResponseBody
	@RequestMapping(method= RequestMethod.GET,value="/user",produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<User> getAll(){
		return service.findAll().log();
	}
	
	//Get User By Id
	@RequestMapping(method = RequestMethod.GET,value="/user/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Publisher<User> getUserById(@PathVariable String id){
		return service.findById(id);	
	}
	
	
	//Create USer
	@RequestMapping(method = RequestMethod.POST,value="/user",produces = MediaType.APPLICATION_JSON_VALUE)
	public Publisher<User> createUser(@RequestBody User user){
		return service.createUser(user);
	}
	
	//Delete User By Id
	@RequestMapping(method = RequestMethod.DELETE,value = "/user/{deleteId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Publisher<Void>  deleteUserById(@PathVariable String deleteId){
		return service.deleteUserById(deleteId);			
	}
	
	
	//Add Multiple User
	@RequestMapping(method = RequestMethod.POST,value="/user/multiple",produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<User> addMultipleUser(@RequestBody List<User> user){
		return service.addMultipleUser(user);
		
	}
	
	//Update User
	@RequestMapping(method = RequestMethod.PUT,value = "/user/update",produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<User> updateUser(@RequestBody User user){
		return service.updateUser(user);
		
	}
	
	//Find User By Name
	@RequestMapping(method = RequestMethod.GET, value="/user/name/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<User> findByName(@PathVariable String name){
		return service.findByName(name);
	}
	
	
	
	
	
	
	
	
	
}
