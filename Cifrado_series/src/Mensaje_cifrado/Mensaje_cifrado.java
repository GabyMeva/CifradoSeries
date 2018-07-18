/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje_cifrado;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Mary Mendoza
 */
public class Mensaje_cifrado implements MensajeCifrado{
    Map <Integer, Character> mapa_mensaje;
    
    public Mensaje_cifrado(Map <Integer, Character> mapa){
        this.mapa_mensaje = new LinkedHashMap <Integer, Character>();
        mapa_mensaje.putAll(mapa);
    }
    
    @Override
    public Map devolver_mensaje() {
        return mapa_mensaje;
    }
    
    public void imprimeMensaje(){
        Iterator it = mapa_mensaje.keySet().iterator();
            while(it.hasNext()){
                Integer key = (Integer) it.next();
                System.out.print(mapa_mensaje.get(key));
            }
    }
}
