/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_petshop;
/**
 *
 * @author Rolo
 */
public class Arreglos {
    
    public String Area;
    public String Codigo;
    public String Nombre;
    public String Animal;
    public double Precio;
    public int Cantidad;
    
    public Arreglos (String area, String codigo, String nombre, String animal, double precio, int cantidad){
        Area = area;
        Codigo = codigo;
        Nombre = nombre;
        Animal = animal;
        Precio = precio;
        Cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        return "Categoría: " + Area + "\n" + "Código: " + Codigo + "\n" 
                + "Nombre del artículo: " + Nombre + "\n" + "Tipo de animal: " 
                + Animal + "\n" + "Precio: ₡" + Precio + "\n" + "Cantidad disponible: " + Cantidad + "\n";
    }
     
}
