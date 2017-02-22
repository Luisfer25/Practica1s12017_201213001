/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alessandra
 */
public class Lista_Circular {
    NodoJugador inicio;
    NodoJugador ultimo;
    
    public Lista_Circular(){
        this.inicio = null;
        this.ultimo = null;
        
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public void Agregar_Jugador(String Nombre_Jugador){
        NodoJugador nuevo = new NodoJugador();
        
        nuevo.NodoJugador(Nombre_Jugador);
        
        if(esVacia()){
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        }else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
    }
    
    
    public void Imprimir(){
        NodoJugador aux = inicio;
        
        do{
            if(!esVacia()){
            System.out.println(""+aux.getNombre_Jugador());
            aux = aux.getSiguiente();
            }else{
                System.out.println("no se encontro ningun jugador");
            }
        }while(aux != inicio);
    }
    
    public void graficar_Jugador(){
        NodoJugador aux = inicio;
        String[] cmd = new String[5];
        try {
            File archivo = new File("jugadores.txt");
            BufferedWriter pw = new BufferedWriter(new FileWriter(archivo));
            
            pw.write("Digraph g{");
            do{
                
                
                pw.write("\""+aux.getNombre_Jugador()+"\""+"->"+"\""+aux.getSiguiente().getNombre_Jugador()+"\"");
                aux = aux.getSiguiente();
                
            }while(aux!= inicio);
            pw.write("}");
            pw.close();
            
            cmd[0] = "C:\\Program Files (x86)\\Graphviz2.26.3\\bin\\dot.exe";
            cmd[1] = "-Tpng";
            cmd[2] = "jugadores.txt";
            cmd[3] = "-o";
            cmd[4] = "jugadores.png";
        
            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(Lista_Circular.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                
        
        
    }
    
}
