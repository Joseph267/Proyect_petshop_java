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
public class Menu {
    Usuario obj = new Usuario();
    Ventas obj1 = new Ventas();
    Inventario obj3 = new Inventario();
    
    public void menu_gerente(){
        obj3.habilitar_inventario();
        String [] botonesMenuGerente = {"Control de usuario","Ventas","Inventario", "Salir"};
        int opc = JOptionPane.showOptionDialog(null, "Bienvenid@!\n" + "Seleccione una opción:" ,
                                              "Menu Principal",
                                              JOptionPane.DEFAULT_OPTION,
                                              JOptionPane.QUESTION_MESSAGE,
                                              null,botonesMenuGerente,botonesMenuGerente[0]);
        boolean seguir = true;
        while (seguir){
            switch (opc){
            case 0: 
                obj.editar_usuario();
                break;
            case 1:
                obj1.vender();
                break;
            case 2:
                obj3.menu_inventario();
                break;
            case 3:
                break;
            }
        seguir = false;
        }
    }
     
}
