/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 *
 * @author fiume
 */
public class OrdenDeProduccionTest {
    
   
    @org.junit.Test
    public void testContabilizarDefectosPorHora_3args() {
       
        System.out.println("contabilizarDefectosPorHora");
        
        OrdenDeProduccion instance = new OrdenDeProduccion();
        
        Defecto defecto = new Defecto(1 , "Despegado", "Observado");
        
        Hallasgo dh1 = new Hallasgo(10, defecto, "Izquierdo",1,0);
        Hallasgo dh2 = new Hallasgo(10, defecto, "Izquierdo",1,0);
        Hallasgo dh3 = new Hallasgo(10, defecto, "Izquierdo",-1,0);
        Hallasgo dh4 = new Hallasgo(10, defecto, "Izquierdo",1,0);
        Hallasgo dh5 = new Hallasgo(10, defecto, "Derecho",1,0);
        
        int hora = 10;
        
        String tipoPie = "Izquierdo";
        
        int expResult = 2;
        
        int result = instance.contabilizarDefectosPorHora(hora, defecto, tipoPie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /*
    @org.junit.Test
    public void testMostrarDefectosTotales() {
        System.out.println("MostrarDefectosTotales");
        Turno turno = null;
        ArrayList<Defecto> defectos = null;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.MostrarDefectosTotales(turno, defectos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    

   

   

    @org.junit.Test
    public void testAgregarParesDePrimera() {
        System.out.println("AgregarParesDePrimera");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.AgregarParesDePrimera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @org.junit.Test
    public void testQuitarParesDePrimera() {
        System.out.println("QuitarParesDePrimera");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.QuitarParesDePrimera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    */
}
