/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_petshop;
import javax.swing.JOptionPane;
/**
 *
 * @author Rolo
 */
public class Usuario {
    ArregloUsuario listaUsuario[] = new ArregloUsuario[50];
    
    public void solicitar_usuario(){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite su cédula: "));
        String rol = JOptionPane.showInputDialog("Digite su rol: ");
    }
    
    public void validar_usuario(){
       
    }
    public void editar_usuario(){
        int opc;
        boolean editar = true;
        Menu objeto = new Menu();
        objeto.menu_gerente();
    }
}
