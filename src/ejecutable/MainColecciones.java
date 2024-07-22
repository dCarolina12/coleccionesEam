/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutable;

import colecciones.genericas.ListaEG;
import colecciones.simples.ListaES;

/**
 *
 * @author DIANA CAROLINA
 */
public class MainColecciones {
    public static void main(String [] args){
        ListaEG<String> ciudades = new ListaEG<>();
        ciudades.agregar("cartagena");
        ciudades.agregar("armenia");
        ciudades.agregar("cali");
        
        ciudades.imprimirContenido();
        
        
        
        
        
        System.out.println("--------- lista no generica----------");
        ListaES ciudades1= new ListaES();
        ciudades1.agregar("medellin");
        ciudades1.agregar("bogota");
        ciudades1.imprimirContenido();
        
    }
}
