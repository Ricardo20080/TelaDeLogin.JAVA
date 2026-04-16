
package DAO;

import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexaoDAO {
    
    public static Connection conector(){
     java.sql.Connection conexao = null;
     String driver = "com.mysql.jdbc.Driver";
     String user = "root";
     String url = "jdbc:mysql://localhost:3306/dbpoo";
     String password = "";
     
     try {
       Class.forName(driver);
       conexao = DriverManager.getConnection(url, user, password);
       return conexao;
       
     } catch (Exception e){
         JOptionPane.showMessageDialog(null, "falha na conexao " + e.getMessage());
         return null;
     }
     
     
     
     
     
    }
}
