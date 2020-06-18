// Kamil Uğur Sarp 170503033 18.06.2020 INF202 Proje
package okulproje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dataBase {
    
    public Connection Connect() throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://localhost:3306/okul_proje?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "fener12345_ugur";
        
        Connection conn = DriverManager.getConnection(url, user,password);
        Statement stmt = conn.createStatement();
        return conn;
    }
}
