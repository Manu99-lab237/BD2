/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tel_conexion;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.String;
import java.sql.Connection;
import java.sql.PreparedStatement;
import tel_conexion.Tel_conexion;
import Procedimientos_Almacenados.sp;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Set;
import java.util.Vector;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose_
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ResultSet res,rs;
    Tel_conexion con;
    DefaultTableModel model= new DefaultTableModel();
    PreparedStatement ps=null;
    Statement st=null;
    public Principal() {
        
        initComponents();
        
        
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.gray);
        Cargar_Empleados();
        
    }
    public void Cargar_Empleados(){
        DefaultTableModel modelo=(DefaultTableModel) empTable.getModel();
        modelo.setRowCount(0);
        try {
            res = tel_conexion.Tel_conexion.Consulta("select * from empleado");
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            while(res.next()){
                Vector v =new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getInt(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                v.add(res.getString(8));
                v.add(res.getString(9));
                modelo.addRow(v);
                empTable.setModel(modelo);
            }
        }catch(SQLException e){
            
        }
        
        
    }
   
    
    
    
    
    
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        app = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        apm = new javax.swing.JLabel();
        clave = new javax.swing.JLabel();
        nss = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        salarytxt = new javax.swing.JTextField();
        apptxt = new javax.swing.JTextField();
        apmtxt = new javax.swing.JTextField();
        nsstxt = new javax.swing.JTextField();
        usertxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        passtxt = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        ID = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        datetxt = new javax.swing.JFormattedTextField();
        cleanfields = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(77, 5, 232));

        title.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        title.setText("Insertar empleado:");

        title2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        title2.setText("Lista empleados:");

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setText("Nombre(s):");

        user.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        user.setText("Usuario:");

        app.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        app.setText("Apellido Paterno:");

        salary.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salary.setText("Sueldo del empleado:");

        date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date.setText("Fecha de ingreso del empleado:");

        apm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        apm.setText("Apellido Materno:");

        clave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clave.setText("Clave:");

        nss.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nss.setText("Número de seguro social empleado:");

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nametxtKeyTyped(evt);
            }
        });

        salarytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salarytxtKeyTyped(evt);
            }
        });

        apptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apptxtActionPerformed(evt);
            }
        });
        apptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apptxtKeyTyped(evt);
            }
        });

        apmtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apmtxtKeyTyped(evt);
            }
        });

        nsstxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nsstxtKeyTyped(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id_empleado", "nom_empleado", "app_empleado", "apm_empleado", "sueldo_empleado", "fecha_ingreso_empleado", "nss_empleado", "usuario", "clave"
            }
        ));
        empTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(empTable);

        ID.setText("ID:");

        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtxtKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Buscar empleado:");

        jLabel2.setText("YY/MM/DD");

        jButton6.setText("Actualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        cleanfields.setText("Limpiar Campos");
        cleanfields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanfieldsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(app, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(name)
                                            .addComponent(ID))
                                        .addGap(40, 40, 40)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apptxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 149, 149))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(date)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usertxt, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                    .addComponent(datetxt)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(user)
                                            .addComponent(nss)
                                            .addComponent(clave))
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(apm)
                                            .addComponent(salary))
                                        .addGap(49, 49, 49)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apmtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salarytxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nsstxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(passtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(392, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cleanfields)
                        .addGap(141, 141, 141))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(563, 563, 563)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(537, 537, 537))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(cleanfields)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(app, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nsstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nss, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void apptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apptxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Validamos que todos los campos esten llenos
        if(this.nametxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta llenar el campo nombre", "INVALIDO", JOptionPane.WARNING_MESSAGE);
            this.nametxt.requestFocus();
        } else if(this.apptxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta llenar el campo apellido paterno", "INVALIDO", JOptionPane.WARNING_MESSAGE);
            this.apptxt.requestFocus();
        } else if(this.apmtxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta llenar el campo apellido materno", "INVALIDO", JOptionPane.WARNING_MESSAGE);
            this.apmtxt.requestFocus();
        } else if(this.salarytxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta llenar el campo salario", "INVALIDO", JOptionPane.WARNING_MESSAGE);
            this.salarytxt.requestFocus();
        } else if(this.datetxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta llenar el campo fecha de ingreso del empleado", "INVALIDO", JOptionPane.WARNING_MESSAGE);
            this.datetxt.requestFocus();
        } else if(this.nsstxt.getText().equals("") && this.nsstxt.getText().length()>11){
            JOptionPane.showMessageDialog(null, "Falta llenar el campo NSS del empleado", "INVALIDO", JOptionPane.WARNING_MESSAGE);
            this.nsstxt.requestFocus();
        } else if(this.usertxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta llenar el campo usuario", "INVALIDO", JOptionPane.WARNING_MESSAGE);
            this.usertxt.requestFocus();
        } else if(this.passtxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta llenar el campo clave", "INVALIDO", JOptionPane.WARNING_MESSAGE);
            this.passtxt.requestFocus();
        } else{
            
                String valorpass= new String (passtxt.getPassword());
                String x = salarytxt.getText();
                int i=Integer.parseInt(x);
            try {
                sp.insertaEmpleado(nametxt.getText(), apptxt.getText(), apmtxt.getText(), i, datetxt.getText(), nsstxt.getText(), usertxt.getText(), valorpass);
                Cargar_Empleados();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                nametxt.setText("");
                apptxt.setText("");
                apmtxt.setText("");
                salarytxt.setText("");
                datetxt.setText("");
                nsstxt.setText("");
                usertxt.setText("");
                passtxt.setText("");
            
            
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void empTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTableMouseClicked
        // TODO add your handling code here:
        //CARGAR DATOS CON SOLO UN CLICK
        int seleccionar=empTable.rowAtPoint(evt.getPoint());
        id.setText(String.valueOf(empTable.getValueAt(seleccionar, 0)));
        nametxt.setText(String.valueOf(empTable.getValueAt(seleccionar, 1)));
        apptxt.setText(String.valueOf(empTable.getValueAt(seleccionar, 2)));
        apmtxt.setText(String.valueOf(empTable.getValueAt(seleccionar, 3)));
        salarytxt.setText(String.valueOf(empTable.getValueAt(seleccionar, 4)));
        datetxt.setText(String.valueOf(empTable.getValueAt(seleccionar, 5)));
        nsstxt.setText(String.valueOf(empTable.getValueAt(seleccionar, 6)));
        usertxt.setText(String.valueOf(empTable.getValueAt(seleccionar, 7)));
        passtxt.setText(String.valueOf(empTable.getValueAt(seleccionar, 8)));
        
    }//GEN-LAST:event_empTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //ELIMINAR
        int row=empTable.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null, "PRIMERO SELECCIONE UN REGISTRO!");
        }else{
        int opc = JOptionPane.showConfirmDialog(this, "¿Estas seguro que desea eliminar el registro seleccionado?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opc==JOptionPane.YES_OPTION){
            try{
                sp.eliminaEmpleado(Integer.parseInt(empTable.getValueAt(row, 0).toString()));
                Cargar_Empleados();
            }catch(SQLException e){
                
            }
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //MODIFICAR
        int n=Integer.parseInt(id.getText());
        try{
            PreparedStatement c=Tel_conexion.GetConnection().prepareStatement("update empleado set nom_empleado='" + nametxt.getText() + "', app_empleado='" + apptxt.getText() + "', apm_empleado='" + apmtxt.getText() + 
                    "', sueldo_empleado='" + salarytxt.getText() + "', fecha_ingreso_empleado='" + datetxt.getText() + "', nss_empleado='" + nsstxt.getText() + "', usuario='" + usertxt.getText() + "', clave='" + passtxt.getText() + 
                    "' where id_empleado='" + n + "'");
            c.executeUpdate();
            JOptionPane.showMessageDialog(null, "LOS DATOS FUERON MODIFICADOS");
            id.setText("");
            nametxt.setText("");
            apptxt.setText("");
            apmtxt.setText("");
            salarytxt.setText("");
            datetxt.setText("");
            nsstxt.setText("");
            usertxt.setText("");
            passtxt.setText("");
            Cargar_Empleados();
        }catch(SQLException e){
        }
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void nsstxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nsstxtKeyTyped
        //Limitamos el numero de caracteres en el campo
        if(nsstxt.getText().length() >= 11){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            
        }
        char t=evt.getKeyChar();
        if(t<'0' || t>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_nsstxtKeyTyped

    private void salarytxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarytxtKeyTyped
        //Validamos que solo inserten numeros
        char c=evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_salarytxtKeyTyped

    private void nametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxtKeyTyped
        //Validamos que solo se inserten letras
        char f=evt.getKeyChar();
        if(Character.isDigit(f)) evt.consume();
        
    }//GEN-LAST:event_nametxtKeyTyped

    private void apptxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apptxtKeyTyped
        //Validamos que solo sean letras
        char a=evt.getKeyChar();
        if(Character.isDigit(a)) evt.consume();
    }//GEN-LAST:event_apptxtKeyTyped

    private void apmtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apmtxtKeyTyped
        // Validamos solo letras
        char b=evt.getKeyChar();
        if(Character.isDigit(b)) evt.consume();
    }//GEN-LAST:event_apmtxtKeyTyped

    private void searchtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyPressed
        // TODO add your handling code here:
        String [] titulos={"id_empleado","nom_empleado","app_empleado","apm_empleado","sueldo_empleado","fecha_ingreso_empleado","nss_empleado","usuario","clave"};
        String [] registros= new String [100];
        String sql = "SELECT * FROM empleado WHERE id_empleado LIKE '%" + searchtxt.getText() + "%' " + 
                "OR nom_empleado LIKE '%" + searchtxt.getText() + "%'" +
                "OR app_empleado LIKE '%" + searchtxt.getText() + "%'" +
                "OR apm_empleado LIKE '%" + searchtxt.getText() + "%'" +
                "OR sueldo_empleado LIKE '%" + searchtxt.getText() + "%'" +
                "OR fecha_ingreso_empleado LIKE '%" + searchtxt.getText() + "%'" +
                "OR nss_empleado LIKE '%" + searchtxt.getText() + "%'" +
                "OR usuario LIKE '%" + searchtxt.getText() + "%'" +
                "OR clave LIKE '%" + searchtxt.getText() + "%'" ;
        
        model = new DefaultTableModel(null, titulos);
        Connection conn=tel_conexion.Tel_conexion.GetConnection();
        try{
            st=(Statement) conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                registros[0]=rs.getString("id_empleado");
                registros[1]=rs.getString("nom_empleado");
                registros[2]=rs.getString("app_empleado");
                registros[3]=rs.getString("apm_empleado");
                registros[4]=rs.getString("sueldo_empleado");
                registros[5]=rs.getString("fecha_ingreso_empleado");
                registros[6]=rs.getString("nss_empleado");
                registros[7]=rs.getString("usuario");
                registros[8]=rs.getString("clave");
                model.addRow(registros);
                
            }
            empTable.setModel(model);
        }catch(SQLException ex){
            System.out.println("ERROR AL BUSCAR LOS DATOS: " + ex.getMessage());
        }
    }//GEN-LAST:event_searchtxtKeyPressed

    private void cleanfieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanfieldsActionPerformed
       
            id.setText("");
            nametxt.setText("");
            apptxt.setText("");
            apmtxt.setText("");
            salarytxt.setText("");
            datetxt.setText("");
            nsstxt.setText("");
            usertxt.setText("");
            passtxt.setText("");
    }//GEN-LAST:event_cleanfieldsActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel apm;
    private javax.swing.JTextField apmtxt;
    private javax.swing.JLabel app;
    private javax.swing.JTextField apptxt;
    private javax.swing.JLabel clave;
    private javax.swing.JButton cleanfields;
    private javax.swing.JLabel date;
    private javax.swing.JFormattedTextField datetxt;
    private javax.swing.JTable empTable;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel nss;
    private javax.swing.JTextField nsstxt;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JLabel salary;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
