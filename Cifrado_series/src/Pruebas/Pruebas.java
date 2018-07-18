/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Alfabeto.Alfabeto;
import Alfabeto_Griego.AlfabetoGriego;
import Alfabeto_Ruso.AlfabetoRuso;
import Alfabeto_español.AlfabetoEspanol;
import Mensaje.Mensaje;
import Mensaje_cifrado.Mensaje_cifrado;
import Submensaje_MultilplosDe.Multiplos;
import Submensaje_NumImpares.NumerosImpares;
import Submensaje_NumPares.NumerosPares;
import Submensaje_NumPrimos.NumerosPrimos;
import cifrado_series.Cifrado_series;

/**
 *
 * @author Mary Mendoza
 */
public class Pruebas {
        
    public static void main (String [] args) {
        
        Alfabeto alfabetoEspanol = new AlfabetoEspanol();
        Alfabeto alfabetoGriego = new AlfabetoGriego();
        Alfabeto alfabetoRuso = new AlfabetoRuso();   
                  
        Mensaje mensaje = new Mensaje("Hola Gaby", alfabetoEspanol); 
        Mensaje mensaje1 = new Mensaje("Γεια σας", alfabetoGriego); //ηθλ θε
        Mensaje mensaje2 = new Mensaje("Привет, Габи", alfabetoRuso);
        
        Cifrado_series cifrado = new Cifrado_series();
        
        NumerosImpares ni = new NumerosImpares(mensaje);
        NumerosPares np = new NumerosPares(mensaje);
        cifrado.agregarSubmensaje(ni.regresa_serie());
        cifrado.agregarSubmensaje(np.regresa_serie());
        Mensaje_cifrado mensaje_espanol = cifrado.cifrarMensaje();
        mensaje_espanol.imprimeMensaje();
        
        
        NumerosPrimos npr = new NumerosPrimos(mensaje1);
        Multiplos mul = new Multiplos(3,mensaje1);
        cifrado.agregarSubmensaje(npr.regresa_serie());
        cifrado.agregarSubmensaje(mul.regresa_serie());
        Mensaje_cifrado mensaje_ruso = cifrado.cifrarMensaje();
        mensaje_ruso.imprimeMensaje();
    }
}
