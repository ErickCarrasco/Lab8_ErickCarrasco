/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author erick
 */
public class Main_Menu_P extends javax.swing.JFrame {

    /**
     * Creates new form Main_Menu_P
     */
    public Main_Menu_P() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_create_project = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre_proyecto = new javax.swing.JTextField();
        jb_crear_proyecto = new javax.swing.JButton();
        jd_create_activity = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre_activity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        js_duracion = new javax.swing.JSpinner();
        js_retraso = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jb_guardar_actividad = new javax.swing.JButton();
        cb_proyectos_nova = new javax.swing.JComboBox();
        jb_ayuda_activity_add = new javax.swing.JButton();
        jd_project_editor = new javax.swing.JDialog();
        cb_projects_editors = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_projects_modify = new javax.swing.JTree();
        jb_exit_sv = new javax.swing.JButton();
        jd_add_otro_act = new javax.swing.JDialog();
        cb_actividades = new javax.swing.JComboBox();
        jb_add_ac_n = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jb_crearproject = new javax.swing.JButton();
        jb_crearactivity = new javax.swing.JButton();
        jb_see_projects = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_main = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        cb_main_proyects = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Eurostile Extended", 0, 18)); // NOI18N
        jLabel1.setText("Creacion de Proyecto");

        jLabel2.setText("Nombre");

        jb_crear_proyecto.setText("Crear proyecto");
        jb_crear_proyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crear_proyectoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_create_projectLayout = new javax.swing.GroupLayout(jd_create_project.getContentPane());
        jd_create_project.getContentPane().setLayout(jd_create_projectLayout);
        jd_create_projectLayout.setHorizontalGroup(
            jd_create_projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_create_projectLayout.createSequentialGroup()
                .addGroup(jd_create_projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_create_projectLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nombre_proyecto))
                    .addGroup(jd_create_projectLayout.createSequentialGroup()
                        .addContainerGap(89, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(80, 80, 80))
            .addGroup(jd_create_projectLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jb_crear_proyecto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_create_projectLayout.setVerticalGroup(
            jd_create_projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_create_projectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jd_create_projectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jb_crear_proyecto)
                .addGap(25, 25, 25))
        );

        jLabel3.setFont(new java.awt.Font("Eurostile Extended", 0, 18)); // NOI18N
        jLabel3.setText("Crear Actividad");

        jLabel4.setText("Nombre");

        jLabel5.setText("Duracion");

        jLabel6.setText("T. Retraso");

