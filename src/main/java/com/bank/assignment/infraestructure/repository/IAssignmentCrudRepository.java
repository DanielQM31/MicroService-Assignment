package com.bank.assignment.infraestructure.repository;

import com.bank.assignment.infraestructure.model.dao.AssignmentDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

//Interfaz para operaciones CRUD genéricas de Assignment.
public interface IAssignmentCrudRepository extends ReactiveCrudRepository<AssignmentDao, String> {



}
