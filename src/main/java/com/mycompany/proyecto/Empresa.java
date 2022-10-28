/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Kristina
 */
public class Empresa {
    
    private String nombre; 
    private String ubicacion;
    private String tipoEmpresa;
  

    public Empresa(String nombre, String ubicacion, String tipoEmpresa) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipoEmpresa = tipoEmpresa;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }
    
    public String mostrarInfo(){
        return"\nTrabaja en la empresa " + this.nombre +" que esta ubicada en "
                + this.ubicacion +" y es una empresa de "+ this.tipoEmpresa;
    }
}
