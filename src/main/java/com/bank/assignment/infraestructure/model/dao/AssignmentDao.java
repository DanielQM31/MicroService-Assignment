package com.bank.assignment.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("assignment")
public class AssignmentDao {

    @Id
    private String id;                  //Código del Asignamiento
    private String idAccount;           //Código de Cuenta
    private String idClient;            //Código de Empresa
    private String type;                //Tipo de Usuario (Titular(T) o Firmante(F))

}
