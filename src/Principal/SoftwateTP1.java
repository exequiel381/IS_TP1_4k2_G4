/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Controlador.Controlador;

import Modelo.*;

import Modelo.Usuario;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author fiume
 */
public class SoftwateTP1 {

   
    
    public static void main(String[] args) {
        
       Controlador control = new Controlador();
       control.ejecutarAutenticacion();
    }
    
}
