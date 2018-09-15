/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;
//import javax.scene.control.ComboBox;
/**
 *
 * @author erick
 */
public class HiloExecute extends Thread{
    private String estado;
    private int duracion;
    private boolean vive;
    private boolean sigue;
    private DefaultTableModel modelo;
    private int pos;

    public HiloExecute(String estado, int duracion, DefaultTableModel modelo, int pos) {
        this.estado = estado;
        this.duracion = duracion;
        this.modelo = modelo;
        this.pos = pos;
        vive=true;
        sigue=true;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
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

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isSigue() {
        return sigue;
    }

    public void setSigue(boolean sigue) {
        this.sigue = sigue;
    }
    
    int c =1;
    
    @Override
    public void run() {
        while (vive) {
            if (sigue) {
                c++;
                System.out.println(c);

            }
            if (duracion <= 0) {
                vive = false;

            }

            try {
                Thread.sleep(1000);

                duracion = -1000;
                System.out.println(duracion);
            } catch (InterruptedException e) {

            }

        }
        estado = "Finished";
        JOptionPane.showMessageDialog(null, estado);
        modelo.setValueAt(estado, pos, 2);
    }
}
