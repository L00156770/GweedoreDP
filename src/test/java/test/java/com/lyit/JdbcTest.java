package test.java.com.lyit;

import java.sql.*;

import org.junit.Test;

public class JdbcTest {

   @Test	
   public void testJdbc() {
      try (
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://gweedore.cpagctkouszj.us-east-2.rds.amazonaws.com:3306/gweedore_db?useSSL=false",
               "admin", "sjn496gpDh0jM5N4r6Ib");
         Statement stmt = conn.createStatement();
      ) {
         String strSelect = "INSERT INTO gweedore_db.user_log (user_name, activity, activity_date) VALUES ( \"GweedoreUser\", \"Login\", CURRENT_TIMESTAMP)";
 
         int rset = stmt.executeUpdate(strSelect);
 
      } catch(SQLException ex) {
         ex.printStackTrace();
      }
   }
}