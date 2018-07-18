/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado_series;

import Mensaje.Mensaje;
import Mensaje_cifrado.Mensaje_cifrado;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Mary Mendoza
 */
public class Cifrado_series implements InterfaceCifradoSeries{
    private Map <Integer, Character> submensajes;
    
    public Cifrado_series(){
        submensajes = new LinkedHashMap <Integer, Character>();
    }
    
    @Override
    public void agregarSubmensaje(Map <Integer, Character> tipo_submensaje){
        Iterator it = tipo_submensaje.keySet().iterator();
            while(it.hasNext()){
                Integer key = (Integer) it.next();
                submensajes.put(key, tipo_submensaje.get(key));
            }
    }
    
    public Map submensajes(){
        return submensajes;
    }
    
    public Mensaje_cifrado cifrarMensaje(){
        return new Mensaje_cifrado(submensajes);
    }
    
    public void imprimeMensaje(){
        Iterator it = submensajes.keySet().iterator();
            while(it.hasNext()){
                Integer key = (Integer) it.next();
                System.out.print(submensajes.get(key));
            }
    }
}
