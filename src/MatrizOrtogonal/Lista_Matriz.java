/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrizOrtogonal;

/**
 *
 * @author Alessandra
 */
public class Lista_Matriz {
    Nodo_Matriz inicio;
    
    
    public Lista_Matriz(){
        this.inicio = null;
        
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public void ingresar_Nodo(int y){
        Nodo_Matriz nuevo = new Nodo_Matriz();
        nuevo.setY(y);
        if(esVacia()){
            inicio = nuevo;
                        
        }else{
            Nodo_Matriz aux = inicio;
            while(aux.getAbajo_nodo() != null){
                aux = aux.getAbajo_nodo();    
            }
            aux.setDerecha_nodo(nuevo);
            nuevo.setIzquierda_nodo(aux);
        }
        
    }
    
}
