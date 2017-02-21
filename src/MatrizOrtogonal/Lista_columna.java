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
public class Lista_columna {
    
    Nodo_Columna inicioColumna;
    //Lista_Matriz fila = new Lista_Matriz();
    public Lista_columna(){
    
        this.inicioColumna = null;
    }
    
    public boolean esVacia(){
        return inicioColumna == null;
    }
    
    public void ingresar_columna(int x, Lista_Matriz lista){
        Nodo_Columna nuevo = new Nodo_Columna();
        nuevo.Nodo_Columna(x, lista);
        if(esVacia()){
            inicioColumna = nuevo;
            
        }else{
            Nodo_Columna aux = inicioColumna;
            while(aux.getSiguiente_derecha()!= null){
                aux = aux.getSiguiente_derecha();
            }
            aux.setSiguiente_derecha(nuevo);
        }
        
    }
    
    
    
    public Nodo_Columna Retornar_columna(int x){
        Nodo_Columna aux = inicioColumna;
        while(aux != null){
            if(aux.getX() == x){
               break;
            }else{
                aux = aux.getSiguiente_derecha();
            }
            
        }
        return aux;
    }
    
    
            
    
    
    
}
