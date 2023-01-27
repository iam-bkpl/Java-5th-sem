import java.sql.*;
import javax.swing.*;

public class DatabaseCRUD {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
     public DatabaseCRUD(){
         try {
            String sql="CREATE DATABASE db_test";
//            Class.forName("com.mysql.jdbc.Driver");
//               Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/db_test";
            con=DriverManager.getConnection(url,"root","lipak");
            
            stmt= con.createStatement();
        } catch(Exception e){
            e.printStackTrace(); 
        }
    }
     void insertIntoDatabase()throws Exception{
        try{
            String sql= "INSERT INTO customers VALUES(3,'Leena', 'KATHMANDU','112233',21)";
        int result=stmt.executeUpdate(sql);
            if(result!=-1){
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Fail to insert");
            }
         }catch (Exception e){
             e.printStackTrace();
         }
    }
    void readFromDatabase() throws Exception{
        try{
            String sql= "SELECT * FROM CUSTOMERS";
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                String name=rs.getString(1);
                String address=rs.getString(2);
                String phone=rs.getString(3);
                int age=rs.getInt(4);
                int id=rs.getInt(5);
            
            System.out.println(name+"\n"+address+"\n"+phone+"\n"+age+"\n"+id);
            System.out.println("-------------------------------");
            }
         }catch (Exception e){
             e.printStackTrace();
         }
    }
    void close(){
        try{
            stmt.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
      public static void main(String []args)throws Exception{
       DatabaseCRUD dbDemo=new DatabaseCRUD();
        dbDemo.insertIntoDatabase();
//        dbDemo.readFromDatabase();
    }
}
