/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_petshop;

/**
 *
 * @author Rolo
 */
public class ArregloUsuario {
    String nombre;
    String apellido;
    int cedula;
    EnumUser rol;
    String user;
    String pass;
    
    public ArregloUsuario(String nombre, String apellido, int cedula, EnumUser rol, String user, String pass){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.rol = rol;
        this.user = user;
        this.pass = pass;
    }
}
