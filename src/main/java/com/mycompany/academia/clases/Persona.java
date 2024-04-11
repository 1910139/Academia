/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia.clases;

/**
 *
 * @author dam1
 */
public class Persona 
{
 private String nombre;
 private String nif;
 private int edad;
 private String direccion;
 private String email;
 private Localidad localidad;
 
 
    public Persona (String nombre, String NIF, int edad, String Direccion, String Email)
    {
       this.nombre = nombre;
       this.nif = NIF;
       this.edad = edad;
       this.direccion = Direccion;
       this.email = Email;

    }

       //Que significa param
        // los valores que se le dan a una funcion para que opere con ellos
    
       //Como hacer la herencia de profesor/alumno a persona

       //return the nombre

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
       

       
       

}
