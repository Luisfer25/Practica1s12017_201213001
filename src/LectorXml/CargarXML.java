/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectorXml;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import javax.swing.JOptionPane;

/**
 *
 * @author Alessandra
 */
public class CargarXML {


    public CargarXML(){
        
    }
    
    public void cargarDimension(String ruta){
        
        //se cra un SAXBuilder para poder parsear el archivo
        SAXBuilder builder = new SAXBuilder();
        File ArchivoXml = new File(ruta);
        
        try{
            //se crea el docuemento a traves del archio
            Document documento =(Document)builder.build(ArchivoXml);
            //se obtiene la raiz 
            Element raiz = documento.getRootElement();
            
            //se obtiene la lista de hijos de la raiz 
            List list = raiz.getChildren("dimension");
            //si lista tiene un elemento lo obtiene
            if(list.size()==1){
            System.out.println(""+raiz.getChildTextTrim("dimension"));
            }else if (list.size()==0){
                JOptionPane.showMessageDialog(null,"No existe ninguna dimension del tablero");
            }else{
                JOptionPane.showMessageDialog(null,"Revise su archivo de entrada");
            }
       
        }catch(IOException io){
            JOptionPane.showMessageDialog(null,io.getMessage());
        } catch (JDOMException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    
    public void cargarDiccionario(String ruta){
        
        //se cra un SAXBuilder para poder parsear el archivo
        SAXBuilder builder = new SAXBuilder();
        File ArchivoXml = new File(ruta);
        
        try{
            //se crea el docuemento a traves del archio
            Document documento =(Document)builder.build(ArchivoXml);
            //se obtiene la raiz scrabble
            Element raiz = documento.getRootElement();
            
            //se obtiene la lista de hijos de la raiz 
            List list = raiz.getChildren("diccionario");
            //si lista tiene un elemento lo obtiene
            if(list.size()==1){
                //se obtiene el elemento diccionario
                Element diccionario = (Element)list.get(0);
                
                // se obtiene los elementos de diccionario qe son palabras
                List list_palabras = diccionario.getChildren();
                
                for(int x = 0; x < list_palabras.size();x++ ){
                    Element palabra = (Element)list_palabras.get(x);
                    System.out.println(""+palabra.getTextTrim());
                    
                }
            }else if (list.size()==0){
                JOptionPane.showMessageDialog(null,"No existe ninguna dimension del tablero");
            }else{
                JOptionPane.showMessageDialog(null,"Revise su archivo de entrada");
            }
       
        }catch(IOException io){
            JOptionPane.showMessageDialog(null,io.getMessage());
        } catch (JDOMException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }


    public void cargarCasilla(String ruta){
        
        //se cra un SAXBuilder para poder parsear el archivo
        SAXBuilder builder = new SAXBuilder();
        File ArchivoXml = new File(ruta);
        
        try{
            //se crea el docuemento a traves del archio
            Document documento =(Document)builder.build(ArchivoXml);
            //se obtiene la raiz scrabble
            Element raiz = documento.getRootElement();
            
            //se obtiene la lista de hijos de la raiz 
            List list = raiz.getChildren("dobles");
            //si lista tiene un elemento lo obtiene
            if(list.size()==1){
                
                Element dobles = (Element)list.get(0);
                
                // se obtiene los elementos de diccionarioque son casillas
                List list_casilla = dobles.getChildren();
                
                for(int x = 0; x < list_casilla.size();x++ ){
                    Element casilla = (Element)list_casilla.get(x);
                    System.out.println("x:  "+casilla.getChildTextTrim("x"));
                    System.out.println("y:  "+casilla.getChildTextTrim("y"));
                    
                }
            }else if (list.size()==0){
                JOptionPane.showMessageDialog(null,"No existe ninguna dimension del tablero");
            }else{
                JOptionPane.showMessageDialog(null,"Revise su archivo de entrada");
            }
       
        }catch(IOException io){
            JOptionPane.showMessageDialog(null,io.getMessage());
        } catch (JDOMException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }





    
}
