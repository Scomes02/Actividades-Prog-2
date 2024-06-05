package agendafinal;

import java.applet.AudioClip;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class LOGEAR extends javax.swing.JFrame {
Connection conectado = CONEXION.getConnection();
    public LOGEAR() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ingresarBtn = new javax.swing.JButton();
        registrarBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        contraseniaTxt = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        ingresarBtn.setBackground(new java.awt.Color(0, 102, 0));
        ingresarBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        ingresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        ingresarBtn.setText("Ingresar");
        ingresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtnActionPerformed(evt);
            }
        });

        registrarBtn.setBackground(new java.awt.Color(0, 102, 0));
        registrarBtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        registrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrarBtn.setText("Registrarse");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        salirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagen_2024-05-31_144642485.png"))); // NOI18N
        salirBtn.setBorder(null);
        salirBtn.setBorderPainted(false);
        salirBtn.setContentAreaFilled(false);
        salirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salirBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salirBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hi-there-i-made-some-omnitrix-watch-faces-for-the-samsung-v0-5bgr2yeb1z7b1 (1).png"))); // NOI18N
        salirBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hi-there-i-made-some-omnitrix-watch-faces-for-the-samsung-v0-5bgr2yeb1z7b1 (1).png"))); // NOI18N
        salirBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        salirBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        labelNombre.setBackground(new java.awt.Color(102, 102, 255));
        labelNombre.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nombreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                        .addComponent(contraseniaTxt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseniaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(salirBtn)
                .addGap(146, 146, 146))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBtnActionPerformed
       
        USER = nombreTxt.getText();
        PASW = contraseniaTxt.getText();
        String p = PASW;
        String u = USER;
        
        if (!u.isEmpty() && !p.isEmpty()) {
        // Consulta para buscar al usuario en la base de datos
        String query = "SELECT * FROM usuarios WHERE Usuario = ? AND Clave = ?";
        try (PreparedStatement stmt = conectado.prepareStatement(query)) {
            stmt.setString(1, u);
            stmt.setString(2, hashPassword(p));
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Usuario encontrado, mostrar la siguiente ventana
                JOptionPane.showMessageDialog(null, "Bienvenido, " + u);
                AGENDA a = new AGENDA();
                a.setIconImage(new ImageIcon(getClass().getResource("/img/ben10.png")).getImage());
                a.setTitle("Agenda");
                a.setVisible(true);
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/img/AudioSiguiente.wav"));
                sonido.play();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                REGISTRAR r = new REGISTRAR();
                r.setIconImage(new ImageIcon(getClass().getResource("/img/ben10.png")).getImage());
                r.setVisible(true);
                r.setLocationRelativeTo(null);
                r.setTitle("Registro Agenda");
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/img/AudioSiguiente.wav"));
                sonido.play();
                dispose();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar el usuario: " + ex.getMessage());
        }
        } else {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos");
        }
        
    }//GEN-LAST:event_ingresarBtnActionPerformed

    public static String USER;
    public static String PASW;
    
    public static boolean ValidarContrasenia(String PASW){
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%.^&+=]).{6,}$";  // Expresión regular para verificar la contraseña
        Pattern pattern = Pattern.compile(regex);  // Compila la expresión regular en un patrón
        Matcher matcher = pattern.matcher(PASW); // Crea un matcher para la contraseña dada
        return matcher.find(); // Devuelve verdadero si la contraseña cumple con la expresión regular
    }
    
    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
             REGISTRAR r = new REGISTRAR ();
              // Establecer el icono de la ventana
             r.setIconImage(new ImageIcon(getClass().getResource("/img/ben10.png")).getImage());
             r.setVisible(true);
             r.setLocationRelativeTo(null);
             r.setTitle("Registro Agenda");
             AudioClip sonido;
             sonido = java.applet.Applet.newAudioClip(getClass().getResource("/img/AudioSiguiente.wav"));
             sonido.play();
             dispose();
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/img/AudioSalida.wav"));
        sonido.play();
        dispose();
    }//GEN-LAST:event_salirBtnActionPerformed
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
    private javax.swing.JPasswordField contraseniaTxt;
    private javax.swing.JButton ingresarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
