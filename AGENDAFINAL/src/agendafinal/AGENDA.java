package agendafinal;

import java.applet.AudioClip;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AGENDA extends javax.swing.JFrame {
    //ArrayList Agenda = new ArrayList();
    Connection conectar =  CONEXION.getConnection();
                            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        celLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        nombTxt = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JTextField();
        celTxt = new javax.swing.JTextField();
        mailTxt = new javax.swing.JTextField();
        editarBtn = new javax.swing.JButton();
        verBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        guardarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pantallaArea = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IdTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        titulo.setFont(new java.awt.Font("Goudy Stout", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText(" AGENDA");

        nombreLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre:");

        apellidoLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        apellidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        apellidoLabel.setText("Apellido:");

        celLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        celLabel.setForeground(new java.awt.Color(255, 255, 255));
        celLabel.setText("telefono:");

        mailLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(255, 255, 255));
        mailLabel.setText("Mail:");

        nombTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombTxtActionPerformed(evt);
            }
        });

        apellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });

        celTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celTxtActionPerformed(evt);
            }
        });

        mailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTxtActionPerformed(evt);
            }
        });

        editarBtn.setBackground(new java.awt.Color(0, 102, 0));
        editarBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        editarBtn.setForeground(new java.awt.Color(255, 255, 255));
        editarBtn.setText("editar");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        verBtn.setBackground(new java.awt.Color(0, 102, 0));
        verBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        verBtn.setForeground(new java.awt.Color(255, 255, 255));
        verBtn.setText("Listar");
        verBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBtnActionPerformed(evt);
            }
        });

        eliminarBtn.setBackground(new java.awt.Color(0, 102, 0));
        eliminarBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        eliminarBtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarBtn.setText("eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        salirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagen_2024-05-31_144642485.png"))); // NOI18N
        salirBtn.setToolTipText("");
        salirBtn.setBorderPainted(false);
        salirBtn.setContentAreaFilled(false);
        salirBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hi-there-i-made-some-omnitrix-watch-faces-for-the-samsung-v0-5bgr2yeb1z7b1 (1).png"))); // NOI18N
        salirBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        salirBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        guardarBtn.setBackground(new java.awt.Color(0, 102, 0));
        guardarBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        guardarBtn.setForeground(new java.awt.Color(255, 255, 255));
        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        pantallaArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(pantallaArea);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hnj..png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI:");

        IdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTxtActionPerformed(evt);
            }
        });

        buscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icon_Business_Set_00015_A_icon-icons.com_59850.png"))); // NOI18N
        buscarBtn.setBorderPainted(false);
        buscarBtn.setContentAreaFilled(false);
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(mailTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellidoLabel)
                            .addComponent(nombreLabel)
                            .addComponent(celLabel)
                            .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoTxt)
                            .addComponent(nombTxt)
                            .addComponent(celTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                            .addComponent(guardarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdTxt))
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 8, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(buscarBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guardarBtn)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eliminarBtn)
                                    .addComponent(verBtn)
                                    .addComponent(editarBtn))
                                .addGap(39, 39, 39)))
                        .addComponent(salirBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(nombTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apellidoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(celLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(celTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 178, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    public AGENDA() {
    initComponents();
    //CrearModelo();
    this.setLocationRelativeTo(null);
    UpdateTable();
}

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        String n = nombTxt.getText();
        String a = apellidoTxt.getText();
        String c = celTxt.getText();
        String m = mailTxt.getText ();
        String id = IdTxt.getText();
          
        AGENDA i = new AGENDA();
        
        if (!n.isEmpty() && !a.isEmpty() && !c.isEmpty() && !m.isEmpty() && !id.isEmpty()) {
                          validarCorreo mailValidado = new validarCorreo();
                                 if (mailValidado.ValidarMail(m)) {
                                     //if (id.isEmpty()) {// Si el ID está vacío, significa que estamos creando un nuevo contacto
                                   String query = "INSERT INTO agenda (Nombre, Apellido, Telefono, Correo, ID) VALUES (?, ?, ?, ?, ?)";

                                    try (PreparedStatement stmt = conectar.prepareStatement(query)){
                                        stmt.setString(1, n);
                                        stmt.setString(2, a);
                                        stmt.setString(3, c);
                                        stmt.setString(4, m);
                                        stmt.setString(5, id);
                                        stmt.executeUpdate();
                                        int erroneo = stmt.executeUpdate();

                                        //if(erroneo > 0){
                                            JOptionPane.showMessageDialog(this, "Contacto guardado");
                                            nombTxt.setText("");
                                            apellidoTxt.setText("");
                                            celTxt.setText("");
                                            mailTxt.setText("");
                                            IdTxt.setText("");
                                       /*}else{
                                            JOptionPane.showMessageDialog(this, "Contacto no guardado");
                                        }*/
                                    
                                    }catch(SQLException ex){
                                        
                           //} else {
                        if (ex.getErrorCode() == 1062) { // Código de error para violación de constraint único en PostgreSQL, ajusta según tu base de datos
                        String query2 = "UPDATE agenda SET Nombre = ?, Apellido = ?, Telefono = ?, Correo = ? WHERE ID = ?";

                        try (PreparedStatement stmt = conectar.prepareStatement(query2)) {
                            stmt.setString(1, n);
                            stmt.setString(2, a);
                            stmt.setString(3, c);
                            stmt.setString(4, m);
                            stmt.setString(5, id);

                            int filasActualizadas = stmt.executeUpdate();

                            if (filasActualizadas > 0) {
                                JOptionPane.showMessageDialog(this, "Contacto actualizado exitosamente");
                                // Limpia los campos
                                nombTxt.setText("");
                                apellidoTxt.setText("");
                                celTxt.setText("");
                                mailTxt.setText("");
                                IdTxt.setText("");

                                if (conectar != null) {
                                    DATOS datos = new DATOS();
                                    datos.mostrarDatos(conectar, pantallaArea);
                                
                            } else {
                                JOptionPane.showMessageDialog(this, "No se pudo actualizar el contacto");
                            }
                        }
                        }catch (SQLException ex2) {
                            JOptionPane.showMessageDialog(this, "Error al actualizar el contacto: " + ex.getMessage());
                        }
                    }else{
                            JOptionPane.showMessageDialog(this, "Error al guardar el contacto "+ex.getMessage());
                        }
                                    }
                        }else{
                            JOptionPane.showMessageDialog(this, "CORREO INCORRECTO, INGRESELO NNUEVAMENTE");
                        }
                        
                    }else{
             JOptionPane.showMessageDialog(null, "LOS CAMPOS NO PUEDEN ESTAR VACIOS");
        }
                   
        try {
            c = celTxt.getText();
             if (c.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "EL TELEFONO ESTA CORRECTO");
            }
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null,"EL TELEFONO DEBE SER NUMERICO");
        }
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void UpdateTable(){
        try{
            String sql = "select * from agenda";
            PreparedStatement ps = conectar.prepareStatement(sql);
            ResultSet R = ps.executeQuery();
        }catch(SQLException e){
            JOptionPane.showInputDialog(null, e);
        }
    }
    
    private void nombTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombTxtActionPerformed

    private void apellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtActionPerformed

    private void celTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celTxtActionPerformed

    private void mailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTxtActionPerformed
        String Correo = mailTxt.getText();
    }//GEN-LAST:event_mailTxtActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        int filaSeleccionada = pantallaArea.getSelectedRow();
        if (filaSeleccionada != -1) {
              
        // Pasar los datos del contacto seleccionado al diálogo de edición
        String nombre = pantallaArea.getValueAt(filaSeleccionada, 0).toString(); 
        String apellido = pantallaArea.getValueAt(filaSeleccionada, 1).toString();
        String telefono = pantallaArea.getValueAt(filaSeleccionada, 2).toString();
        String correo = pantallaArea.getValueAt(filaSeleccionada, 3).toString();
        String id = pantallaArea.getValueAt(filaSeleccionada, 4).toString(); 

        // Establecer los valores iniciales en los campos del diálogo de edición
        IdTxt.setText(id);
        nombTxt.setText(nombre);
        apellidoTxt.setText(apellido);
        celTxt.setText(telefono);
        mailTxt.setText(correo);
        
        // Mostrar el diálogo modal
        // Mostrar los campos de edición y botones de actualizar/cancelar
        jPanel1.setVisible(true); 

        // Ocultar o deshabilitar otros componentes que no sean necesarios durante la edición
        pantallaArea.setEnabled(false);
        // Habilitar el botón "Guardar" para que el usuario pueda actualizar los cambios
        guardarBtn.setEnabled(true);
    } else {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un contacto para editar");
    }
    }//GEN-LAST:event_editarBtnActionPerformed

    private void verBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBtnActionPerformed
         if (conectar != null) {
            DATOS datos = new DATOS();
            datos.mostrarDatos(conectar, pantallaArea);
        } 
    }//GEN-LAST:event_verBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
    String id = IdTxt.getText();
        nombTxt.setText("");
        apellidoTxt.setText("");
        celTxt.setText("");
        mailTxt.setText("");
        
    if (!id.isEmpty()) {
       
        String query = "DELETE FROM agenda WHERE ID = ?"; // Consulta SQL para eliminar un contacto por su ID

        try (PreparedStatement stmt = conectar.prepareStatement(query)) {
            
            stmt.setString(1, id);// Establecer el parámetro con el ID del contacto a eliminar
            int affectedRows = stmt.executeUpdate();// Ejecutar la consulta y obtener el número de filas afectadas

            if (affectedRows > 0) {              
                JOptionPane.showMessageDialog(this, "Contacto eliminado correctamente"); // Se eliminó al menos una fila, mostrar mensaje de éxito
            } else {              
                JOptionPane.showMessageDialog(this, "No se encontró el contacto para eliminar"); // No se encontró el contacto con el ID especificado
                }
            } catch (SQLException ex) {       
                JOptionPane.showMessageDialog(this, "Error al eliminar el contacto: " + ex.getMessage());// Manejar cualquier excepción que ocurra durante la operación de eliminación
            }
        } else {         
            JOptionPane.showMessageDialog(this, "Debe ingresar un ID para eliminar el contacto"); // El ID está vacío, mostrar mensaje de error
        }
        IdTxt.setText("");
        if (conectar != null) {
            DATOS datos = new DATOS();
            datos.mostrarDatos(conectar, pantallaArea);
        }  
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/img/AudioSalida.wav"));
        sonido.play();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AGENDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);// Cerrar la aplicación
    }//GEN-LAST:event_salirBtnActionPerformed

    private void IdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTxtActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        String id = IdTxt.getText();
    if (!id.isEmpty()) {
        try {
            // Consulta SQL para buscar un registro por ID
            String query = "SELECT * FROM agenda WHERE ID = ?";
            try (PreparedStatement stmt = conectar.prepareStatement(query)) {
                stmt.setString(1, id);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        // Si se encontró un registro, mostrarlo en la pantalla
                        String nombre = rs.getString("Nombre");
                        String apellido = rs.getString("Apellido");
                        String telefono = rs.getString("Telefono");
                        String correo = rs.getString("Correo");
                        /// Crear un DataModel para la tabla
                        DefaultTableModel model = (DefaultTableModel)pantallaArea.getModel();
                        model.setRowCount(0); // Limpiar filas anteriores
                        Object[] rowData = {nombre, apellido, telefono, correo, id};
                        model.addRow(rowData); // Agregar el registro encontrado
                    } else {
                        // No se encontró ningún registro con el ID proporcionado
                        JOptionPane.showMessageDialog(this, "Contacto no encontrado");
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al buscar el contacto: " + ex.getMessage());
            }
        } catch (NullPointerException ex) {
            // Aquí manejarías el caso en el que 'conectar' sea null, lo cual indicaría un problema con la conexión
            JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos");
        }
    } else {
        // El campo de ID está vacío
        JOptionPane.showMessageDialog(this, "Ingrese un ID para buscar");
    }
        
    }//GEN-LAST:event_buscarBtnActionPerformed
public class validarCorreo{
        public boolean ValidarMail(String m){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(mailTxt.getText());; // Crea un matcher para la contraseña dada
        return matcher.find(); // Devuelve verdadero si la contraseña cumple con la expresión regular
    }
}
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdTxt;
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JLabel celLabel;
    private javax.swing.JTextField celTxt;
    private javax.swing.JButton editarBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JTextField nombTxt;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTable pantallaArea;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton verBtn;
    // End of variables declaration//GEN-END:variables

}
