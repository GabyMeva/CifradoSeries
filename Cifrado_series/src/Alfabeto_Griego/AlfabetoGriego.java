/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alfabeto_Griego;

import Alfabeto.Alfabeto;
import java.util.LinkedHashMap;
import java.util.Map;
import Alfabeto.InterfaceAlfabeto;

/**
 *
 * @author Mary Mendoza
 */
public class AlfabetoGriego extends Alfabeto implements InterfaceAlfabeto{
    
    public AlfabetoGriego(){
        super();
        declara_alfabeto();
    }
   
    @Override
    public void declara_alfabeto(){
        alfabeto.put(1, 'α');
        alfabeto.put(2, 'β');
        alfabeto.put(3, 'γ');
        alfabeto.put(4, 'δ');
        alfabeto.put(5, 'ε');
        alfabeto.put(6, 'ζ');
        alfabeto.put(7, 'η');
        alfabeto.put(8, 'θ');
        alfabeto.put(9, 'ι');
        alfabeto.put(10, 'κ');
        alfabeto.put(11, 'λ');
        alfabeto.put(12, 'μ');
        alfabeto.put(13, 'ν');
        alfabeto.put(14, 'ξ');
        alfabeto.put(15, 'ο');
        alfabeto.put(16, 'π');
        alfabeto.put(17, 'ρ');
        alfabeto.put(18, 'ς');
        alfabeto.put(19, 'τ');
        alfabeto.put(20, 'υ');
        alfabeto.put(21, 'φ');
        alfabeto.put(22, 'χ');
        alfabeto.put(23, 'ψ');
        alfabeto.put(24, 'ω');
    }  
}
