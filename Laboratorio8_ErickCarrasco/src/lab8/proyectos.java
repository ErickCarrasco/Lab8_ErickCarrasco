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
public class proyectos {
    private String nombre;
    private String duracion;
    ArrayList<actividades> Actividades = new ArrayList();
    private String status;

    public proyectos() {
    }

    public proyectos(String nombre, String duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public ArrayList<actividades> getActividades() {
        return Actividades;
    }

    public void setActividades(ArrayList<actividades> Actividades) {
        this.Actividades = Actividades;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
