/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.simples;

/**
 *
 * @author DIANA CAROLINA
 */
public class Nodo {
    
    private String datos;
    private Nodo siguiente; 

    public Nodo(String datos, Nodo siguiente) {
        this.datos = datos;
        this.siguiente = siguiente;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
