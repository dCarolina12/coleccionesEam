/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.simples;

/**
 *
 * @author DIANA CAROLINA
 */
public class ListaES {
    private int tamaño;
    private Nodo cabeza;
    
    
    public ListaES(){
        this.tamaño=0;
        this.cabeza= null;
    }
    
    public void agregar(String elemento){
       Nodo nuevoNodo = new Nodo (elemento, cabeza );
       if(this.cabeza == null){
           this.cabeza = nuevoNodo;
       }else{ 
           Nodo nodoActual = this.cabeza;
           while (nodoActual.getSiguiente() != null){
               nodoActual = nodoActual.getSiguiente();
           }
           nodoActual.setSiguiente(nuevoNodo);
       
       }
    tamaño ++;
       }
       public void imprimirContenido(){
           if(this.cabeza==null){
               return;
           }
           Nodo nodoActual = this.cabeza;
           while(nodoActual.getSiguiente() != null){
               System.out.println(nodoActual.getDatos());
               nodoActual = nodoActual.getSiguiente();
           }
           System.out.println(nodoActual.getDatos());
       }
        
    }

