/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author Alessandra
 */
public class Lista_Circular {
    NodoJugador inicio;
    NodoJugador ultimo;
    
    public Lista_Circular(){
        this.inicio = null;
        this.ultimo = null;
        
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public void Agregar_Jugador(String Nombre_Jugador){
        NodoJugador nuevo = new NodoJugador();
        
        nuevo.NodoJugador(Nombre_Jugador);
        
        if(esVacia()){
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        }else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
    }
    
    
    public void Imprimir(){
        NodoJugador aux;
        if(!esVacia()){
            aux = inicio;
            while(aux != ultimo){
                System.out.println(""+aux.getNombre_Jugador());
                aux = aux.getSiguiente();
            }
        }else {
            System.out.println("no tiene ningun elemento la llista circular");
        }
    }
}
