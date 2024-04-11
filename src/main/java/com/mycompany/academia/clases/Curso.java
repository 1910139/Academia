/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia.clases;

/**
 *
 * @author dam1
 */
public class Curso 
{
    private int CodCurso;
    private String NombreCurso;
    private int Duracion;
    
    public Curso (int CodCurso, String NombreCurso, int Duracion)
    {
        this.CodCurso = CodCurso;
        this.NombreCurso = NombreCurso;
        this.Duracion = Duracion;
    }

    public int getCodCurso()
    {   
        return CodCurso;
    }
    
    public void setCodCurso(int CodCurso)
    {
        this.CodCurso = CodCurso;
    }
    
    public String getNombreCurso()
    {
        return NombreCurso;
    }
    
    public void setNombreCurso(String NombreCurso)
    {
        this.NombreCurso = NombreCurso;
    }
    
    public int getDuracion()
    {
        return Duracion;
    }
    
    public void setDuracion(int Duracion)
    {
        this.Duracion = Duracion;
    }
}
