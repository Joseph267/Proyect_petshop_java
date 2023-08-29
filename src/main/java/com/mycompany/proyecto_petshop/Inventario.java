/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_petshop;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Rolo
 */
public class Inventario {
    // Arreglo de   Objetos/constructor
    Arreglos arregloInventario[] = new Arreglos[50];
    
    public void habilitar_inventario(){
         arregloInventario[0] = new Arreglos("Alimento", "A01", "ProPlan Canino", "Perro", 15000, 20);
         arregloInventario[1] = new Arreglos("Alimento", "A02", "ProPlan Felino", "Gato", 15000, 20);
         arregloInventario[2] = new Arreglos("Alimento", "A03", "NutriSource Canino", "Perro", 15000, 20);
         arregloInventario[3] = new Arreglos("Alimento", "A04", "NutriSource Felino", "Gato", 15000, 20);
         arregloInventario[4] = new Arreglos("Alimento", "A05", "Semillas de girasol", "Ave", 15000, 20);
         arregloInventario[5] = new Arreglos("Articulo", "B01", "Collar de perro", "Perro", 15000, 20);
         arregloInventario[6] = new Arreglos("Articulo", "B02", "Collar de gato", "Gato", 15000, 20);
         arregloInventario[7] = new Arreglos("Articulo", "B03", "Pechera de perro", "Perro", 15000, 20);
         arregloInventario[8] = new Arreglos("Articulo", "B04", "Pechera de gato", "Gato", 15000, 20);
         arregloInventario[9] = new Arreglos("Articulo", "B05", "Rueda de hamster", "Hamster", 15000, 20);
         arregloInventario[10] = new Arreglos("Medicamento", "C01", "Pipeta de perro", "Perro", 15000, 20);
         arregloInventario[11] = new Arreglos("Medicamento", "C02", "Pipeta de gato", "Gato", 15000, 20);
         arregloInventario[12] = new Arreglos("Medicamento", "C03", "Antiparasitante de perro", "Perro", 15000, 20);
         arregloInventario[13] = new Arreglos("Medicamento", "C04", "Antiparasitante de gato", "Gato", 15000, 20);
         arregloInventario[14] = new Arreglos("Medicamento", "C05", "Anti-inflamatorio de perro", "Perro", 15000, 20);
     }
    
    public void agregar_articulo(){
        for (int i = 0; i <= arregloInventario.length; i++){
            if (arregloInventario[i] == null){
               String area = JOptionPane.showInputDialog("Ingrese el área del producto nuevo: ");
               String codigo = JOptionPane.showInputDialog("Ingrese el código del producto nuevo: ");
               String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto nuevo: ");
               String animal = JOptionPane.showInputDialog("Ingrese el tipo de animal para el producto nuevo: ");
               double precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del artículo nuevo: "));
               int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad en stock disponibles del artículo nuevo: "));
               arregloInventario[i] = new Arreglos(area, codigo, nombre, animal, precio, cantidad); 
               JOptionPane.showMessageDialog(null,"Se registro correctamente el producto nuevo" + "\n" +
                                                "Detalles del producto: \n" + arregloInventario[i]);
               
               int agregarArticulo = JOptionPane.showConfirmDialog(null, "¿Desea registrar otro producto?");
               if(agregarArticulo == 1){
                      i = arregloInventario.length+1;
               }
           }
        }
        menu_inventario();
    }
    
    public void mostrar_inventario(){
        String CadenaInventario = "";
        for (int i = 0; i < arregloInventario.length && arregloInventario[i] != null; i++){
            CadenaInventario += arregloInventario[i] + "\n";
        }
        JTextArea mensajeInventario = new JTextArea(CadenaInventario);
        JScrollPane scrollPane = new JScrollPane(mensajeInventario); 
        scrollPane.setPreferredSize( new Dimension( 300, 500 ) );
        JOptionPane.showMessageDialog(null, scrollPane, "Inventario",JOptionPane.INFORMATION_MESSAGE);
        
        menu_inventario();
    }
    
