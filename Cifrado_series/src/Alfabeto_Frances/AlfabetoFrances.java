/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alfabeto_Frances;

import Alfabeto.Alfabeto;
import Alfabeto.InterfaceAlfabeto;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mary Mendoza
 */
public class AlfabetoFrances extends Alfabeto implements InterfaceAlfabeto{
    
    public AlfabetoFrances(){
        super();
        declara_alfabeto();
    }

    @Override
    public void declara_alfabeto() {
        alfabeto.put(1,'A');
        alfabeto.put(2,'B');
        alfabeto.put(3,'C');
        alfabeto.put(4,'D');
        alfabeto.put(5,'E');
        alfabeto.put(6,'F');
        alfabeto.put(7,'G');
        alfabeto.put(8,'H');
        alfabeto.put(9,'I');
        alfabeto.put(10,'J');
        alfabeto.put(11,'K');
        alfabeto.put(12,'L');
        alfabeto.put(13,'M');
        alfabeto.put(14,'N');
        alfabeto.put(15,'O');
        alfabeto.put(16,'P');
        alfabeto.put(17,'Q');
        alfabeto.put(18,'R');
        alfabeto.put(19,'S');
        alfabeto.put(20,'T');
        alfabeto.put(21,'U');
        alfabeto.put(22,'V');
        alfabeto.put(23,'W');
        alfabeto.put(24,'X');
        alfabeto.put(25,'Y');
        alfabeto.put(26,'Z');
        alfabeto.put(27,'É');
        alfabeto.put(28,'À');
        alfabeto.put(29,'È');
        alfabeto.put(30,'Ù');
        alfabeto.put(31,'Â');
        alfabeto.put(32,'Ê');
        alfabeto.put(33,'Î');
        alfabeto.put(34,'Ô');
        alfabeto.put(35,'Û');
        alfabeto.put(36,'Ë');
        alfabeto.put(37,'Ï');
        alfabeto.put(38,'Ü');
        alfabeto.put(39,'Ÿ');
        alfabeto.put(40,'Æ');
        alfabeto.put(41,'Œ');
    }
}
