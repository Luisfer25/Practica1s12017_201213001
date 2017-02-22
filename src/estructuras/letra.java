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
public class letra {

    private String Letra;
    private int cantidad;
    private letra siguiente;
    private int posicion;
    
    public letra(){
        this.Letra = null;
        this.cantidad = 0;
        this.siguiente= null;
        this.posicion = 0;
    }
    
    public void letra(int posicion, String Letra, int cantidad){
        this.posicion = posicion;
        this.Letra = Letra;
        this.cantidad = cantidad;
        this.setSiguiente(null);
    }
    
    
    /**
     * @return the Letra
     */
    public String getLetra() {
        return Letra;
    }

    /**
     * @param Letra the Letra to set
     */
    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @return the siguiente
     */
    public letra getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(letra siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the posicion
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
