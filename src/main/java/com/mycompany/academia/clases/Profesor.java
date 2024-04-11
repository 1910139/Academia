/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia.clases;

import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class Profesor extends Persona{
 private String ID;
 private Double Sueldo;
 private String Especialidad;
 
 private ArrayList<Matricula> matriculas;
    
    
    public Profesor (String nombre, String NIF, int edad, String Direccion, String Email, String ID, Double Sueldo, String Especialidad)
    {
        super(nombre,NIF,edad,Direccion,Email);
        this.ID = ID;
        this.Sueldo = Sueldo;
        this.Especialidad = Especialidad;          
    }
    
    public String getID()
    {
        return ID;
    }
    
    public void setID(String ID)
    {
        this.ID = ID;
    }
    
    public Double getSueldo()
    {
        return Sueldo;
    }
    
    public void setSueldo(Double Sueldo)
    {
        this.Sueldo = Sueldo;
    }
    
    public String getEspecialidad()
    {
        return Especialidad;
    }
    
    public void setEspecialidad(String Especialidad)
    {
        this.Especialidad = Especialidad;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
    
    
    
    
    
    
    
    
    
}

