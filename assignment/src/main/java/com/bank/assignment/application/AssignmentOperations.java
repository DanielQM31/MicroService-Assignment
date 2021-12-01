package com.bank.assignment.application;

import com.bank.assignment.domain.Assignment;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//Operaciones con las que se va a trabajar Assignment.
public interface AssignmentOperations {

    public Flux<Assignment> findAll();
    public Mono<Assignment> findById(String id);
    public Mono<Assignment> save(Assignment assignment);
    public Mono<Assignment> update(String id, Assignment assignment);
    public Mono<Void> delete(String id);

}
