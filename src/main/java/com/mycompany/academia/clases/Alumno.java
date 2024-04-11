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
public class Alumno extends Persona{
    private int NRE;
    
    private ArrayList<Matricula> matriculas;
    
    public Alumno (String nombre, String NIF, int edad, String Direccion, String Email, int NRE)
    {
        super(nombre,NIF,edad,Direccion,Email);
        this.NRE = NRE; 
    }
    
    public int getNRE()
    {
        return NRE;
    }
    
    public void setNRE (int NRE)
    {
        this.NRE = NRE;
    }

    
    //pasar datos entre clases
    //ponemos "private ArrayList<nombre clase> nombre clase;
        //EJ: private ArrayList<Matricula> matriculas;
    //en el public clases añadimos tambien los atributos necesarios
        //EJ: public Alumno (String nombre, String NIF, int edad, String Direccion, String Email, int NRE)
    
    
    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    
    
    
}
