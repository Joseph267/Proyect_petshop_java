/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_petshop;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 *
 * @author Rolo
 */
public class Cliente {
    ArregloCliente listaCliente[] = new ArregloCliente[10000];
    
    public void solicitar_cliente(){
        for (int i = 0; i <= listaCliente.length; i++){
            if (listaCliente[i] == null){
            String nombre_cliente = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
            int cedula_cliente = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del cliente: "));
            String correo_cliente = JOptionPane.showInputDialog("Digite el correo electrónico del cliente: ");
            listaCliente[i]  = new ArregloCliente(nombre_cliente,cedula_cliente,correo_cliente);
            }
        }
    }
    
    public void mostrar_cliente(){
        String CadenaClientes = "";
        for (int i = 0; i < listaCliente.length && listaCliente[i] != null; i++){
            CadenaClientes += listaCliente[i] + "\n";
        }
        JTextArea mensajeInventario = new JTextArea(CadenaClientes);
        JScrollPane scrollPane = new JScrollPane(mensajeInventario); 
        scrollPane.setPreferredSize( new Dimension( 300, 500 ) );
        JOptionPane.showMessageDialog(null, scrollPane, "Información de clientes",JOptionPane.INFORMATION_MESSAGE);
    }
                
}
