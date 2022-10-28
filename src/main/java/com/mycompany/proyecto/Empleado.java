/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Kristina
 */
public class Empleado {

    private String nombre;
    private String cedula;
    private String cargo;
    private int yearIngreso;
    private Departamento departamento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getYearIngreso() {
        return yearIngreso;
    }

    public void setYearIngreso(int yearIngreso) {
        this.yearIngreso = yearIngreso;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int antiguedad() {
        var yearActual = 2022;
        var retorno = yearActual - yearIngreso;
        return retorno;
    }

    public Empleado(String nombre, String cedula, int yearIngreso, String cargo, Departamento departamento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.yearIngreso = yearIngreso;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String mostrarInfo() {
        return "\nEl nombre del trabajador es " + nombre + " y su cedula es "
                + cedula + " ingreso en el año " + yearIngreso + " trabaja de " 
                + cargo + " y trabaja en el departamento de " + this.getDepartamento().getNombre() ;
                              
              
    }
     }
