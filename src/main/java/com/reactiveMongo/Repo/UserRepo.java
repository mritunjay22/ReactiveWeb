package com.reactiveMongo.Repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import org.springframework.stereotype.Repository;

import com.reactiveMongo.Entity.User;

import reactor.core.publisher.Mono;

@Repository       // This denotte that this class is a repository class
public interface UserRepo extends ReactiveMongoRepository<User,Long> {

	public Mono<User> findByname(String name);
}
