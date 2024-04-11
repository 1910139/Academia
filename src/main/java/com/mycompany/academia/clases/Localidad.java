/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia.clases;

/**
 *
 * @author dam1
 */
public class Localidad 
{
 private int CodPostal;
 private String NombreLocalidad;
 private int NumHabitantes;

 
    public Localidad (int CodPostal, String NombreLocalidad, int NumHabitantes)
    {
        this.CodPostal = CodPostal;
        this.NombreLocalidad = NombreLocalidad;
        this.NumHabitantes = NumHabitantes;
    }

    public int getCodPostal()
    {
        return CodPostal;
    }

    public void setCodPostal(int CodPostal)
    {
        this.CodPostal = CodPostal;
    }

    public String getNombreLocalidad()
    {
        return NombreLocalidad;
    }

    public void setNombreLocalidad(String NombreLocalidad)
    {
        this.NombreLocalidad = NombreLocalidad;
    }

    public int getNumHabitantes()
    {
        return NumHabitantes;
    }

    public void setNumHabitantes(int NumHabitantes)
    {
        this.NumHabitantes = NumHabitantes;
    }
 
}
