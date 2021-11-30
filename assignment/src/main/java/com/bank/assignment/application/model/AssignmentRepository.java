package com.bank.assignment.application.model;

import com.bank.assignment.domain.Assignment;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AssignmentRepository {

    public Mono<Assignment> getId(String id);
    public Flux<Assignment> getAll();
    public Mono<Assignment> save(Assignment assignment);
    public Mono<Assignment> update(String id, Assignment assignment);
    public Mono<Void> delete(String id);

}
