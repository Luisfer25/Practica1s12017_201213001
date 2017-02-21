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
public class Nodo_Matriz {
    private Nodo_Matriz abajo_nodo;
    private Nodo_Matriz arriba_nodo;
    private Nodo_Matriz derecha_nodo;
    private Nodo_Matriz izquierda_nodo;
    private int valor_casilla;
    private String letra;
    private int y;
    
    public Nodo_Matriz(){
        this.letra = null;
        this.valor_casilla = 0;
        this.y = 0;
        this.abajo_nodo = null;
        this.arriba_nodo = null;
        this.derecha_nodo = null;
        this.izquierda_nodo = null; 
    }
    
    public void Nodo_Matriz(int valor_casilla, String letra, int y){
        this.valor_casilla = valor_casilla;
        this.letra = letra;
        this.setY(y);
        this.abajo_nodo = null;
        this.arriba_nodo = null;
        this.derecha_nodo = null;
        this.izquierda_nodo = null;
    }

    /**
     * @return the abajo_nodo
     */
    public Nodo_Matriz getAbajo_nodo() {
        return abajo_nodo;
    }

    /**
     * @param abajo_nodo the abajo_nodo to set
     */
    public void setAbajo_nodo(Nodo_Matriz abajo_nodo) {
        this.abajo_nodo = abajo_nodo;
    }

    /**
     * @return the arriba_nodo
     */
    public Nodo_Matriz getArriba_nodo() {
        return arriba_nodo;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @param arriba_nodo the arriba_nodo to set
     */
    public void setArriba_nodo(Nodo_Matriz arriba_nodo) {
        this.arriba_nodo = arriba_nodo;
    }

    /**
     * @return the derecha_nodo
     */
    public Nodo_Matriz getDerecha_nodo() {
        return derecha_nodo;
    }

    /**
     * @param derecha_nodo the derecha_nodo to set
     */
    public void setDerecha_nodo(Nodo_Matriz derecha_nodo) {
        this.derecha_nodo = derecha_nodo;
    }

    /**
     * @return the izquierda_nodo
     */
    public Nodo_Matriz getIzquierda_nodo() {
        return izquierda_nodo;
    }

    /**
     * @param izquierda_nodo the izquierda_nodo to set
     */
    public void setIzquierda_nodo(Nodo_Matriz izquierda_nodo) {
        this.izquierda_nodo = izquierda_nodo;
    }

    /**
     * @return the valor_casilla
     */
    public int getValor_casilla() {
        return valor_casilla;
    }

    /**
     * @param valor_casilla the valor_casilla to set
     */
    public void setValor_casilla(int valor_casilla) {
        this.valor_casilla = valor_casilla;
    }

    /**
     * @return the letra
     */
    public String getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
}
