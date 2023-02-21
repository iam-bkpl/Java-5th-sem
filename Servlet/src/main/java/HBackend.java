/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package board;
import java.sql.*;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HBackend extends HttpServlet {
        Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pstmt;

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
   
    try {
               Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/JavaBoard";
            con=DriverManager.getConnection(url,"root","lipak");
            stmt= con.createStatement();
        } catch(Exception e){
            e.printStackTrace(); 
        }
        
        
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String doa = request.getParameter("doa");
        Integer roomNo = Integer.parseInt(request.getParameter("roomNum"));
        try{
            pstmt=con.prepareStatement(  
                "insert into PatientInfo values(?,?,?,?,?)");  
            pstmt.setString(0, name);
            pstmt.setString(1,address);
            pstmt.setInt(2,age);
            pstmt.setString(3,doa);
            pstmt.setInt(4,roomNo);
            
            int result = pstmt.executeUpdate();
            if(result != -1){
                out.println("Success Insert of DATA");
            }else{
                out.println("Fail to Insert Data");
            }
            
        }catch(Exception e){
            out.println("Error in get request");
            e.printStackTrace();
        }
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
                PrintWriter out = response.getWriter();
               
                String username = "iambkpl";
                String password = "lipak";
                
                String get_username = request.getParameter("username");
                String get_password = request.getParameter("password");
                
                if(username.equals(get_username) && password.equals(get_password)){
                    out.println("Correct Password");
                }else{
                    out.println("User name Password Wrong");
                }
                        
            
            
            
            
            
        
    }
}
   
