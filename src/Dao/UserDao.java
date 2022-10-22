package Dao;

import com.mysql.cj.protocol.Resultset;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;
import model.Product;

//this class used as Data Access object of Category
public class UserDao {

    //Add a new User or update
    public static void save(User user) {
        String query = "insert into user (name,username,mobileNumber,address,password,securityQuestion,answer,status) values('" + user.getName() + "','" + user.getUsername() + "','" + user.getMobile() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','false')";
        DBOperation.setDataorDelete(query, "Registered Successfully, Wait for Admin Approval");
    }//save

    //delete user
    public static void Delete(String id) {
        String query = "delete from user where ID = '" + id + "'";
        DBOperation.setDataorDelete(query, "User Deleted Successfully");
    }//delete

//Update User
    public static void update(String username, String newPassword) {
        String query = "update user set password ='" + newPassword + "' where username = '" + username + "'";
        DBOperation.setDataorDelete(query, "Password Changed Succssfully");
    }//update

    //change status of user to have permission
    public static void changeStatus(String username, String status) {
        String query = "update user set status = '" + status + "' where username = '" + username + "'";
        DBOperation.setDataorDelete(query, "Status Updated Successfully");
    }//changestatus

    //user login and checking status
    public static User login(String username, String password) {
        User user = null;
        try {
            ResultSet rs = DBOperation.getData("select * from user where username = '" + username + "' and password = '" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            java.util.logging.Logger.getLogger(CategoryDao.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        return user;
    }//login

    //parse security question to forgetPw
    public static User getSecuiryQuestion(String username) {
        User user = null;
        try {
            ResultSet rs = DBOperation.getData("select * from user where username = '" + username + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            java.util.logging.Logger.getLogger(CategoryDao.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        return user;
    }//getSq

    //Pasrse values to combobox
    public static ArrayList<User> getAllRecords() {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DBOperation.getData("select * from user");
            while (rs.next()) {
                User user = new User();
                user.setID(rs.getInt("ID"));
                user.setName(rs.getString("name"));
                arrayList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            java.util.logging.Logger.getLogger(CategoryDao.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        return arrayList;
    }//Combo
}
