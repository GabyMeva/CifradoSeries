/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Submensaje_NumNaturales;

import Mensaje.Mensaje;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Mary Mendoza
 */
public class NumerosNaturales implements Interface_NumNaturales{
    private Mensaje mensaje;
    private Map <Integer, Character> mapa_naturales;
    
    public NumerosNaturales(Mensaje mensaje){
        this.mensaje = mensaje;
        mapa_naturales = new HashMap <Integer, Character>();
    }  

    @Override
    public Map regresa_serie() {
        return llena_mapa();
    }
    
    private Map llena_mapa(){
        mapa_naturales.putAll(mensaje.devolver_mensaje());
            return mapa_naturales;
    }
}
