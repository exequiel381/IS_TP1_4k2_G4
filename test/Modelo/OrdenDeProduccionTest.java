/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
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
public class OrdenDeProduccionTest {
    
    public OrdenDeProduccionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of MostrarDefectosTotales method, of class OrdenDeProduccion.
     */
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

    /**
     * Test of contabilizarDefectosPorHora method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testContabilizarDefectosPorHora_3args() {
        System.out.println("contabilizarDefectosPorHora");
        int hora = 0;
        Defecto defecto = null;
        String tipoPie = "";
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.contabilizarDefectosPorHora(hora, defecto, tipoPie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contabilizarDefectosPorHora method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testContabilizarDefectosPorHora_int_Defecto() {
        System.out.println("contabilizarDefectosPorHora");
        int hora = 0;
        Defecto defecto = null;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.contabilizarDefectosPorHora(hora, defecto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of defectosEnUltimasHoras method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testDefectosEnUltimasHoras() {
        System.out.println("defectosEnUltimasHoras");
        ArrayList<Defecto> defectos = null;
        int hora = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        ArrayList<DefectoPorHora> expResult = null;
        ArrayList<DefectoPorHora> result = instance.defectosEnUltimasHoras(defectos, hora);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefectoPorHora method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetDefectoPorHora() {
        System.out.println("getDefectoPorHora");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        ArrayList<DefectoPorHora> expResult = null;
        ArrayList<DefectoPorHora> result = instance.getDefectoPorHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDefectosPorHora method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetDefectosPorHora() {
        System.out.println("setDefectosPorHora");
        ArrayList<DefectoPorHora> defectosPorHora = null;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setDefectosPorHora(defectosPorHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParesDePrimera method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetParesDePrimera() {
        System.out.println("getParesDePrimera");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getParesDePrimera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarParesDePrimera method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testAgregarParesDePrimera() {
        System.out.println("AgregarParesDePrimera");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.AgregarParesDePrimera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of QuitarParesDePrimera method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testQuitarParesDePrimera() {
        System.out.println("QuitarParesDePrimera");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.QuitarParesDePrimera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPieInpeccionado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testAgregarPieInpeccionado() {
        System.out.println("agregarPieInpeccionado");
        Pie p = null;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.agregarPieInpeccionado(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contabilizarDefectos method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testContabilizarDefectos() {
        System.out.println("contabilizarDefectos");
        int hora = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.contabilizarDefectos(hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRI_Despegado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetRI_Despegado() {
        System.out.println("getRI_Despegado");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getRI_Despegado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRI_Despegado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetRI_Despegado() {
        System.out.println("setRI_Despegado");
        int RI_Despegado = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setRI_Despegado(RI_Despegado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRI_Descolorido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetRI_Descolorido() {
        System.out.println("getRI_Descolorido");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getRI_Descolorido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRI_Descolorido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetRI_Descolorido() {
        System.out.println("setRI_Descolorido");
        int RI_Descolorido = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setRI_Descolorido(RI_Descolorido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRI_Deformado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetRI_Deformado() {
        System.out.println("getRI_Deformado");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getRI_Deformado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRI_Deformado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetRI_Deformado() {
        System.out.println("setRI_Deformado");
        int RI_Deformado = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setRI_Deformado(RI_Deformado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRD_Despegado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetRD_Despegado() {
        System.out.println("getRD_Despegado");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getRD_Despegado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRD_Despegado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetRD_Despegado() {
        System.out.println("setRD_Despegado");
        int RD_Despegado = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setRD_Despegado(RD_Despegado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRD_Descolorido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetRD_Descolorido() {
        System.out.println("getRD_Descolorido");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getRD_Descolorido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRD_Descolorido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetRD_Descolorido() {
        System.out.println("setRD_Descolorido");
        int RD_Descolorido = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setRD_Descolorido(RD_Descolorido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRD_Deformado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetRD_Deformado() {
        System.out.println("getRD_Deformado");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getRD_Deformado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRD_Deformado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetRD_Deformado() {
        System.out.println("setRD_Deformado");
        int RD_Deformado = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setRD_Deformado(RD_Deformado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOI_Despegado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetOI_Despegado() {
        System.out.println("getOI_Despegado");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getOI_Despegado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOI_Despegado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetOI_Despegado() {
        System.out.println("setOI_Despegado");
        int OI_Despegado = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setOI_Despegado(OI_Despegado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOI_Descolorido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetOI_Descolorido() {
        System.out.println("getOI_Descolorido");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getOI_Descolorido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOI_Descolorido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetOI_Descolorido() {
        System.out.println("setOI_Descolorido");
        int OI_Descolorido = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setOI_Descolorido(OI_Descolorido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOI_Partido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetOI_Partido() {
        System.out.println("getOI_Partido");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getOI_Partido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOI_Partido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetOI_Partido() {
        System.out.println("setOI_Partido");
        int OI_Partido = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setOI_Partido(OI_Partido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOD_Despegado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetOD_Despegado() {
        System.out.println("getOD_Despegado");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getOD_Despegado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOD_Despegado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetOD_Despegado() {
        System.out.println("setOD_Despegado");
        int OD_Despegado = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setOD_Despegado(OD_Despegado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOD_Descolorido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetOD_Descolorido() {
        System.out.println("getOD_Descolorido");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getOD_Descolorido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOD_Descolorido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetOD_Descolorido() {
        System.out.println("setOD_Descolorido");
        int OD_Descolorido = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setOD_Descolorido(OD_Descolorido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOD_Partido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetOD_Partido() {
        System.out.println("getOD_Partido");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getOD_Partido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOD_Partido method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetOD_Partido() {
        System.out.println("setOD_Partido");
        int OD_Partido = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setOD_Partido(OD_Partido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPies method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetPies() {
        System.out.println("getPies");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        ArrayList<Pie> expResult = null;
        ArrayList<Pie> result = instance.getPies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPies method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetPies() {
        System.out.println("setPies");
        ArrayList<Pie> pies = null;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setPies(pies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetNumero() {
        System.out.println("getNumero");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivo method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetObjetivo() {
        System.out.println("getObjetivo");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getObjetivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetivo method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetObjetivo() {
        System.out.println("setObjetivo");
        int Objetivo = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setObjetivo(Objetivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetEstado() {
        System.out.println("getEstado");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelo method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetModelo() {
        System.out.println("getModelo");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        Modelo expResult = null;
        Modelo result = instance.getModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetModelo() {
        System.out.println("setModelo");
        Modelo modelo = null;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setModelo(modelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLinea method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetLinea() {
        System.out.println("getLinea");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        int expResult = 0;
        int result = instance.getLinea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLinea method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetLinea() {
        System.out.println("setLinea");
        int linea = 0;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setLinea(linea);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testGetColor() {
        System.out.println("getColor");
        OrdenDeProduccion instance = new OrdenDeProduccion();
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class OrdenDeProduccion.
     */
    @org.junit.Test
    public void testSetColor() {
        System.out.println("setColor");
        Color color = null;
        OrdenDeProduccion instance = new OrdenDeProduccion();
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
