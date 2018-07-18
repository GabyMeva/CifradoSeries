/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Submensaje_NumPrimos;

import Mensaje.Mensaje;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Mary Mendoza
 */
public class NumerosPrimos implements InterfaceNumPrimos{
    private Mensaje mensaje;
    private Map <Integer, Character> mapa_primos;
    
    public NumerosPrimos(Mensaje mensaje){
        this.mensaje = mensaje;
        mapa_primos = new HashMap <Integer, Character>();
    }  

    @Override
    public Map regresa_serie() {
        Iterator it = mensaje.devolver_mensaje().keySet().iterator();
        return llena_mapa(it);
    }
    
    private Map llena_mapa(Iterator it){
            while(it.hasNext()){
                Integer key = (Integer) it.next();
                if(key%2!=0 && key%1==0 && key%key==0 && key%3!=0 && key%5!=0 && key%7!=0)
                    mapa_primos.put(key, (Character) mensaje.devolver_mensaje().get(key));
            }
            return mapa_primos;
    }
    
    public void imprimeMensaje(){
        Iterator it = mapa_primos.keySet().iterator();
            while(it.hasNext()){
                System.out.print(mapa_primos.get((Integer) it.next()));
            }
            System.out.println("");
    }
    
}
