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
public class Lista_Simple {
    NodoFicha siguiente;
    NodoFicha inicio;
    
    Lista_Simple(){
        this.inicio=null;
    }
            
    public boolean esVacia(){
        return inicio == null;
    }
    
    public void  ingresar(String Ficha, int puntuacion){
        NodoFicha nuevo = new NodoFicha();
        
        nuevo.NodoFicha(Ficha, puntuacion);
        
        if(esVacia()){
            inicio = nuevo;
        }else{
            NodoFicha aux = inicio;
            
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            
            aux.siguiente = nuevo;
        }
        
        
    }
    
    public int NumeroElementos(){
       NodoFicha aux = inicio;
       int tamano=0;
       while(aux != null){
           tamano = tamano+1;
           aux = aux.siguiente;
       }
       return tamano;
    }
    
    
    

            
            
            
            
            
            
            
            
            
            
            
            
            
}
