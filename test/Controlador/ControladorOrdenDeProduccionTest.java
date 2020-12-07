/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Autenticacion;
import Modelo.Modelo;
import Modelo.OrdenDeProduccion;
import java.awt.event.ActionEvent;
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
public class ControladorOrdenDeProduccionTest {
    
    public ControladorOrdenDeProduccionTest() {
    }
    
   
    
    @Test
    public void testBuscarOP() {
        Autenticacion au = new Autenticacion("sc","sc");
        System.out.println("buscarOP");
        int Linea = 1;
        String estado = "En Proceso";
        ControladorOrdenDeProduccion instance = new ControladorOrdenDeProduccion(au);
        OrdenDeProduccion expResult = new OrdenDeProduccion(258,50, new Modelo(),1,10);
        OrdenDeProduccion result = instance.buscarOP(Linea, estado);
        assertEquals(258,result.getNumero()); // numeros de OP
    }
    
    
    
    
}
