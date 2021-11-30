package com.bank.assignment.domain;

import lombok.Data;

@Data
public class Assignment {

    private String id;                  //Código del Asignamiento
    private String idAccount;           //Código de Cuenta
    private String idBusiness;          //Código de Empresa
    private String idUser;              //Código de Usuario
    private String userType;            //Tipo de Usuario (Titular(T) o Firmante(F))

}
