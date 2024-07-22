/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.genericas;

/**
 *
 * @author DIANA CAROLINA
 */
public class ListaEG <Tipo> {
    
    private int tamaño;
    private Nodo<Tipo> cabeza;

    public ListaEG() {
        this.tamaño=0;
        this.cabeza=null;
    }
    
    public void agregar (Tipo elemento){
        Nodo<Tipo> nuevoNodo = new Nodo<>(elemento,null);
        if(this.cabeza == null){
            this.cabeza = nuevoNodo;
        }else{
            Nodo<Tipo>  nodoActual = cabeza;
            
            while(nodoActual.getSiguiente()!= null){
                nodoActual = cabeza.getSiguiente();
            }
            
            nodoActual.setSiguiente(nuevoNodo);
            
        }
            this.tamaño++;    
    }
    
    public void imprimirContenido(){
        if(this.cabeza == null){
            return;
        }
        Nodo<Tipo> nodoActual = this.cabeza;
        while(nodoActual.getSiguiente()!= null){
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
        System.out.println(nodoActual.getDato());
    }
    
}
