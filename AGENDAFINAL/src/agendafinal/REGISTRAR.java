package agendafinal;

import static agendafinal.LOGEAR.ValidarContrasenia;
import java.applet.AudioClip;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class REGISTRAR extends javax.swing.JFrame {
    
    Connection conectado =  CONEXION.getConnection();
        
    public REGISTRAR() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contrasenia2Txt = new javax.swing.JTextField();
        registrarBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        contraseniaTxt = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("REGISTRARSE");

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");

        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Repetir Contraseña:");

        contrasenia2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenia2TxtActionPerformed(evt);
            }
        });

        registrarBtn.setBackground(new java.awt.Color(0, 102, 0));
        registrarBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        registrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrarBtn.setText("Guardar");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        volverBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        volverBtn.setForeground(new java.awt.Color(255, 255, 255));
        volverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/restart_back_left_arrow_6022.png"))); // NOI18N
        volverBtn.setBorderPainted(false);
        volverBtn.setContentAreaFilled(false);
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        salirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagen_2024-05-31_144642485.png"))); // NOI18N
        salirBtn.setBorderPainted(false);
        salirBtn.setContentAreaFilled(false);
        salirBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salirBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hi-there-i-made-some-omnitrix-watch-faces-for-the-samsung-v0-5bgr2yeb1z7b1 (1).png"))); // NOI18N
        salirBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hi-there-i-made-some-omnitrix-watch-faces-for-the-samsung-v0-5bgr2yeb1z7b1 (1).png"))); // NOI18N
        salirBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        salirBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gratis-png-ben-10-dibujo-extraterrestre-omniverso-s-de-extraterrestres-para-ninos-removebg-preview (1).png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(511, 300));
        jLabel4.setMinimumSize(new java.awt.Dimension(511, 300));
        jLabel4.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(userTxt)
                            .addComponent(contrasenia2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(titulo)
                                .addGap(36, 36, 36))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(volverBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(contraseniaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseniaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasenia2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(registrarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volverBtn)
                    .addComponent(salirBtn))
                .addGap(88, 88, 88))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gump-removebg-preview4 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/img/AudioSalida.wav"));
        sonido.play();
        dispose();
    }//GEN-LAST:event_salirBtnActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        LOGEAR l = new LOGEAR ();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setTitle("Inicio Agenda");
        l.setIconImage(new ImageIcon(getClass().getResource("/img/ben10.png")).getImage());
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/img/AudioSiguiente.wav"));
        sonido.play();
        dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
    String u2 = userTxt.getText();
    String p2 = contraseniaTxt.getText();
    String p3 = contrasenia2Txt.getText();
    
    if (!u2.isEmpty() && !p2.isEmpty() && !p3.isEmpty()) {
         if (p2.equals(p3)) {
               if (ValidarContrasenia(p2)) {
                  String queryCheckUser = "SELECT COUNT(*) FROM usuarios WHERE Usuario = ?";
                        try (PreparedStatement stmtCheck = conectado.prepareStatement(queryCheckUser)) {
                        stmtCheck.setString(1, u2);
                        ResultSet rs = stmtCheck.executeQuery();
                        
                        if (rs.next() && rs.getInt(1) > 0) {
                            JOptionPane.showMessageDialog(null, "El usuario ya existe. Intente con otro nombre de usuario.");
                        } else {                    
                        String query = "INSERT INTO usuarios (Usuario, Clave) VALUES (?, ?)";
                    try (PreparedStatement stmt = conectado.prepareStatement(query)) {
                        stmt.setString(1, u2); // Establecer el usuario
                        stmt.setString(2, hashPassword(p2)); // Establecer la contraseña encriptada
                        
                        int affectedRows = stmt.executeUpdate(); // Ejecutar la consulta y obtener el número de filas afectadas
                        
                        if (affectedRows > 0) {
                            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                            
                            AGENDA a = new AGENDA();
                            a.setIconImage(new ImageIcon(getClass().getResource("/img/ben10.png")).getImage());
                            a.setTitle("Agenda");
                            a.setVisible(true);
                            AudioClip sonido;
                            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/img/AudioSiguiente.wav"));
                            sonido.play();
                           dispose(); // Cerrar la ventana actual
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo registrar el usuario");
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Error al registrar el usuario: " + ex.getMessage());
                    }
                    }
                   } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Error al verificar el usuario: " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "CONTRASEÑA NO VÁLIDA O VACÍA");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
         } else {
           JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
        }
         
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void contrasenia2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenia2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenia2TxtActionPerformed

// Método para encriptar la contraseña usando SHA-256
private static String hashPassword(String password) {
    try {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(password.getBytes());
        return bytesToHex(encodedHash);
    } catch (NoSuchAlgorithmException e) {
        throw new RuntimeException(e);
    }
}
// Método para convertir bytes a una cadena hexadecimal
private static String bytesToHex(byte[] hash) {
    StringBuilder hexString = new StringBuilder(2 * hash.length);
    for (byte b : hash) {
        String hex = Integer.toHexString(0xff & b);
        if (hex.length() == 1) {
            hexString.append('0');
        }
        hexString.append(hex);
    }
    return hexString.toString();
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contrasenia2Txt;
    private javax.swing.JPasswordField contraseniaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField userTxt;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
