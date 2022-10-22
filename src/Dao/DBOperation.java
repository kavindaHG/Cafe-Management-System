package Dao;

import java.sql.*;
import javax.swing.*;
import model.Product;
import net.proteanit.sql.DbUtils;

//addUpdateDelete Data from DB
public class DBOperation {

    public static void setDataorDelete(String Query, String msg) {
        try {
            Connection con = DBcon.getcon();
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
            java.util.logging.Logger.getLogger(CategoryDao.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//SetDataOrDelete

    //access data and view
    public static ResultSet getData(String query) {
        try {
            Connection con = DBcon.getcon();
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            return rs;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
            java.util.logging.Logger.getLogger(CategoryDao.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            return null;
        }
    }//GetData

    //generate tables without refreshing (parsed to Home.java)
    public static void gen_table(String sql, javax.swing.JTable tbname) {
        try {
            PreparedStatement pst = DBcon.getcon().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            tbname.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pst.close();
            DBcon.getcon().close();
            //table_size(tbname);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            java.util.logging.Logger.getLogger(CategoryDao.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GenTavle 
}//DBOperation
