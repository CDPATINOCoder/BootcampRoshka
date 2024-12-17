package com.postulantes.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Postulante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String apellido;

    private int nroCedula;

    private String correo;

    private String telefono;

    private String direccion;

    private boolean experienciaLaboral;

    private boolean estudioUniversitario;

    private boolean notebook;

    private int bootcampId;

    private boolean aceptado;

    public Postulante() {
    }

    public Postulante(String nombre, String apellido, int nroCedula, String correo, String telefono, String direccion, boolean experienciaLaboral, boolean estudioUniversitario, boolean notebook, int bootcampId, boolean aceptado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroCedula = nroCedula;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.experienciaLaboral = experienciaLaboral;
        this.estudioUniversitario = estudioUniversitario;
        this.notebook = notebook;
        this.bootcampId = bootcampId;
        this.aceptado = aceptado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNroCedula() {
        return nroCedula;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public boolean getEstudioUniversitario() {
        return estudioUniversitario;
    }

    public boolean getNotebook() {
        return notebook;
    }

    public int getBootcampId() {
        return bootcampId;
    }

    public boolean getAceptado() {
        return aceptado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNroCedula(int nroCedula) {
        this.nroCedula = nroCedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setExperienciaLaboral(boolean experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public void setEstudioUniversitario(boolean estudioUniversitario) {
        this.estudioUniversitario = estudioUniversitario;
    }

    public void setNotebook(boolean notebook) {
        this.notebook = notebook;
    }

    public void setBootcampId(int bootcampId) {
        this.bootcampId = bootcampId;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }


}
