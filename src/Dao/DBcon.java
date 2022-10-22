package Dao;

import java.sql.*;

//start DBConnection
public class DBcon {
    public static Connection getcon(){
        try {
            Class .forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cafe","root","");
             return con;
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(CategoryDao.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
             return null;
        }       
    }//getCon
}//DBCon
