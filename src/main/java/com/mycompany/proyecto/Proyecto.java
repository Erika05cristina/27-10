/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Kristina
 */
public class Proyecto {

    public static void main(String[] args) {

        var pyca = new Empresa("Pyca", "Cuenca", "Plasticos");
        var toyota = new Empresa("Toyota", "Guayaquil", "Autos");
        var italiana = new Empresa("La Italiana", "Quito", "Embutidos");
        var nike = new Empresa("Nike", "USA", "Zapatos");
        var papelesa = new Empresa("Papelesa", "Cuenca", "Papeleria");
        var samsung = new Empresa("Samsung", "Rusia", "Celulares");

        var bodega = new Departamento("5638", "Bodega",
                3, pyca);
        var secretaria = new Departamento("74479", "Secretaria",
                3, toyota);
        var gerencia = new Departamento("4562", "Gerencia",
                1, italiana);
        var atencionCliente = new Departamento("318", "atencionCliente",
                4, nike);
        var limpieza = new Departamento("72392", "Limpieza",
                8, papelesa);
        var supervicion = new Departamento("1237", "Supervicion",
                3, samsung);

        var cesar = new Empleado("Cesar Sarmiento ", "091737788", 2009, "Secretario", secretaria);
        var pedro = new Empleado("Pedro Velez", "019749532", 2019, "Secretario", secretaria);
        var erika = new Empleado("Erika Villa", "010567124", 2017, "Gerente", gerencia);
        var jonnathan = new Empleado("Jonnathan Saquicela ", "010567124", 2011, "Atencion al Cliente", atencionCliente);
        var ana = new Empleado("Ana Alvarez", "0103984813", 2021, "Supervisora", supervicion);
        var jose = new Empleado("Jose Marquez", "0106424379", 2020, "Bodega", bodega);

        

        System.out.println(jose.mostrarInfo() + toyota.mostrarInfo() + bodega.mostrarInfo());
        System.out.println(pedro.mostrarInfo() + italiana.mostrarInfo() + secretaria.mostrarInfo());
        System.out.println(erika.mostrarInfo() + nike.mostrarInfo() + gerencia.mostrarInfo());
        System.out.println(jonnathan.mostrarInfo() + samsung.mostrarInfo() + atencionCliente.mostrarInfo());
        System.out.println(cesar.mostrarInfo() + pyca.mostrarInfo() + limpieza.mostrarInfo());
        System.out.println(ana.mostrarInfo() + papelesa.mostrarInfo() + supervicion.mostrarInfo());
       
        System.out.println("\n*****************************************");
        System.out.println("\n*El nombre del empleado es " + jose.getNombre()
                + " su cedula es " + jose.getCedula() + " es " + jose.getCargo()
                + " y trabaja durante " + jose.antiguedad() + " años" + "\nTrabaja en la empresa "
                + toyota.getNombre() + " que esta ubicada en " + toyota.getUbicacion()
                + " y es una empresa de " + toyota.getTipoEmpresa()
                + "\nEl nombre del departamento es " + bodega.getNombre() + " y su codigo es "
                + bodega.getCodigo() + " y tiene " + bodega.getNumeroTrabajadores()
                + " trabajadores.");

        System.out.println("\n*El nombre del empleado es " + pedro.getNombre()
                + " su cedula es " + pedro.getCedula() + " es " + pedro.getCargo()
                + " y trabaja durante " + pedro.antiguedad() + " años"
                + "\nTrabaja en la empresa " + italiana.getNombre() + " que esta ubicada en "
                + italiana.getUbicacion() + " y es una empresa de " + italiana.getTipoEmpresa()
                + "\nEl nombre del departamento es " + secretaria.getNombre() + " y su codigo es "
                + secretaria.getCodigo() + " y tiene " + secretaria.getNumeroTrabajadores()
                + " trabajadores.");

        System.out.println("\n*El nombre del empleado es " + erika.getNombre()
                + " su cedula es " + erika.getCedula() + " y es " + erika.getCargo()
                + " y trabaja durante " + erika.antiguedad() + " años"
                + "\nTrabaja en la empresa " + nike.getNombre() + " que esta ubicada en "
                + nike.getUbicacion() + " y es una empresa de " + nike.getTipoEmpresa()
                + "\nEl nombre del departamento es " + gerencia.getNombre() + " y su codigo es "
                + gerencia.getCodigo() + " y tiene " + gerencia.getNumeroTrabajadores()
                + " trabajadores.");

        System.out.println("\n*El nombre del empleado es " + jonnathan.getNombre()
                + " su cedula es " + jonnathan.getCedula() + " y es " + jonnathan.getCargo()
                + " y trabaja durante " + jonnathan.antiguedad() + " años"
                + "\nTrabaja en la empresa " + samsung.getNombre() + " que esta ubicada en "
                + samsung.getUbicacion() + " y es una empresa de " + samsung.getTipoEmpresa()
                + "\nEl nombre del departamento es " + atencionCliente.getNombre() + " y su codigo es "
                + atencionCliente.getCodigo() + " y tiene " + atencionCliente.getNumeroTrabajadores()
                + " trabajadores.");

        System.out.println("\n*El nombre del empleado es " + cesar.getNombre()
                + " su cedula es " + cesar.getCedula() + " y es " + cesar.getCargo()
                + " y trabaja durante " + cesar.antiguedad() + " años"
                + "\nTrabaja en la empresa " + pyca.getNombre() + " que esta ubicada en "
                + italiana.getUbicacion() + " y es una empresa de " + pyca.getTipoEmpresa()
                + "\nEl nombre del departamento es " + limpieza.getNombre() + " y su codigo es "
                + limpieza.getCodigo() + " y tiene " + limpieza.getNumeroTrabajadores()
                + " trabajadores.");

        System.out.println("\n*El nombre del empleado es " + ana.getNombre()
                + " su cedula es " + ana.getCedula() + " y es " + ana.getCargo()
                + " y trabaja durante " + ana.antiguedad() + " años"
                + "\nTrabaja en la empresa " + papelesa.getNombre() + " que esta ubicada en "
                + papelesa.getUbicacion() + " y es una empresa de " + papelesa.getTipoEmpresa()
                + "\nEl nombre del departamento es " + supervicion.getNombre() + " y su codigo es "
                + supervicion.getCodigo() + " y tiene " + supervicion.getNumeroTrabajadores()
                + " trabajadores.");
    }
}
