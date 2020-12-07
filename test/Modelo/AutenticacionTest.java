/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fiume
 */
public class AutenticacionTest {
    
   
   
    @Test
    public void testObtenerRolDelUsuarioAutenticadoParaMostrarVentanas() {
        System.out.println("ObtenerRol");
        Autenticacion instance = new Autenticacion("sl","sl");
       
        String expResult = "SupervisorLinea";
        String result = instance.ObtenerRol();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test
    public void testCrearOrdenDeProduccion(){
        System.out.println("Crear OP");
        Modelo modelo = new Modelo("modell", 500);
        OrdenDeProduccion expResult = new OrdenDeProduccion(301, 500, modelo, 2, 12);
        int NumeroDeOPCreada = 301;
        
        Autenticacion a = new Autenticacion("sl","sl");
        OrdenDeProduccion result = a.crearOP(301, 500, modelo, 2, 12,"rosa");
        
        assertEquals(301, result.getNumero());
        
    }
    
}
