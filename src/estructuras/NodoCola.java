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
public class NodoCola {
    private String Letra;
    private NodoCola siguiente;
    
    NodoCola(){
        this.Letra= null;
        this.siguiente = null;
    }
    
    public void NodoCola(String Letra){
        this.setLetra(Letra);
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
     * @return the siguiente
     */
    public NodoCola getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
