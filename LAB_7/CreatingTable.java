import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingTable {

    public static void main(String args[]) throws Exception {

        createTable();

    }

    private static void createTable() throws Exception {

        String sql = "CREATE TABLE CUSTOMERS(" +

                "FIRSTNAME VARCHAR(50),MIDDLENAME VARCHAR(20),"

                + "LASTNAME VARCHAR(50),AGE NUMERIC(2),"

                + "SSN NUMERIC(10),CITY VARCHAR(32)"

                + ",STATE VARCHAR(20),COUNTRY VARCHAR(40)"

                + ")";

        // Get the connection using our utils.

        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db_test";

        Connection con = DriverManager.getConnection(url, "root", "");

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

}