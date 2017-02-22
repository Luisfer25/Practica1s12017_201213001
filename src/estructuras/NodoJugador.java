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
public class NodoJugador {
    private String Nombre_Jugador;
    private int totalPuntos;
    private Lista_Simple fichas;
    private NodoJugador siguiente;

    
    NodoJugador(){
        this.Nombre_Jugador= null;
        this.totalPuntos = 0;
        this.fichas = new Lista_Simple();
        this.siguiente = null;
    }
    
    public void NodoJugador(String Nombre_Jugador){
        this.setNombre_Jugador(Nombre_Jugador);
        this.setSiguiente(null);
    }
    
    

    /**
     * @return the fichas
     */
    public Lista_Simple getFichas() {
        return fichas;
    }

    /**
     * @param fichas the fichas to set
     */
    public void setFichas(Lista_Simple fichas) {
        this.fichas = fichas;
    }

    /**
     * @return the Nombre_Jugador
     */
    public String getNombre_Jugador() {
        return Nombre_Jugador;
    }

    /**
     * @param Nombre_Jugador the Nombre_Jugador to set
     */
    public void setNombre_Jugador(String Nombre_Jugador) {
        this.Nombre_Jugador = Nombre_Jugador;
    }

    /**
     * @return the totalPuntos
     */
    public int getTotalPuntos() {
        return totalPuntos;
    }

    /**
     * @return the siguiente
     */
    public NodoJugador getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoJugador siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @param totalPuntos the totalPuntos to set
     */
    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }
    
}
