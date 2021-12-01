package com.bank.assignment.domain;

import lombok.Data;

@Data
public class Assignment {

    private String id;                  //Código del Asignamiento
    private String idAccount;           //Código de Cuenta
    private String idClient;            //Código de Empresa
    private String type;                //Tipo de Usuario (Titular(T) o Firmante(F))

}
