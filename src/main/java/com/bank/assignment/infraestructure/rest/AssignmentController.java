package com.bank.assignment.infraestructure.rest;

import com.bank.assignment.application.AssignmentOperations;
import com.bank.assignment.domain.Assignment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//Controlador Rest
@Slf4j
@RestController
@RequestMapping("/assignments")
@RequiredArgsConstructor
public class AssignmentController {

    private final AssignmentOperations assignmentOperations;

    //Anotación para obtener todos los registros.
    @GetMapping
    public Flux<Assignment> get() {
        return assignmentOperations.findAll();
    }

    //Anotación para obtener registro por Código.
    @GetMapping("/{id}")
    public Mono<Assignment> getId(@PathVariable String id) {
        return assignmentOperations.findById(id);
    }

    //Anotación para agregar registros.
    @PostMapping("/add")
    public Mono<Assignment> post(@RequestBody Assignment assignment){
        return assignmentOperations.save(assignment);
    }

    //Anotación para editar los registros.
    @PutMapping("/{id}")
    public Mono<Assignment> put(@PathVariable String id, @RequestBody Assignment assignment){
        return assignmentOperations.update(id, assignment);
    }

    //Anotación para eliminar registros.
    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return assignmentOperations.delete(id);
    }

}
