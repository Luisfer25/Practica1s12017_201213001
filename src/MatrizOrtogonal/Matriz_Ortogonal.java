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
public class Matriz_Ortogonal {
    
    Lista_columna columna = new Lista_columna();
    
    public Matriz_Ortogonal(){
        
    }
    
    public void llenar_Matriz(int dimension){
        Nodo_Matriz nuevo =  new Nodo_Matriz();
        Lista_Matriz lista_columna = new Lista_Matriz();
        
        for(int x = 1; x<= dimension;x++){
            
            for (int y = 1; y <=dimension;y++){
                lista_columna.ingresar_Nodo(y);
            }
            columna.ingresar_columna(x, lista_columna);
        }
        
    }
    
}
