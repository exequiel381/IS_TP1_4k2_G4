/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author fiume
 */
public class Repositorio {

    public ArrayList<Usuario> usuarios;
    public ArrayList<OrdenDeProduccion> ordenes;
    public ArrayList<Defecto> defectos;
    public ArrayList<Modelo> modelos;
    public ArrayList<Color> colores;
    public ArrayList<Turno> turnos;
    private static Repositorio miRepositorio;

    private ArrayList<Integer> horas;

    public static Repositorio getRepositorio() {

        if (miRepositorio == null) {

            miRepositorio = new Repositorio();
        }
        return miRepositorio;
    }

    private Repositorio() {

        usuarios = new ArrayList<>();

        Empleado adm = new Empleado("Administrador");
        Usuario user1 = new Usuario(adm, "admin", "admin");
        usuarios.add(user1);

        Empleado sl = new Empleado("SupervisorLinea");
        Usuario user2 = new Usuario(sl, "sl", "sl");
        usuarios.add(user2);

        Empleado sc = new Empleado("SupervisorCalidad");
        Usuario user3 = new Usuario(sc, "sc", "sc");
        usuarios.add(user3);

        Empleado dl = new Empleado("datosenlinea");
        Usuario user4 = new Usuario(dl, "datosenlinea", "");
        usuarios.add(user4);

        modelos = new ArrayList<>();

        Modelo m1 = new Modelo("modelo1", 50);
        modelos.add(m1);
        Modelo m2 = new Modelo("modelo2", 60);
        modelos.add(m2);

        colores = new ArrayList<>();

        Color color1 = new Color("Rojo");
        colores.add(color1);
        Color color2 = new Color("Azul");
        colores.add(color2);
        Color color3 = new Color("Morado");
        colores.add(color3);

        defectos = new ArrayList<Defecto>();

        Defecto d1 = new Defecto(1, "Despegado", TipoDefecto.Observado.toString());
        Defecto d2 = new Defecto(2, "Descolorido", TipoDefecto.Observado.toString());
        Defecto d3 = new Defecto(3, "Partido", TipoDefecto.Observado.toString());
        Defecto d4 = new Defecto(4, "Despegado", TipoDefecto.Reproceso.toString());
        Defecto d5 = new Defecto(5, "Descolorido", TipoDefecto.Reproceso.toString());
        Defecto d6 = new Defecto(6, "Deformado", TipoDefecto.Reproceso.toString());

        defectos.add(d1);
        defectos.add(d2);
        defectos.add(d3);
        defectos.add(d4);
        defectos.add(d5);
        defectos.add(d6);

        ArrayList<DefectoPorHora> defectosPorHora = new ArrayList<>();

        DefectoPorHora dh1 = new DefectoPorHora(10, d1, "Izquierdo");
        DefectoPorHora dh2 = new DefectoPorHora(10, d3, "Izquierdo");
        DefectoPorHora dh3 = new DefectoPorHora(10, d4, "Derecho");
        DefectoPorHora dh4 = new DefectoPorHora(10, d4, "Derecho");
        DefectoPorHora dh5 = new DefectoPorHora(10, d1, "Derecho");
        DefectoPorHora dh6 = new DefectoPorHora(8, d3, "Derecho");
        DefectoPorHora dh7 = new DefectoPorHora(7, d6, "Derecho");
        DefectoPorHora dh8 = new DefectoPorHora(5, d5, "Derecho");
        DefectoPorHora dh9 = new DefectoPorHora(9, d4, "Izquierdo");

        defectosPorHora.add(dh1);
        defectosPorHora.add(dh2);
        defectosPorHora.add(dh3);
        defectosPorHora.add(dh4);
        defectosPorHora.add(dh5);
        defectosPorHora.add(dh6);
        defectosPorHora.add(dh7);
        defectosPorHora.add(dh8);
        defectosPorHora.add(dh9);

        ordenes = new ArrayList<OrdenDeProduccion>();

        OrdenDeProduccion op1 = new OrdenDeProduccion(258, m1.getObjetivo(), m1, 1);
        op1.setColor(color3);
        op1.setDefectosPorHora(defectosPorHora);
        ordenes.add(op1);

        OrdenDeProduccion op2 = new OrdenDeProduccion(2, m2.getObjetivo(), m2, 2);
        op2.setColor(color1);
        op2.setEstado("Finalizado");
        ordenes.add(op2);

        //Modelo m3 = new Modelo("modelo1",70,color3);
        //OrdenDeProduccion op3 = new OrdenDeProduccion(3, m3.getObjetivo(), m3 , 1);
        turnos = new ArrayList<>();

        horas = new ArrayList<>();

        horas.add(14);
        horas.add(15);
        horas.add(16);
        horas.add(17);
        horas.add(18);

        Turno tarde = new Turno("Tarde", horas);

        turnos.add(tarde);

    }

    public Color buscarColor(String color) {
        Color c = null;

        for (Color e : colores) {
            if (e.getDescripcion().equals(color)) {
                c = e;
            }
        }
        return c;

    }

    public Modelo buscarModelo(String modelo) {
        Modelo m = null;

        for (Modelo e : modelos) {
            if (e.getDescripcion().equals(modelo)) {
                m = e;
            }
        }
        return m;
    }

}
