package com.bank.assignment.application.impl;

import com.bank.assignment.application.AssignmentOperations;
import com.bank.assignment.application.model.AssignmentRepository;
import com.bank.assignment.domain.Assignment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//Implementación de las operaciones Assignment.
@Service
@RequiredArgsConstructor
public class AssignmentOperationsImpl implements AssignmentOperations {

    private final AssignmentRepository repository;

    //Listado
    @Override
    public Flux<Assignment> findAll() {
        return repository.findAll();
    }

    //Listado por ID
    @Override
    public Mono<Assignment> findById(String id) {
        return repository.findById(id);
    }

    //Agregar
    @Override
    public Mono<Assignment> save(Assignment assignment) {
        return repository.save(assignment);
    }

    //Editar
    @Override
    public Mono<Assignment> update(String id, Assignment assignment) {
        return repository.update(id, assignment);
    }

    //Eliminar
    @Override
    public Mono<Void> delete(String id) {
        return repository.delete(id);
    }
}
