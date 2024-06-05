package agendafinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DATOS {
  DefaultTableModel P = new DefaultTableModel();     
  public void mostrarDatos (Connection CONEXION, javax.swing.JTable pantallaArea){

      P.addColumn("Nombre");
      P.addColumn("Apellido");
      P.addColumn("Telefono");
      P.addColumn("Correo");
      P.addColumn("DNI");
      
      pantallaArea.setModel(P);
      
      try{
          PreparedStatement prep = CONEXION.prepareStatement("SELECT * FROM agenda");
          ResultSet result = prep.executeQuery();
          
          while(result.next()){
              Object[] fila = new Object[5];
              for (int i = 0; i < 5; i++) {
                  fila[i] = result.getObject(i+1);
              }
              P.addRow(fila);
          }
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Error al mostrar datos: "+e.getMessage());
      }
      
  }
}
