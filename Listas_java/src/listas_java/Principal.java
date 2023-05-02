/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas_java;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SALA
 */
public class Principal {

   
    public static void main(String[] args) {
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        boolean continuar = true;
        int op;
        while(continuar){
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                                        Bienvenido. Ingresa una opción
                                        1. Agregar cliente
                                        2. Mostrar lista de clientes
                                        3. Mostrar datos de un cliente
                                        4. Eliminar cliente
                                        5. Modificar cliente
                                        6. Salir"""));
            
            switch (op){
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese nombre del cliente:");
                    long cc = Long.parseLong(JOptionPane.showInputDialog("Ingrese número de documento del cliente"));
                    listaClientes.add(new Cliente(cc, nombre));
                    JOptionPane.showMessageDialog(null, "El cliente se registró exitosamente");
                    break;
                    
                case 2:
                    if(listaClientes.isEmpty()){
                        JOptionPane.showMessageDialog(null, "La lista está vacía");                        
                    }else{
                        JOptionPane.showMessageDialog(null, listaClientes);
                    }
                    JOptionPane.showMessageDialog(null, listaClientes);
                    break;
                    
                case 6:
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "¡Error! Opción no válida");
                    
                    
            }
        }
    }
    
}
