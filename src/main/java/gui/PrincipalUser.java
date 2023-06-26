
package gui;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;
import logica.Usuario;


public class PrincipalUser extends javax.swing.JFrame {
Controladora control;
Usuario usr;
    
    public PrincipalUser(Controladora control,Usuario usr) {
        initComponents();
        this.control=control;
        this.usr=usr;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtNomUser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

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

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 48, 84));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Welcome");
        jTextField1.setBorder(null);

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update table");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtNomUser.setEditable(false);
        txtNomUser.setBackground(new java.awt.Color(0, 48, 84));
        txtNomUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomUser.setForeground(new java.awt.Color(255, 255, 255));
        txtNomUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomUser.setBorder(null);

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
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomUser, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
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
        jScrollPane1.setBounds(240, 140, 450, 220);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         this.txtNomUser.setText(usr.getNomUsuario());
         cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       cargarTabla();
       mostrarMensaje("Update table successfully","Info","Update table");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
 
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
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtNomUser;
    // End of variables declaration//GEN-END:variables

   
}
