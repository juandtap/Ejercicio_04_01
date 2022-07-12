/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ups.ejercicio_04_01.View;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import ups.ejercicio_04_01.Controller.DepartamentoController;
import ups.ejercicio_04_01.Model.Departamento;
import ups.ejercicio_04_01.Model.Empresa;

/**
 *
 * @author Diego
 */
public class DepartamentoVentana extends javax.swing.JInternalFrame {

    
    final DepartamentoController departamentoController;
    
    private TableModel modeloTablaDepartamentos;
    public final JDesktopPane jDesktopPane;
    
    public DepartamentoVentana(JDesktopPane jDesktopPane) {
        initComponents();
        departamentoController =  new DepartamentoController();
        this.jDesktopPane = jDesktopPane;
        this.jButtonEditarDep.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldCodigoDepartamento = new javax.swing.JTextField();
        jTextFieldNombreDepartamento = new javax.swing.JTextField();
        jTextFieldGerenteDepartamento = new javax.swing.JTextField();
        jButtonAgregarDepartamento = new javax.swing.JButton();
        jButtonMostrarDepartamentos = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxEmpresasDepartamento = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldUbicacionDepartamento = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDep = new javax.swing.JTable();
        jButtonEditarDep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Departamentos");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DEPARTAMENTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.black)); // NOI18N

        jLabel14.setText("Codigo");

        jLabel15.setText("Nombre");

        jLabel16.setText("Gerente");

        jTextFieldCodigoDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoDepartamentoKeyReleased(evt);
            }
        });

        jTextFieldGerenteDepartamento.setText("cedula empleado (OPCIONAL)");
        jTextFieldGerenteDepartamento.setToolTipText("cedula empleado (OPCIONAL)");

        jButtonAgregarDepartamento.setText("Agregar");
        jButtonAgregarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarDepartamentoActionPerformed(evt);
            }
        });

        jButtonMostrarDepartamentos.setText("Mostrar");
        jButtonMostrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarDepartamentosActionPerformed(evt);
            }
        });

        jLabel17.setText("Empresa");

        jComboBoxEmpresasDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Datos" }));
        jComboBoxEmpresasDepartamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxEmpresasDepartamentoFocusGained(evt);
            }
        });

        jLabel18.setText("Ubicacion");

        jTableDep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Gerente", "Empresa", "Ubicacion"
            }
        ));
        jScrollPane1.setViewportView(jTableDep);

        jButtonEditarDep.setText("Editar/Eliminar");
        jButtonEditarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarDepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldGerenteDepartamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCodigoDepartamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNombreDepartamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldUbicacionDepartamento)
                            .addComponent(jComboBoxEmpresasDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonAgregarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMostrarDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButtonEditarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldCodigoDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldNombreDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldGerenteDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBoxEmpresasDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldUbicacionDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarDepartamento)
                    .addComponent(jButtonMostrarDepartamentos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEditarDep)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoDepartamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDepartamentoKeyReleased
        if (!departamentoController.validarSoloNumeros(evt.getKeyChar())) {
            if(jTextFieldCodigoDepartamento.getText().length() > 0){
                String temp =jTextFieldCodigoDepartamento.getText().substring(0,jTextFieldCodigoDepartamento.getText().length()-1);
                jTextFieldCodigoDepartamento.setText(temp);
            }
        }
    }//GEN-LAST:event_jTextFieldCodigoDepartamentoKeyReleased

    private void jButtonAgregarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarDepartamentoActionPerformed
        agregar();
        clearDepartamento();
        mostrarTablaDepartamentos();
        JOptionPane.showMessageDialog(this, "Departamento Agregado!");
    }//GEN-LAST:event_jButtonAgregarDepartamentoActionPerformed

    private void jButtonMostrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarDepartamentosActionPerformed
        System.out.println("DEPARTAMENTOS:\n");
        for (Departamento dep : departamentoController.listarDepartamentos()) {
            System.out.println(dep.mostrarInformacion());
            System.out.println("");
        }
        System.out.println("----------------------------------------------------------------------");

        mostrarTablaDepartamentos();
    }//GEN-LAST:event_jButtonMostrarDepartamentosActionPerformed

    private void jComboBoxEmpresasDepartamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxEmpresasDepartamentoFocusGained
        cargarEmpresaCombo();
    }//GEN-LAST:event_jComboBoxEmpresasDepartamentoFocusGained

    private void jButtonEditarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarDepActionPerformed
        editar(jTableDep.getSelectedRow());
    }//GEN-LAST:event_jButtonEditarDepActionPerformed

    private void agregar(){
         var departamentoNuevo = departamentoController.crearDepartamento(Integer.parseInt(jTextFieldCodigoDepartamento.getText()), 
                jTextFieldNombreDepartamento.getText(), getEmpresaFromComboBox(), jTextFieldUbicacionDepartamento.getText());
        
        // Si se tiene cedula del empleado en el campo gerente se le asigna a departamento
        if (!jTextFieldGerenteDepartamento.getText().trim().equals("cedula empleado (OPCIONAL)")){
     
            var gerente = departamentoController.empleadoService.getEmpleadoByCedula(jTextFieldGerenteDepartamento.getText());
            if (gerente != null) {
                departamentoController.asignarGerenteDepartamento(departamentoNuevo.getCodigo(), gerente);
                // a empleado gerente tambien se le asigna el departamento 
                departamentoController.empleadoService.asignarDepartamento(gerente.getCedula(), departamentoNuevo);
                
                System.out.println("Empleado: " +gerente.getCedula()+" : "+gerente.getNombre()+ " asignado como gerente en el departamento : "
                    +departamentoNuevo.getNombre());
                
            } else{
                System.out.println("Empleado no existe");
            }
            
        }
        
        System.out.println("Departamento agregado !");
    }
    
    private Empresa getEmpresaFromComboBox(){
        if (!this.jComboBoxEmpresasDepartamento.getSelectedItem().toString().equalsIgnoreCase("Sin Datos")){
            Empresa em = departamentoController.empresaService.listarEmpresas().get(jComboBoxEmpresasDepartamento.getSelectedIndex());
            return em;
        }
        
        return null;
    }
    
     private void clearDepartamento(){
        jTextFieldCodigoDepartamento.setText("");
        jTextFieldNombreDepartamento.setText("");
        jTextFieldGerenteDepartamento.setText("cedula empleado (OPCIONAL)");
        jTextFieldUbicacionDepartamento.setText("");
    }
    
    private void cargarEmpresaCombo(){
        jComboBoxEmpresasDepartamento.removeAllItems();
        for(var empresa: departamentoController.empresaService.listarEmpresas()){
            jComboBoxEmpresasDepartamento.addItem(empresa.getNombre());
        }
    }
     
     private void mostrarTablaDepartamentos(){
        var header = new String[5];
        
        header[0] = "Codigo";
        header[1] = "Nombre";
        header[2] = "Gerente";
        header[3] = "Empresa";
        header[4] = "Ubicacion";
        
        var data = new Object[this.departamentoController.listarDepartamentos().size()][5];
        
        for (int i = 0; i < this.departamentoController.listarDepartamentos().size(); i++) {
            data[i][0] = this.departamentoController.listarDepartamentos().get(i).getCodigo();
            data[i][1] = this.departamentoController.listarDepartamentos().get(i).getNombre();
            
            if (this.departamentoController.listarDepartamentos().get(i).getGerente() == null){
                data[i][2] = "Sin Gerente";
            } else{
                 data[i][2] = this.departamentoController.listarDepartamentos().get(i).getGerente().getNombre();
            }
           
            data[i][3] = this.departamentoController.listarDepartamentos().get(i).getEmpresa().getNombre();
            data[i][4] = this.departamentoController.listarDepartamentos().get(i).getUbicacion();
        }
        
        this.modeloTablaDepartamentos = new DefaultTableModel(data, header);
        this.jTableDep.setModel(modeloTablaDepartamentos);
        
        
        // habilita el boton de Edicion si hay elementos agregados, caso contrario lo deshabilita
        if(!this.departamentoController.listarDepartamentos().isEmpty()){
            this.jButtonEditarDep.setEnabled(true);
        } else{
            this.jButtonEditarDep.setEnabled(false);
        }
    }
    
    private void editar(int posicion){
        DepartamentoVentanaEdicion departamentoVentanaEdicion = new DepartamentoVentanaEdicion(this.departamentoController.listarDepartamentos().get(posicion));
        this.jDesktopPane.add(departamentoVentanaEdicion);
        departamentoVentanaEdicion.setIconifiable(true);
        departamentoVentanaEdicion.setClosable(true);
        departamentoVentanaEdicion.setResizable(true);
        departamentoVentanaEdicion.setVisible(true);
    }
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarDepartamento;
    private javax.swing.JButton jButtonEditarDep;
    private javax.swing.JButton jButtonMostrarDepartamentos;
    private javax.swing.JComboBox<String> jComboBoxEmpresasDepartamento;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableDep;
    private javax.swing.JTextField jTextFieldCodigoDepartamento;
    private javax.swing.JTextField jTextFieldGerenteDepartamento;
    private javax.swing.JTextField jTextFieldNombreDepartamento;
    private javax.swing.JTextField jTextFieldUbicacionDepartamento;
    // End of variables declaration//GEN-END:variables
}
