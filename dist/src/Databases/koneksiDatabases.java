
package Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksiDatabases {
    public static String PathReport=System.getProperty("user.dir") + "/src/laporan";
        private static Connection koneksi;
        public static Connection getkoneksi(){
            if (koneksi==null){
                try{
                    String url=new String();
                    String user=new String();
                    String password=new String();
                    url="jdbc:mysql://localhost:3306/siku1";
                    user="root";
                    password="";
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    koneksi=DriverManager.getConnection(url,user,password);
                    
                }catch (SQLException t){
                    System.out.println("Error membuat koneksi");
                }
            }
          return koneksi;}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
