package agendafinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CONEXION {
        private static final String URL = "jdbc:mysql://localhost/agendaprog";
        private static final String USER = "root";
        private static final String PASSWORD = "";
        
        public static Connection getConnection(){
            Connection connection = null;
            try{
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                //JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "CONEXION ERRONEA "+e.getMessage());
            }
            return connection;
        }      
}
