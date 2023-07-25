
package bank.mangement.system;
import java.sql.*;

public class Conn {
     Connection c;
     Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3307/bankmanagementsystem","root","Sanket@4320" );
        s=c.createStatement();
        }catch(Exception e){
            System.out.println(e);
                    
        }
            
    }
}
