/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alfabeto_español;

import Alfabeto.Alfabeto;
import Alfabeto.InterfaceAlfabeto;

/**
 *
 * @author Mary Mendoza
 */
public class AlfabetoEspanol extends Alfabeto implements InterfaceAlfabeto{
    
    public AlfabetoEspanol(){
        super();
        declara_alfabeto();
    }
    
    @Override
    public void declara_alfabeto(){
        alfabeto.put(1, 'a');
        alfabeto.put(2, 'á');
        alfabeto.put(3, 'b');
        alfabeto.put(4, 'c');
        alfabeto.put(5, 'd');
        alfabeto.put(6, 'e');
        alfabeto.put(7, 'f');
        alfabeto.put(8, 'g');
        alfabeto.put(9, 'h');
        alfabeto.put(10, 'i');
        alfabeto.put(11, 'j');
        alfabeto.put(12, 'k');
        alfabeto.put(13, 'l');
        alfabeto.put(14, 'm');
        alfabeto.put(15, 'n');
        alfabeto.put(16, 'ñ');
        alfabeto.put(17, 'o');
        alfabeto.put(18, 'p');
        alfabeto.put(19, 'q');
        alfabeto.put(20, 'r');
        alfabeto.put(21, 's');
        alfabeto.put(22, 't');
        alfabeto.put(23, 'u');
        alfabeto.put(24, 'v');
        alfabeto.put(25, 'w');
        alfabeto.put(26, 'x');
        alfabeto.put(27, 'y');
        alfabeto.put(28, 'z');
        alfabeto.put(29, 'é');
        alfabeto.put(57, 'í');
        alfabeto.put(58, 'ó');
        alfabeto.put(59, 'ú');
        
        alfabeto.put(30, 'A');
        alfabeto.put(31, 'B');
        alfabeto.put(32, 'C');
        alfabeto.put(33, 'D');
        alfabeto.put(34, 'E');
        alfabeto.put(35, 'F');
        alfabeto.put(36, 'G');
        alfabeto.put(37, 'H');
        alfabeto.put(38, 'I');
        alfabeto.put(39, 'J');
        alfabeto.put(40, 'K');
        alfabeto.put(41, 'L');
        alfabeto.put(42, 'M');
        alfabeto.put(43, 'N');
        alfabeto.put(44, 'Ñ');
        alfabeto.put(45, 'O');
        alfabeto.put(46, 'P');
        alfabeto.put(47, 'Q');
        alfabeto.put(48, 'R');
        alfabeto.put(49, 'S');
        alfabeto.put(50, 'T');
        alfabeto.put(51, 'U');
        alfabeto.put(52, 'V');
        alfabeto.put(53, 'W');
        alfabeto.put(54, 'X');
        alfabeto.put(55, 'Y');
        alfabeto.put(56, 'Z');
    }
}
