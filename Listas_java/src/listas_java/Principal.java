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
        //Lista de clientes por defecto
        listaClientes.add(new Cliente(4324324, "Wilken"));
        listaClientes.add(new Cliente(123456, "Andrés"));
        listaClientes.add(new Cliente(123456, "Esteban"));
        
        boolean continuar = true;
        int op;
        int index;
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
                case 3:
                    
                    index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número del cliente: "));
                    index --;
                    //Para obtener el tamaño de la lista utilizamos el método listaClientes.size()
                    if ( index < listaClientes.size() && index >=0 ){
                    // para obtener un objeto de la lista usamos listaClientes.get(indice)    
                    listaClientes.get(index).datosCliente();
                    }else{
                        JOptionPane.showMessageDialog(null, "¡Error! El índice no es válido");
                    }
                    break;
                case 4:
                    index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número del cliente: "));
                    index --;
                    //Para obtener el tamaño de la lista utilizamos el método listaClientes.size()
                    if ( index < listaClientes.size() && index >=0 ){
                    // para obtener un objeto de la lista usamos listaClientes.get(indice)    
                    listaClientes.remove(index);
                    }else{
                        JOptionPane.showMessageDialog(null, "¡Error! El índice no es válido");
                    }
                    break;
                    
                case 5:
                    index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número del cliente: "));
                    index --;
                    int op2 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                           Ingrese una opción:
                                                                           1. Teléfono
                                                                           2. Correo
                                                                           3. Dirección
                                                                           4. Ciudad
                                                                           """));
                    switch (op2){
                        case 1:
                            long telefono = Long.parseLong(JOptionPane.showInputDialog("Ingrese nuevo número de teléfono"));
                            listaClientes.get(index).setTelefono(telefono);
                            break;
                        case 2:
                            String correo = JOptionPane.showInputDialog("Ingrese nueva dirección de correo electrónico");
                            listaClientes.get(index).setCorreo(correo);
                            break;
                        case 3:
                            String direccion = JOptionPane.showInputDialog("Ingrese nuevo dirección");
                            listaClientes.get(index).setDireccion(direccion);
                            break;
                        case 4:
                            int Ciudades = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                        Ingrese una opción
                                                                        1. BOGOTA
                                                                        2. CALI
                                                                        3. BARRANQUILLA
                                                                        4. MEDELLIN
                                                                        5. BUCARAMANGA"""));
                            switch(Ciudades){
                                case 1 -> listaClientes.get(index).setCiudad(Ciudad.BOGOTA);
                                case 2 -> listaClientes.get(index).setCiudad(Ciudad.CALI);
                                case 3 -> listaClientes.get(index).setCiudad(Ciudad.BARRANQUILLA);
                                case 4 -> listaClientes.get(index).setCiudad(Ciudad.MEDELLIN);
                                case 5 -> listaClientes.get(index).setCiudad(Ciudad.BUCARAMANGA);
                            }
                            break;                                                        
                            default:
                    JOptionPane.showMessageDialog(null, "¡Error! Opción no válida");
                    
                            
                            
                    }
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
