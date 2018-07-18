/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Submensaje_MultilplosDe;

import Mensaje.Mensaje;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Mary Mendoza
 */
public class Multiplos implements InterfaceMultiplosDe{
    private Integer numero;
    private Mensaje mensaje;
    private Map <Integer, Character> mapa_multiplos;
    
    public Multiplos(Integer numero, Mensaje mensaje){
        this.numero = numero;
        this.mensaje = mensaje;
        mapa_multiplos = new HashMap <Integer, Character>();
    }  

    @Override
    public Map regresa_serie() {
        Iterator it = mensaje.devolver_mensaje().keySet().iterator();
        return llena_mapa(it);
    }
    
    private Map llena_mapa(Iterator it){
            while(it.hasNext()){
                Integer key = (Integer) it.next();
                if(key %numero !=0)
                    mapa_multiplos.put(key, (Character) mensaje.devolver_mensaje().get(key));
            }
            return mapa_multiplos;
    }
    
    public void imprimeMensaje(){
        Iterator it = mapa_multiplos.keySet().iterator();
            while(it.hasNext()){
                System.out.print(mapa_multiplos.get((Integer) it.next()));
            }
            System.out.println("");
    }
    
    
}
