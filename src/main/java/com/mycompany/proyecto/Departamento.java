/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Kristina
 */
public class Departamento {
    private String codigo;
    private String nombre;
    private int numeroTrabajadores;
  

    public Departamento(String codigo,String nombre, int numeroTrabajadores) {
        this.codigo = codigo;
        this.nombre=nombre;
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }
    
    public String mostrarInfo(){
        return"\nEl nombre del departamento es " + this.nombre +" y su codigo es "
                + this.codigo +" y tiene "+ this.numeroTrabajadores+" trabajadores.";
    }
    
    
    
}
