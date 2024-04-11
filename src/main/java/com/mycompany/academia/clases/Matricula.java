/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia.clases;

import java.util.Calendar;

/**
 *
 * @author dam1
 */
public class Matricula 
{
  private String CodMatricula;
  private Calendar FechaApertura;
  private Calendar FechaCierre;
  private Calendar InicioCurso;
  private Calendar FinCurso;
  private int MinAlumnos;
  private Curso curso;
  private Aula aula;
  
  
  
    public Matricula (String CodMatricula, Calendar FechaApertura, Calendar FechaCierre, Calendar InicioCurso, Calendar FinCurso, int MinAlumnos)
    {
      this.CodMatricula = CodMatricula;
      this.FechaApertura = FechaApertura;
      this.FechaCierre = FechaCierre;
      this.InicioCurso = InicioCurso;
      this.FinCurso = FinCurso;
      this.MinAlumnos = MinAlumnos;   
    }

    public String getCodMatricula() {
        return CodMatricula;
    }

    public void setCodMatricula(String CodMatricula) {
        this.CodMatricula = CodMatricula;
    }

    public Calendar getFechaApertura() {
        return FechaApertura;
    }

    public void setFechaApertura(Calendar FechaApertura) {
        this.FechaApertura = FechaApertura;
    }

    public Calendar getFechaCierre() {
        return FechaCierre;
    }

    public void setFechaCierre(Calendar FechaCierre) {
        this.FechaCierre = FechaCierre;
    }

    public Calendar getInicioCurso() {
        return InicioCurso;
    }

    public void setInicioCurso(Calendar InicioCurso) {
        this.InicioCurso = InicioCurso;
    }

    public Calendar getFinCurso() {
        return FinCurso;
    }

    public void setFinCurso(Calendar FinCurso) {
        this.FinCurso = FinCurso;
    }

    public int getMinAlumnos() {
        return MinAlumnos;
    }

    public void setMinAlumnos(int MinAlumnos) {
        this.MinAlumnos = MinAlumnos;
    }

    public Curso getCurso() {
        return curso;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    
    
    
    
    
}
