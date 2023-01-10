import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class AllinOne {

    public static void main(String args[]) throws Exception {

        // createDatabase();
        // createTable();
        // insertData();
        // updateData();
        // deleteData();
        viewData();

    }

    private static void createDatabase() throws Exception {

        String sql = "CREATE DATABASE db_user";

        // Get the connection using our utils.

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db_test";

        Connection con = DriverManager.getConnection(url, "root", "lipak");

        if (con != null) {

            // Create statement from connection

            Statement stmt = con.createStatement();

            // Execute the statement by passing the sql

            int result = stmt.executeUpdate(sql);

            if (result != -1) {

                System.out.println("Database created sucessfully");

            } else {

                System.out.println("Could'nt create database. Please check your SQL syntax");

            }

            // Close the statements and Connections

            stmt.close();

            con.close();

        } else {

            System.out.println("Unable to get the connection");

        }

    }

    private static void createTable() throws Exception {

        String sql = "CREATE TABLE User(" +

                "FIRSTNAME VARCHAR(50),"

                + "LASTNAME VARCHAR(50),AGE NUMERIC(2),"

                + "COUNTRY VARCHAR(40)"

                + ")";

        // Get the connection using our utils.

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db_test";

        Connection con = DriverManager.getConnection(url, "root", "lipak");

        if (con != null) {

            // Create statement from connection

            Statement stmt = con.createStatement();

            // Execute the statement by passing the sql

            int result = stmt.executeUpdate(sql);

            if (result != -1) {

                System.out.println("Table created sucessfully");

            } else {

                System.out.println("Could'nt create table. Please check your SQL syntax");

            }

            // Close the statements and Connections

            stmt.close();

            con.close();

        } else {

            System.out.println("Unable to get the connection");

        }

    }

    private static void insertData() throws Exception {

        String sql = "INSERT INTO USER VALUES('ANZEL','RANA','15','NEPAL')";

        // Get the connection using our utils.

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db_test";

        Connection con = DriverManager.getConnection(url, "root", "lipak");

        if (con != null) {

            // Create statement from connection

            Statement stmt = con.createStatement();

            // Execute the statement by passing the sql

            int result = stmt.executeUpdate(sql);

            if (result != -1) {

                System.out.println("INSERT DATA  sucessfully");

            } else {

                System.out.println("Could'nt INSERT DATA . Please check your SQL syntax");

            }

            // Close the statements and Connections

            stmt.close();

            con.close();

        } else {

            System.out.println("Unable to get the connection");

        }

    }

    private static void updateData() throws Exception {

        String sql = "UPDATE USER SET COUNTRY='NEPAL' WHERE AGE = '16'";

        // Get the connection using our utils.

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db_test";

        Connection con = DriverManager.getConnection(url, "root", "lipak");

        if (con != null) {

            // Create statement from connection

            Statement stmt = con.createStatement();

            // Execute the statement by passing the sql

            int result = stmt.executeUpdate(sql);

            if (result != -1) {

                System.out.println("UPDATED DATA  sucessfully");

            } else {

                System.out.println("Could'nt UPDATE DATA . Please check your SQL syntax");

            }

            // Close the statements and Connections

            stmt.close();

            con.close();

        } else {

            System.out.println("Unable to get the connection");

        }

    }

    private static void deleteData() throws Exception {

        String sql = "DELETE FROM USER WHERE COUNTRY = 'USA'";

        // Get the connection using our utils.

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db_test";

        Connection con = DriverManager.getConnection(url, "root", "lipak");

        if (con != null) {

            // Create statement from connection

            Statement stmt = con.createStatement();

            // Execute the statement by passing the sql

            int result = stmt.executeUpdate(sql);

            if (result != -1) {

                System.out.println("DELETED DATA  sucessfully");

            } else {

                System.out.println("Could'nt DELETE DATA . Please check your SQL syntax");

            }

            // Close the statements and Connections

            stmt.close();

            con.close();

        } else {

            System.out.println("Unable to get the connection");

        }

    }

    private static void viewData() throws Exception {

        String sql = "SELECT * FROM USER";

        // Get the connection using our utils.

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db_test";

        Connection con = DriverManager.getConnection(url, "root", "lipak");

        if (con != null) {

            // Create statement from connection

            Statement stmt = con.createStatement();

            // Execute the statement by passing the sql

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String firstName = rs.getString(1);
                String lastName = rs.getString(2);
                String age = rs.getString(3);
                String country = rs.getString(4);

                System.out.println(firstName + " , " + lastName + " , " + age + " , " + country);
            }

            // Close the statements and Connections

            stmt.close();

            con.close();

        } else {

            System.out.println("Unable to get the connection");

        }

    }
}
