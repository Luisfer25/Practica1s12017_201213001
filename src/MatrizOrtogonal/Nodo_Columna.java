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
public class Nodo_Columna {
    private Nodo_Columna siguiente_derecha;
    private int x;
    Lista_Matriz lista = new Lista_Matriz();
    
   public Nodo_Columna(){
       this.siguiente_derecha = null;
       this.x = 0;
   }
   
   public void Nodo_Columna(int x,Lista_Matriz lista){
       this.setX(x);

       this.setSiguiente_derecha(null);
       
       this.lista = lista;
       
   
   }

   
    /**
     * @return the siguiente_derecha
     */
    public Nodo_Columna getSiguiente_derecha() {
        return siguiente_derecha;
    }

    /**
     * @param siguiente_derecha the siguiente_derecha to set
     */
    public void setSiguiente_derecha(Nodo_Columna siguiente_derecha) {
        this.siguiente_derecha = siguiente_derecha;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

   
}
