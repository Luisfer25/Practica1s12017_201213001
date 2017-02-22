/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alessandra
 */
public class Cola {
    NodoCola inicioCola;
    
    public Cola(){
        this.inicioCola = null;
    }
    
    public boolean ColaVacia(){
        return inicioCola == null;
    }
    
    public void enColar(String Letra){
        NodoCola nuevo = new NodoCola();
        
        nuevo.NodoCola(Letra);
        
        if(ColaVacia()){
            inicioCola = nuevo;
        }else{
            NodoCola aux = inicioCola;
            while(aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        
    }
    
    public void desenColar(){
        NodoCola aux = inicioCola;
        if(aux != null){
        inicioCola = aux.getSiguiente();
        aux.setSiguiente(null);
        }else{
            System.out.println("no hay nada en la cola");
        }
    }
    
    
    
    public void imprimirCola(){
        NodoCola aux = inicioCola;
        if(!ColaVacia()){
        while(aux != null){
            System.out.println(""+aux.getLetra());
            aux = aux.getSiguiente();
        }
        }else{
            System.out.println("cola vacia");
        }
    
    }
    
    public int tamanoCola(){
        NodoCola aux=inicioCola;
        int tamano=0;
        while(aux != null){
            tamano = tamano +1;
            aux = aux.getSiguiente();
        }
        return tamano;
    }
    
    public void graficar_Cola_Fichas(){
        NodoCola aux = inicioCola;
        String[] cmd = new String[5];
        try {
            File archivo = new File("ColaFicha.txt");
            BufferedWriter pw = new BufferedWriter(new FileWriter(archivo));
            
            pw.write("Digraph g{");
            while(aux.getSiguiente() != null){
                
                pw.write("\""+aux.getLetra()+"\""+"->"+"\""+aux.getSiguiente().getLetra()+"\"");
                aux = aux.getSiguiente();
                
                
            }
            
            pw.write("}");
            pw.close();
            
            cmd[0] = "C:\\Program Files (x86)\\Graphviz2.26.3\\bin\\dot.exe";
            cmd[1] = "-Tpng";
            cmd[2] = "ColaFicha.txt";
            cmd[3] = "-o";
            cmd[4] = "ColaFicha.png";
        
            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(Lista_Circular.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
