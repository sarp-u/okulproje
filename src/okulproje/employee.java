
package okulproje;

import java.sql.*;

public class employee {
    public static void main(String[] args) throws SQLException{
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "fener12345_ugur";
        
        try{
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/okul_proje?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", user, pass);
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from employees");
            
            while(myRs.next()){
                System.out.println(myRs.getString("last_name")+"  "+myRs.getString("first_name"));
            }
            
        } catch (Exception exc){
            exc.printStackTrace();
        } finally {
            if(myRs != null){
                myRs.close();
            }
            if ( myStmt != null) {
                myStmt.close();
            }
        }
    }
}
