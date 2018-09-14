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
public class Actividades {
    private String nombre;
    private int inicio_temprano;
    private int duracion;
    private int final_temprano;
    private ArrayList <Actividades> actividadesPred = new ArrayList();
    private ArrayList <Actividades> actividadesSuc = new ArrayList();
    private int retraso;

    public Actividades(String nombre, int duracion, int retraso) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.retraso = retraso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInicio_temprano() {
        return inicio_temprano;
    }

    public void setInicio_temprano(int inicio_temprano) {
        this.inicio_temprano = inicio_temprano;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFinal_temprano() {
        return final_temprano;
    }

    public void setFinal_temprano(int final_temprano) {
        this.final_temprano = final_temprano;
    }

    public ArrayList<Actividades> getActividadesPred() {
        return actividadesPred;
    }

    public void setActividadesPred(ArrayList<Actividades> actividadesPred) {
        this.actividadesPred = actividadesPred;
    }

    public ArrayList<Actividades> getActividadesSuc() {
        return actividadesSuc;
    }

    public void setActividadesSuc(ArrayList<Actividades> actividadesSuc) {
        this.actividadesSuc = actividadesSuc;
    }

    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
