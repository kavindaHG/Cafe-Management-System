package Dao;

import javax.swing.JOptionPane;
import model.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import model.Category;

//this class used as Data Access object of Category
public class ProductDao {

    //adding new product
    public static void save(Product product) {
        String query = "insert into product (productname,category,price) values('" + product.getName() + "','" + product.getCategory() + "','" + product.getPrice() + "')";
        DBOperation.setDataorDelete(query, "Product Added Successfully");
    }//save

    //update a existing product
    public static void Update(Product product) {
        String query = "update product set productname='" + product.getName() + "',category='" + product.getCategory() + "',price = '" + product.getPrice() + "' where id = '" + product.getId() + "'";
        DBOperation.setDataorDelete(query, "Product Updated Successfully");
    }//Update

    //delete product
    public static void delete(String id) {
        String query = "delete from product where id = '" + id + "'";
        DBOperation.setDataorDelete(query, "Product Deleted Successfully");
    }//Delete

    //parse selected data to comboboxes
    public static ArrayList<Product> getAllRecords() {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DBOperation.getData("select * from product");
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("ID"));
                product.setName(rs.getString("productname"));
                arrayList.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            java.util.logging.Logger.getLogger(CategoryDao.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        return arrayList;
    }//Combo

    //filter items by category using category comboBilling & parse to billing productcombo box
    public static ArrayList<Product> filterAllRecordsByCategory(String category) {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DBOperation.getData("select * from product where category = '" + category + "' ");
            while (rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("productname"));
                arrayList.add(product);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    //filter and show products by productname Bill
    public static ArrayList<Product> FilterProductByName(String name, String category) {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DBOperation.getData("select * from product where productname like '%" + name + "%' and category = '" + category + "'");
            while (rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("productname"));
                arrayList.add(product);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    //select name,price,category of a product
    public static Product getProductByName(String name) {
        Product product = new Product();
        try {
            ResultSet rs = DBOperation.getData("select * from product where productname = '" + name + "'");
            while (rs.next()) {
                product.setName(rs.getString(2));
                product.setCategory(rs.getString(3));
                product.setPrice(rs.getString(4));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }

}//ProductDao
