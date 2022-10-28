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

    private String cedula;
    private String nombre;
    private String cargo;
    private int yearIngreso;
    private Departamento departamento;

    public Empleado(String cedula, String nombre, String cargo, int yearIngreso, Departamento departamento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.yearIngreso = yearIngreso;
        this.departamento = departamento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String mostrarInfo() {
        return "\n*El nombre del empleado es " + this.nombre + " su cedula es "
                + this.cedula + " es " + this.cargo+ " y trabaja durante "+ antiguedad() +" años";
    }

}