    public void editar_inventario(){
        String CadenaInventario = "";
        String Cadena1 = "";
        for (int i = 0; i < arregloInventario.length && arregloInventario[i] != null; i++){
            CadenaInventario += arregloInventario[i] + "\n";
        }
        Cadena1 = "Revise el código del producto que desea editar: \n\n" + CadenaInventario;
        JTextArea mensajeEditar = new JTextArea(Cadena1);
        JScrollPane scrollPane = new JScrollPane(mensajeEditar); 
        scrollPane.setPreferredSize( new Dimension( 300, 500 ) );
        JOptionPane.showMessageDialog(null, scrollPane, "Inventario",JOptionPane.INFORMATION_MESSAGE);
          
        boolean seguir = true;
        boolean seguir2 = true;
        while(seguir){
            int contador = 0;
            String Code = JOptionPane.showInputDialog("Digite el código del producto que desea editar: ");
            for(int j=0; j<arregloInventario.length && arregloInventario[j] != null; j++){
                if(arregloInventario[j].Codigo.equals(Code)){
                    while(seguir2){
                        String [] botonesEditar = {"Categoría","Código","Nombre", "Animal", "Precio", "Cantidad"};

                        int opc = JOptionPane.showOptionDialog(null, "Seleccione el dato que desea editar",
                                                          "Editar Inventario",
                                                          JOptionPane.DEFAULT_OPTION,
                                                          JOptionPane.QUESTION_MESSAGE,
                                                          null,botonesEditar,botonesEditar[0]);

                        switch(opc){
                            case 0:
                                String are = JOptionPane.showInputDialog("Ingrese la nueva categoría del producto: ");
                                arregloInventario[j].Area = are;
                                break;
                            case 1:
                                String codi = JOptionPane.showInputDialog("Ingrese el nuevo código del producto: ");
                                arregloInventario[j].Codigo = codi;
                                break;
                            case 2:
                                String nom = JOptionPane.showInputDialog("Ingrese el nuevo nombre del producto: ");
                                arregloInventario[j].Nombre = nom;
                                break;
                            case 3:
                                String anim = JOptionPane.showInputDialog("Ingrese el nuevo tipo de animal del producto: ");
                                arregloInventario[j].Animal = anim;
                                break;
                            case 4:
                                double prec = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio del producto:"));
                                arregloInventario[j].Precio = prec;
                                break;
                            case 5:
                                int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad del producto:"));
                                arregloInventario[j].Cantidad = cant;
                                break;
                        }
                        int OtraM = JOptionPane.showConfirmDialog(null, "¿Desea modificar otro dato del producto?");
                        if(OtraM == 1){
                            seguir2 = false;
                            j = arregloInventario.length;
                        }
                    }
                }
                else{
                    contador++;
                }
            }
            if(contador == arregloInventario.length){
                JOptionPane.showMessageDialog(null, "El código digitado no existe.");
            }
            int intento = JOptionPane.showConfirmDialog(null, "¿Desea digitar otro código?");
            if(intento == 1){
                seguir = false;
            }
        }
        
        menu_inventario();
    }
    
    public void menu_inventario(){
        Menu obj = new Menu();
        boolean seguir1 = true;
        
        while (seguir1){
            String [] botonesInventario = {"Mostrar Inventario","Agregar Articulo","Editar Inventario", "Volver"};

            int opc = JOptionPane.showOptionDialog(null, "Menu del Inventario:",
                                                          "Menu del Inventario:",
                                                          JOptionPane.DEFAULT_OPTION,
                                                          JOptionPane.QUESTION_MESSAGE,
                                                          null,botonesInventario,botonesInventario[0]);

            switch(opc){
                case 0:
                    mostrar_inventario();
                    break;
                case 1:
                    agregar_articulo();
                    break;
                case 2:
                    editar_inventario();
                    break;
                case 3:
                    obj.menu_gerente();
                    seguir1 = false;
                    break;
            }
            seguir1 = false;
        }
    }
    
}
