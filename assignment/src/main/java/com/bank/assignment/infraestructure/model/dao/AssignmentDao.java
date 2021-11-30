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
    private String idBusiness;          //Código de Empresa
    private String idUser;              //Código de Usuario
    private String userType;            //Tipo de Usuario (Titular(T) o Firmante(F))

}
