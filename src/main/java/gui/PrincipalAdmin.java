
package gui;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;

import logica.Usuario;


public class PrincipalAdmin extends javax.swing.JFrame {
      Controladora control;
      Usuario usr;
 
    public PrincipalAdmin(Controladora control,Usuario usr) {
        initComponents();
        this.control=control;
        this.usr=usr;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(200, 225, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 48, 84));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        txtNombreUser.setEditable(false);
        txtNombreUser.setBackground(new java.awt.Color(0, 48, 84));
        txtNombreUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreUser.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUser.setBorder(null);

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setText("Edit User");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update table");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Delete User");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrear.setText("Add User");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 48, 84));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Welcome");
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 230, 420);

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblUser);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 140, 430, 220);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Dashboard - User Admin");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 30, 300, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtNombreUser.setText(usr.getNomUsuario());
    }//GEN-LAST:event_formWindowOpened

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       cargarTabla();
       mostrarMensaje("Update table successfully","Info","Update table");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        AltaUsuario alta=new AltaUsuario(control);
        alta.setVisible(true);
        alta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       //Validar que la tabla tenga elementos
       if(tblUser.getRowCount()>0){
           //Controlar que se haya seleccionado un elemento+
           if(tblUser.getSelectedRow()!=-1){
               //Obtengo el id del elemento a eliminar
               int id_usuario=Integer.parseInt(String.valueOf(tblUser.getValueAt(tblUser.getSelectedRow(), 0)));
                //llamar la metodo borrar
                control.borrarUsuario(id_usuario);
                //colocar un mensaje diciendo que se borro exitosamente el mensaje
                mostrarMensaje("User deleted successfully","Info","Delete User");
                //actualizar tabla
                cargarTabla();
           }else{
               mostrarMensaje("Not selected any record","Error","Failed to delete");
           }
       }else{
            mostrarMensaje("Table is empty","Error","Failed to delete");
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         if(tblUser.getRowCount()>0){
           //Controlar que se haya seleccionado un elemento+
           if(tblUser.getSelectedRow()!=-1){
               //Obtengo el id del elemento a eliminar
               int id_usuario=Integer.parseInt(String.valueOf(tblUser.getValueAt(tblUser.getSelectedRow(), 0)));
               //Llamar a la ventana de edición
               EditarVentana editar=new EditarVentana(id_usuario);
               editar.setVisible(true);
               editar.setLocationRelativeTo(null);
               
           }else{
               mostrarMensaje("Not selected any record","Error","Edit Wrong");
           }
       }else{
            mostrarMensaje("Table is empty","Error","Edit wrong");
         }
         
       
    }//GEN-LAST:event_btnEditActionPerformed
     public void mostrarMensaje(String mensaje,String tipo, String titulo){
       JOptionPane optionPane=new JOptionPane(mensaje);
       if(tipo.equals("Info")){
           optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
       }else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
       }
        JDialog dialog=optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
   }
    private void cargarTabla() {
     DefaultTableModel modelTable=new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column){
             return false;
         }
     };
       String titulo[]= {"Id","Usuario","Rol"};
     modelTable.setColumnIdentifiers(titulo);
         
     //TRAER DE LA BD LA LISTA DE USUARIOS
     List<Usuario> listaUsuario=control.traerUsuarios();
     
     if(listaUsuario!=null){
         for(Usuario usu:listaUsuario){
             Object[] objeto={
                 usu.getId(),usu.getNomUsuario(),usu.getUnRol().getNombreRol()
             };
             modelTable.addRow(objeto);
         }
     }
     
    tblUser.setModel(modelTable);
     
    }
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtNombreUser;
    // End of variables declaration//GEN-END:variables
}
