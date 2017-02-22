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
public class Lista_Letras {
    letra inicio = new letra();
    
    public Lista_Letras(){
        this.inicio = null;
    }
    
    public boolean esVacia(){
        return inicio == null;
        
    }
    
    public void ingresar(int posicion,String Letra, int cantidad){
        letra nuevo = new letra();
        
        nuevo.letra(posicion,Letra, cantidad);
        if(esVacia()){
            inicio = nuevo;
        }else{
            letra aux = inicio;
            while(aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public String  buscar_letra(int posicion){
        letra aux =  inicio;
        String letra = null;
        while(aux != null){
            if(aux.getPosicion()== posicion){
                letra = aux.getLetra();
            }
            aux = aux.getSiguiente();
        }
            
        return letra;
        
                
    }
    
    public int buscar_cantidad(int posicion){
        letra aux =  inicio;
        int cantidad = 0;
        while(aux != null){
            if(aux.getPosicion()== posicion){
                cantidad = aux.getCantidad();
            }
            aux = aux.getSiguiente();
        }
            
        return cantidad;
        
    }
    
    public void modificar_valor(int posicion,int cantidad){
        letra aux =  inicio;
        while(aux != null){
            if(aux.getPosicion()== posicion){
                aux.setCantidad(cantidad);
            }
            aux = aux.getSiguiente();
        }
    }
    
    public void Eliminar(int posicion){
        letra aux = inicio;
        while(aux != null){
            if(aux.getPosicion() == posicion){
                if(aux == inicio){
                    inicio = aux.getSiguiente();
                    aux.setSiguiente(null);
                    
                }else{
                    while(aux.getSiguiente().getPosicion() != posicion){
                        aux = aux.getSiguiente();
                    }
                    letra aux2 = aux.getSiguiente().getSiguiente();
                    aux.setSiguiente(aux2);
                }
            }
        }
    }
    
}
