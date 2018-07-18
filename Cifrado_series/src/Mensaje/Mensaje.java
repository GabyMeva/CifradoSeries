/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje;

import Alfabeto.Alfabeto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Mary Mendoza
 */
public class Mensaje implements Interfacemensaje{
    private String mensaje;
    private Map <Integer, Character> mapa_mensaje;
    private Alfabeto alfabeto;
    
    public Mensaje(String mensaje, Alfabeto alfabeto){
        this.mensaje= mensaje;
        this.alfabeto = alfabeto;
        this.mapa_mensaje = new LinkedHashMap <Integer, Character>();
    }

    @Override
    public Map devolver_mensaje() {
        try {
            es_valido_el_mensaje();
            llena_mapa();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return mapa_mensaje;
    }
    
    private void llena_mapa(){
        for(Integer i=0; i<mensaje.length(); i++){
            if(mensaje.charAt(i)!= ' ')
            mapa_mensaje.put(i, mensaje.charAt(i));
        }
    }
    
    public void imprimeMensaje(){
        Iterator it = mapa_mensaje.keySet().iterator();
            while(it.hasNext()){
                System.out.print(mapa_mensaje.get((Integer) it.next()));
            }
    }
    
    private void es_valido_el_mensaje() throws Exception{
        Iterator it = mapa_mensaje.keySet().iterator();
            while(it.hasNext()){
                if(!alfabeto.regresa_alfabeto().containsValue(mensaje.charAt((Integer) it.next())))
                    throw new Exception("Los caracteres del mensaje no concuerdan con ningun alfabeto");
            }
    }
}
    

