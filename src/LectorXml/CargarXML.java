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
            if(list.size()==1){
            System.out.println(""+raiz.getChildTextTrim("dimension"));
            }else if (list.size()==0){
                JOptionPane.showMessageDialog(null,"No existe ninguna dimension del tablero");
            }
       
        }catch(IOException io){
            JOptionPane.showMessageDialog(null,io.getMessage());
        } catch (JDOMException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }







    
}
