/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author fiume
 */
public class DefectoPorHora implements Comparable<DefectoPorHora>{
    private int hora;
    private Defecto defecto;
    private String pie;
    private Integer cantidad;

    public DefectoPorHora(int hora, Defecto defecto, String pie) {
        this.hora = hora;
        this.pie=pie;
        this.defecto = defecto;
    }

    public DefectoPorHora(int hora, Defecto defecto, int cantidad) {
        this.hora = hora;
        this.defecto = defecto;
        this.cantidad = cantidad;
    }
    
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

    public DefectoPorHora() {
    }
    
    

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Defecto getDefecto() {
        return defecto;
    }

    public void setDefecto(Defecto defecto) {
        this.defecto = defecto;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    @Override
    public int compareTo(DefectoPorHora t) {
        return this.cantidad.compareTo(t.getCantidad());
    }
    
    
    
}
