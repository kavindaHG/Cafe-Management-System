package Dao;

import java.awt.Component;
import java.util.*;
import javax.swing.*;
import model.Category;
import java.sql.*;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

//this class used as Data Access object of Category
public class CategoryDao {

    //Save Into category table
    public static void save(Category category) {
        String query = "insert into category (name) values ('" + category.getName() + "')";
        DBOperation.setDataorDelete(query, "Category Added Successfully");
    }//save

    //Delete from category table
    public static void Delete(String id) {
        String query = "delete from category where ID = '" + id + "'";
        DBOperation.setDataorDelete(query, "Category Deleted Successfully");
    }//delete

    //parse selected data to comboboxes
    public static ArrayList<Category> getAllRecords() {
        ArrayList<Category> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DBOperation.getData("select * from category");

            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("ID"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            java.util.logging.Logger.getLogger(CategoryDao.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        return arrayList;
    }//combo
}//categoryDao
