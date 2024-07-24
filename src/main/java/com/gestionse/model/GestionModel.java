package com.gestionse.model;

import lombok.Data;


@Data
public class GestionModel {
    
    private String nombres;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getA_paterno() {
        return a_paterno;
    }

    public void setA_paterno(String a_paterno) {
        this.a_paterno = a_paterno;
    }

    public String getA_materno() {
        return a_materno;
    }

    public void setA_materno(String a_materno) {
        this.a_materno = a_materno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getC_u() {
        return c_u;
    }

    public void setC_u(String c_u) {
        this.c_u = c_u;
    }
    
    private String a_paterno;
    
    private String a_materno;
    
    private String correo;
    
    private String c_u;
    
}