import java.sql.*;
import javax.swing.*;
public class DatabaseDemo {
    Connection con;
    Statement stmt;
    ResultSet rs;

    public DatabaseDemo(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_test";
            con = DriverManager.getConnection(url, "root", "lipak");

            stmt = con.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    void createTable() throws Exception {
        try {
            String sql = "CREATE TABLE User(ID INT,name VARCHAR(50),age INT,phone VARCHAR(50),address VARCHAR(50))";
            int result = stmt.executeUpdate(sql);
            if (result != 1) {
                JOptionPane.showMessageDialog(null, "table Created Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Fail to create");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void insertIntoTable() throws Exception {
        try {
            String sql = "INSERT INTO User VALUES(100,'kapil',21,'972998213','Pokhara')";
            int result = stmt.executeUpdate(sql);
            if (result != -1) {
                JOptionPane.showMessageDialog(null, "Inserted Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Fail to insert");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void getFromTable() throws Exception {
        try {
            String sql = "SELECT* FROM User";
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                int id=rs.getInt(1);
                String name=rs.getString(2);
                int age=rs.getInt(3);
                String phone=rs.getString(4);
                String address=rs.getString(5);

                System.out.println(+id+"\n"+name+"\n"+age+"\n"+phone+"\n"+address);
                System.out.println("-----------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception{
        DatabaseDemo dbDemo=new DatabaseDemo();
        dbDemo.createTable();
        dbDemo.insertIntoTable();
        dbDemo.getFromTable();
            }
        }