        jb_guardar_actividad.setText("Guardar");
        jb_guardar_actividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardar_actividadMouseClicked(evt);
            }
        });

        jb_ayuda_activity_add.setText("Ayuda");
        jb_ayuda_activity_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ayuda_activity_addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_create_activityLayout = new javax.swing.GroupLayout(jd_create_activity.getContentPane());
        jd_create_activity.getContentPane().setLayout(jd_create_activityLayout);
        jd_create_activityLayout.setHorizontalGroup(
            jd_create_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_create_activityLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_create_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(77, 77, 77)
                .addGroup(jd_create_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_guardar_actividad)
                    .addGroup(jd_create_activityLayout.createSequentialGroup()
                        .addGroup(jd_create_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_nombre_activity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_create_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(js_retraso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                .addComponent(js_duracion, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(cb_proyectos_nova, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addComponent(jb_ayuda_activity_add))))
        );
        jd_create_activityLayout.setVerticalGroup(
            jd_create_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_create_activityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_create_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_proyectos_nova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_ayuda_activity_add))
                .addGap(30, 30, 30)
                .addGroup(jd_create_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombre_activity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_create_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(js_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_create_activityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_retraso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addComponent(jb_guardar_actividad)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        cb_projects_editors.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_projects_editorsItemStateChanged(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Root");
        jt_projects_modify.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jt_projects_modify);

        jb_exit_sv.setText("Salir");
        jb_exit_sv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_exit_svMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_project_editorLayout = new javax.swing.GroupLayout(jd_project_editor.getContentPane());
        jd_project_editor.getContentPane().setLayout(jd_project_editorLayout);
        jd_project_editorLayout.setHorizontalGroup(
            jd_project_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_project_editorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jd_project_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_project_editorLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_exit_sv))
                    .addComponent(cb_projects_editors, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jd_project_editorLayout.setVerticalGroup(
            jd_project_editorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_project_editorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_projects_editors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_project_editorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_exit_sv)
                .addContainerGap())
        );

        jb_add_ac_n.setText("Agregar Sucesor");
        jb_add_ac_n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_add_ac_nMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_add_otro_actLayout = new javax.swing.GroupLayout(jd_add_otro_act.getContentPane());
        jd_add_otro_act.getContentPane().setLayout(jd_add_otro_actLayout);
        jd_add_otro_actLayout.setHorizontalGroup(
            jd_add_otro_actLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_otro_actLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jd_add_otro_actLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_add_ac_n)
                    .addComponent(cb_actividades, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jd_add_otro_actLayout.setVerticalGroup(
            jd_add_otro_actLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_otro_actLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_actividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jb_add_ac_n)
                .addGap(19, 19, 19))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        jb_crearproject.setText("Crear Proyecto");
        jb_crearproject.setFocusable(false);
        jb_crearproject.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_crearproject.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_crearproject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearprojectMouseClicked(evt);
            }
        });
        jToolBar1.add(jb_crearproject);

        jb_crearactivity.setText("Crear actividad");
        jb_crearactivity.setFocusable(false);
        jb_crearactivity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_crearactivity.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_crearactivity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearactivityMouseClicked(evt);
            }
        });
        jToolBar1.add(jb_crearactivity);

        jb_see_projects.setText("Ver proyectos");
        jb_see_projects.setFocusable(false);
        jb_see_projects.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_see_projects.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_see_projects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_see_projectsMouseClicked(evt);
            }
        });
        jToolBar1.add(jb_see_projects);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Project Nova");
        jt_main.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_main);

        jButton1.setText("Ejecutar");

        cb_main_proyects.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_main_proyectsItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(cb_main_proyects, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_main_proyects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearprojectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearprojectMouseClicked
        // TODO add your handling code here:
        jd_create_project.setModal(true);
        jd_create_project.pack();
        jd_create_project.setLocationRelativeTo(this);
        jd_create_project.setVisible(true);
    }//GEN-LAST:event_jb_crearprojectMouseClicked

    private void jb_crear_proyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crear_proyectoMouseClicked
        // TODO add your handling code here:
        String nombre= tf_nombre_proyecto.getText();
        int duracion = 0;
        String estado = "nulo";
        proyectos.add(new CrearProyecto(duracion, nombre, estado));
        DefaultComboBoxModel modelo;
            modelo = new DefaultComboBoxModel(proyectos.toArray());
            cb_main_proyects.setModel(modelo);
        JOptionPane.showMessageDialog(jd_create_project, "Project created");
        tf_nombre_proyecto.setText("");
        jd_create_project.dispose();
        jd_create_project.setVisible(false);
    }//GEN-LAST:event_jb_crear_proyectoMouseClicked

    private void jb_guardar_actividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardar_actividadMouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(
                jd_create_activity,
                "Crear actividad como principal?",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
      
        if (response == JOptionPane.OK_OPTION) {
            String con = tf_nombre_activity.getText();
            int dur = (Integer)(js_duracion.getValue());
            int retraso = (Integer)js_retraso.getValue();
            nombre_ac=con;
            duracion_act=dur;
            retr_g=retraso;
            int c = cb_proyectos_nova.getSelectedIndex();
            proyectos.get(c).getListaActividades().add(new Actividades(con,dur, retraso ));
            int la = proyectos.get(c).getListaActividades().size();
            proyectos.get(c).getListaActividades().get(la-1).setInicio_temprano(1);
           
            DefaultComboBoxModel modelo2;
            modelo2 = new DefaultComboBoxModel(proyectos.toArray());
            cb_main_proyects.setModel(modelo2);
            
            JOptionPane.showMessageDialog(jd_create_activity, "Se ha agregado actividad");
            tf_nombre_activity.setText("");
            js_duracion.setValue(0);
            js_retraso.setValue(0);
            jd_create_activity.dispose();
            jd_create_activity.setVisible(false);
        }
        if (response != JOptionPane.OK_OPTION) {
            int c = cb_proyectos_nova.getSelectedIndex();
            var = c;
            DefaultComboBoxModel modelo;
            modelo = new DefaultComboBoxModel(proyectos.get(var).getListaActividades().toArray());
            cb_actividades.setModel(modelo);
            jd_add_otro_act.setModal(true);
            jd_add_otro_act.pack();
            jd_add_otro_act.setLocationRelativeTo(jd_create_activity);
            jd_add_otro_act.setVisible(true);
            
            
        }
    }//GEN-LAST:event_jb_guardar_actividadMouseClicked

    private void jb_crearactivityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearactivityMouseClicked
        DefaultComboBoxModel modelo;
        modelo = new DefaultComboBoxModel(proyectos.toArray());
        cb_proyectos_nova.setModel(modelo);
        jd_create_activity.setModal(true);
        jd_create_activity.pack();
        jd_create_activity.setLocationRelativeTo(this);
        jd_create_activity.setVisible(true);
    }//GEN-LAST:event_jb_crearactivityMouseClicked

    private void jb_ayuda_activity_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ayuda_activity_addMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(jd_create_activity, "1/ Caja de seleccion Vacia: \n"
                + "Esto ha ocurrido porque no ha agregado algun proyecto \n"
                + "2/ Agregar actividad \n"
                + "Agregar una actividad al proyecto seleccionado \n"
                
                + "");
    }//GEN-LAST:event_jb_ayuda_activity_addMouseClicked

    private void jb_see_projectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_see_projectsMouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel modelo;
        modelo = new DefaultComboBoxModel(proyectos.toArray());
        cb_projects_editors.setModel(modelo);
        jd_project_editor.setModal(true);
        jd_project_editor.pack();
        jd_project_editor.setLocationRelativeTo(this);
        jd_project_editor.setVisible(true);
    }//GEN-LAST:event_jb_see_projectsMouseClicked

    private void jb_exit_svMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_exit_svMouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel modelo2;
            modelo2 = new DefaultComboBoxModel(proyectos.toArray());
            cb_main_proyects.setModel(modelo2);
        jd_project_editor.dispose();
        jd_project_editor.setVisible(false);
    }//GEN-LAST:event_jb_exit_svMouseClicked

    private void cb_main_proyectsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_main_proyectsItemStateChanged
        // TODO add your handling code here:
        seleccion_main= cb_main_proyects.getSelectedIndex();
        DefaultTreeModel modelo = (DefaultTreeModel) jt_main.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        DefaultMutableTreeNode project = null;
        raiz.removeAllChildren();
        project = new DefaultMutableTreeNode(proyectos.get(seleccion_main));
        raiz.add(project);
        modelo.reload();
        
    }//GEN-LAST:event_cb_main_proyectsItemStateChanged

    private void cb_projects_editorsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_projects_editorsItemStateChanged
        // TODO add your handling code here:
        try {
            seleccion_main = cb_projects_editors.getSelectedIndex();
            CrearProyecto p = (CrearProyecto) cb_projects_editors.getSelectedItem();
            DefaultTreeModel modelo = (DefaultTreeModel) jt_projects_modify.getModel();
            DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(p);
            modelo.setRoot(raiz);
            DefaultMutableTreeNode r = (DefaultMutableTreeNode) modelo.getRoot();
            r.removeAllChildren();
            DefaultMutableTreeNode n1 = null;
            DefaultMutableTreeNode n2 = null;
            DefaultMutableTreeNode n3 = null;
            for (Actividades t : p.getListaActividades()) {
                if (t.getActividadesPred().isEmpty() && t.getActividadesSuc().isEmpty()) {
                    n1 = new DefaultMutableTreeNode(t);
                    raiz.add(n1);
                } else {
                    for (Actividades l : t.getActividadesPred()) {
                        n2 = new DefaultMutableTreeNode(l);
                        for (Actividades n : l.getActividadesSuc()) {
                            n3 = new DefaultMutableTreeNode(n);
                            n3.add(n2);
                        }
                        raiz.add(n3);
                    }
                }
            }
            modelo.reload();
        } catch (Exception e) {

        }
        
    }//GEN-LAST:event_cb_projects_editorsItemStateChanged

    private void jb_add_ac_nMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_add_ac_nMouseClicked
        // TODO add your handling code here:
        int s = cb_actividades.getSelectedIndex();
        proyectos.get(var).getListaActividades().add(new Actividades(nombre_ac, duracion_act, retr_g));
        proyectos.get(var).getListaActividades().get(s).getActividadesSuc().add(new Actividades(nombre_ac, duracion_act, retr_g));
        
        int d=proyectos.get(var).getListaActividades().get(s).getInicio_temprano();
        
        proyectos.get(var).getListaActividades().get(s).setFinal_temprano(d+duracion_act);
    }//GEN-LAST:event_jb_add_ac_nMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Menu_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu_P().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_actividades;
    private javax.swing.JComboBox cb_main_proyects;
    private javax.swing.JComboBox cb_projects_editors;
    private javax.swing.JComboBox cb_proyectos_nova;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jb_add_ac_n;
    private javax.swing.JButton jb_ayuda_activity_add;
    private javax.swing.JButton jb_crear_proyecto;
    private javax.swing.JButton jb_crearactivity;
    private javax.swing.JButton jb_crearproject;
    private javax.swing.JButton jb_exit_sv;
    private javax.swing.JButton jb_guardar_actividad;
    private javax.swing.JButton jb_see_projects;
    private javax.swing.JDialog jd_add_otro_act;
    private javax.swing.JDialog jd_create_activity;
    private javax.swing.JDialog jd_create_project;
    private javax.swing.JDialog jd_project_editor;
    private javax.swing.JSpinner js_duracion;
    private javax.swing.JSpinner js_retraso;
    private javax.swing.JTree jt_main;
    private javax.swing.JTree jt_projects_modify;
    private javax.swing.JTextField tf_nombre_activity;
    private javax.swing.JTextField tf_nombre_proyecto;
    // End of variables declaration//GEN-END:variables
    ArrayList <CrearProyecto> proyectos = new ArrayList();
    int var=0;
    int var2=0;
    String nombre_ac;
    int duracion_act;
    int retr_g;
    int seleccion_main;
    
}
