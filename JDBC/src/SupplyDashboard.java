import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.sql.*;
import javax.swing.*;


public class SupplyDashboard {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    void setConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/supplierDB";
            connection = DriverManager.getConnection(url, "root", "lipak");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void closeConnection(){
        try {
       statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void createDatabase(){
        try{
            String sql = "CREATE DATABASE supplierDB";
            setConnection();
            if (connection != null){
                statement = connection.createStatement();
                int result = statement.executeUpdate(sql);
                if(result != -1){
                    System.out.println("Database Created Successfully");
                }else{
                    System.out.println("Couldn't create database");
                }
//                closing the connection
                closeConnection();
            }else{
                System.out.printf("Unable to get the connection");
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    void createTable() {

try {


    String sql = "CREATE TABLE supplier(" +
            "supplier_id NUMERIC PRIMARY KEY, " +
            "supplier_name VARCHAR(50)," +
            "phone_number VARCHAR(10)," +
            "address VARCHAR(50))";
    setConnection();
    if (connection != null) {
        statement = connection.createStatement();
        int result = statement.executeUpdate(sql);

        if (result != -1) {
            System.out.printf("Table created Successfully");
        } else {
            System.out.printf("Error while creating table");
        }
        closeConnection();
    } else {
        System.out.printf("Unable to get the connection");
    }
}catch (Exception e){
    e.printStackTrace();
}
    }

    public static void main(String[] args){
        SupplyDashboard supplyDashboard =  new SupplyDashboard();
//        supplyDashboard.createDatabase();
        supplyDashboard.createTable();


    }
}
