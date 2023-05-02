/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_java;

import javax.swing.JOptionPane;

public class Cliente {
    
    private static int totalClientes = 0;
    private int numCliente;
    private final long cc;
    private String nombre;
    private long telefono;
    private String correo;
    private String direccion;
    private Ciudad ciudad;

    //Metodos
    public Cliente(long cc, String nombre, long telefono, String correo, String direccion, Ciudad ciudad) {
        totalClientes++;
        this.numCliente = totalClientes;
        this.cc = cc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public Cliente(long cc, String nombre) {
        totalClientes++;
        this.numCliente = totalClientes;
        this.cc = cc;
        this.nombre = nombre;
    }
    
    public void datosCliente(){
        String Texto = """
                       Datos cliente:
                       Nombre: """ + this.nombre
                       +"\n CC: "+ this.cc
                       +"\n Teléfono: "+ this.telefono
                       +"\n Correo: "+ this.correo
                       +"\n Dirección: "+ this.direccion
                       +"\n Ciudad: "+ this.ciudad;
        JOptionPane.showMessageDialog(null, Texto);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public long getCc() {
        return cc;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Número cliente = "+numCliente+" cc=" + cc;
    }
    

}
