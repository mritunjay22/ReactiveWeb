package com.reactiveMongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//Service Class

@Service
public class UserService {

	@Autowired
	private  UserRepo userRepository;
	
	
	//Service Methods 
	
	
	//Find All Method  //Flux
	public Flux<User> findAll(){
		return userRepository.findAll();
	}
	
	
	//Mono FInd By ID
	public Mono<User> findById(String id){
		return userRepository.findById(id);
	}
	
	
	//MOno Create User
	public Mono<User> createUser(User entity){
		return userRepository.save(entity);
	}
	
	
	//Delete User
	public Mono<Void> deleteUserById(String id){
		
//		return userRepository.findById(id)
//		.flatMap(t -> userRepository.deleteById(id).thenReturn(t) );  //Doubt
		return userRepository.deleteById(id);
	}
	
	//Add Multiple User
	public Flux<User> addMultipleUser(List<User> users){
		return userRepository.saveAll(users);
	}
	
	//Update User
	public Mono<User> updateUser(User user ){
		return userRepository.save(user);
		
	}
	
	//Find User By Name
	public Mono<User> findByName(String name){
		
	return userRepository.findByname(name)	;
	}
	
}
