/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia.clases;

/**
 *
 * @author dam1
 */
public class Aula 
{
 private String CodAula;
 private int Capacidad;
    
    
    public Aula (String CodAula, int Capacidad)
    {
        this.CodAula = CodAula;
        this.Capacidad = Capacidad;
    }
    
    
    public String getCodAula()
    {
        return CodAula;
    }
    
    public void setCodAula(String CodAula)
    {
        this.CodAula = CodAula;
    }
    
    public int getCapacidad()
    {
        return Capacidad;
    }
    
    public void setCapacidad(int Capacidad)
    {
        this.Capacidad = Capacidad;
    }
}
