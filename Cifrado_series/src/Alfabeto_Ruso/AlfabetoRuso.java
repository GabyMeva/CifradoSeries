/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alfabeto_Ruso;

import Alfabeto.Alfabeto;
import java.util.LinkedHashMap;
import java.util.Map;
import Alfabeto.InterfaceAlfabeto;

/**
 *
 * @author Mary Mendoza
 */
public class AlfabetoRuso extends Alfabeto implements InterfaceAlfabeto{
    
    public AlfabetoRuso(){
        super();
        declara_alfabeto();
    }
    
    @Override
    public void declara_alfabeto(){
        alfabeto.put(1, 'А');
        alfabeto.put(2, 'Б');
        alfabeto.put(3, 'В');
        alfabeto.put(4, 'Г');
        alfabeto.put(5, 'Д');
        alfabeto.put(6, 'Е');
        alfabeto.put(7, 'Ё');
        alfabeto.put(8, 'Ж');
        alfabeto.put(9, '3');
        alfabeto.put(10, 'И');
        alfabeto.put(11, 'Й');
        alfabeto.put(12, 'К');
        alfabeto.put(13, 'Л');
        alfabeto.put(14, 'М');
        alfabeto.put(15, 'Н');
        alfabeto.put(16, 'О');
        alfabeto.put(17, 'П');
        alfabeto.put(18, 'Р');
        alfabeto.put(19, 'С');
        alfabeto.put(20, 'Т');
        alfabeto.put(21, 'У');
        alfabeto.put(22, 'Ф');
        alfabeto.put(23, 'Х');
        alfabeto.put(24, 'Ц');
        alfabeto.put(25, 'Ч');
        alfabeto.put(26, 'Ш');
        alfabeto.put(27, 'Щ');
        alfabeto.put(28, 'Ъ');
        alfabeto.put(29, 'Ы');
        alfabeto.put(30, 'Ь');
        alfabeto.put(31, 'Э');
        alfabeto.put(32, 'Ю');
        alfabeto.put(33, 'Я');
    }
}
