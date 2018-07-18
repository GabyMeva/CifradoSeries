/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Submensaje_NumPares;

import Mensaje.Mensaje;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Mary Mendoza
 */
public class NumerosPares implements InterfaceNumPares{
    private Mensaje mensaje;
    private Map <Integer, Character> mapa_pares;
    
    public NumerosPares(Mensaje mensaje){
        this.mensaje = mensaje;
        mapa_pares = new HashMap <Integer, Character>();
    }  

    @Override
    public Map regresa_serie() {
        Iterator it = mensaje.devolver_mensaje().keySet().iterator();
        return llena_mapa(it);
    }
    
    private Map llena_mapa(Iterator it){
            while(it.hasNext()){
                Integer key = (Integer) it.next();
                if(key %2 ==0)
                    mapa_pares.put(key, (Character) mensaje.devolver_mensaje().get(key));
            }
            return mapa_pares;
    }
    
    public void imprimeMensaje(){
        Iterator it = mapa_pares.keySet().iterator();
            while(it.hasNext()){
                System.out.print(mapa_pares.get((Integer) it.next()));
            }
            System.out.println("");
    }
}
