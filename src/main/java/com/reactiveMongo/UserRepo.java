package com.reactiveMongo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

@Repository       // This denotte that this class is a repository class
public interface UserRepo extends ReactiveMongoRepository<User,String> {

	public Mono<User> findByname(String name);
}
