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
public class NodoFicha {

    
    private String Ficha;
    private int puntuacion;
    NodoFicha siguiente;
    
    NodoFicha(){
        this.Ficha=null;
        this.puntuacion=0;
        this.siguiente = null;
    }
    
    public void NodoFicha(String Ficha, int puntuacion){
        this.setFicha(Ficha);
        this.setPuntuacion(puntuacion);
        this.siguiente = null;
    }
    
    /**
     * @return the Ficha
     */
    public String getFicha() {
        return Ficha;
    }

    /**
     * @param Ficha the Ficha to set
     */
    public void setFicha(String Ficha) {
        this.Ficha = Ficha;
    }

    /**
     * @return the puntuacion
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * @param puntuacion the puntuacion to set
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
}
