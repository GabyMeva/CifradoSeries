/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alfabeto;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Mary Mendoza
 */
public abstract class Alfabeto {
    protected Map <Integer, Character> alfabeto;
    
    public Alfabeto(){
        alfabeto = new LinkedHashMap <Integer, Character>();
    }
    
    public Map regresa_alfabeto(){
        return alfabeto;
    }
}
