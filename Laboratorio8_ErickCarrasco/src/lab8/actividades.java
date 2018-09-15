/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class actividades {
    private String nombre;
    private int inicio;
    private int duracion;
    private int Final;
    public String estado_act;
    ArrayList<actividades> Predecesoras = new ArrayList();
    ArrayList<actividades> Sucesoras = new ArrayList();
    private String Posibilidad;

    public actividades() {
    }

    public actividades(String nombre, int duracion, String Posibilidad) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.Posibilidad = Posibilidad;
        this.estado_act="Standby";
    }
    
    public actividades(String nombre, int inicio, int duracion, int Final, String estado_act, String Posibilidad) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.duracion = duracion;
        this.Final = Final;
        this.estado_act = estado_act;
        this.Posibilidad = Posibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFinal() {
        return Final;
    }

    public void setFinal(int Final) {
        this.Final = Final;
    }

    public String getEstado_act() {
        return estado_act;
    }

    public void setEstado_act(String estado_act) {
        this.estado_act = estado_act;
    }

    public ArrayList<actividades> getPredecesoras() {
        return Predecesoras;
    }

    public void setPredecesoras(ArrayList<actividades> Predecesoras) {
        this.Predecesoras = Predecesoras;
    }

    public ArrayList<actividades> getSucesoras() {
        return Sucesoras;
    }

    public void setSucesoras(ArrayList<actividades> Sucesoras) {
        this.Sucesoras = Sucesoras;
    }

    public String getPosibilidad() {
        return Posibilidad;
    }

    public void setPosibilidad(String Posibilidad) {
        this.Posibilidad = Posibilidad;
    }

    @Override
    public String toString() {
        return "actividad: " + nombre;
    }

   
    
}
