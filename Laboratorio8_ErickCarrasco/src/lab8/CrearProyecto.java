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
public class CrearProyecto {
    private int duracion;
    private String nombre;
    private ArrayList <Actividades> listaActividades = new ArrayList();
    private String estado;

    

    public CrearProyecto(int duracion, String nombre, String estado) {
        this.duracion = duracion;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Actividades> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ArrayList<Actividades> listaActividades) {
        this.listaActividades = listaActividades;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    
}
