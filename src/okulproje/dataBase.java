
package okulproje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dataBase {
    
    public Connection Connect() throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://localhost:3306/okul_proje?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "fener12345_ugur";
        
        Connection conn = DriverManager.getConnection(url, user,password);
        return conn;
    }
}
