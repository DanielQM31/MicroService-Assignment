package com.bank.assignment.infraestructure.repository;

import com.bank.assignment.application.model.AssignmentRepository;
import com.bank.assignment.domain.Assignment;
import com.bank.assignment.infraestructure.model.dao.AssignmentDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class AssignmentCrudRepository implements AssignmentRepository {

    @Autowired
    IAssignmentCrudRepository repository;

    @Override
    public Flux<Assignment> findAll() {
        return repository.findAll()
                .map(this::mapAssignmentDaoToAssignment);
    }

    @Override
    public Mono<Assignment> findById(String id) {
        return repository.findById(id)
                .map(this::mapAssignmentDaoToAssignment);
    }

    @Override
    public Mono<Assignment> save(Assignment assignment) {
        return repository.save(mapAssignmentToAssignmentDao(assignment))
                .map(this::mapAssignmentDaoToAssignment);
    }

    @Override
    public Mono<Assignment> update(String id, Assignment assignment) {
        return repository.save(mapAssignmentToAssignmentDao(assignment))
                .map(this::mapAssignmentDaoToAssignment);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    private Assignment mapAssignmentDaoToAssignment(AssignmentDao assignmentDao){
        Assignment assignment = new Assignment();
        BeanUtils.copyProperties(assignmentDao, assignment);
        return assignment;
    }

    private AssignmentDao mapAssignmentToAssignmentDao(Assignment assignment){
        AssignmentDao assignmentDao = new AssignmentDao();
        BeanUtils.copyProperties(assignment, assignmentDao);
        return assignmentDao;
    }

}
