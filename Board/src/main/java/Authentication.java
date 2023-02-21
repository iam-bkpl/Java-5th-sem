

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Authentication extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
              PrintWriter out = response.getWriter();
              Connection con=null;
              PreparedStatement ps=null;
              
              String name=request.getParameter("name");
            String address=request.getParameter("address");
            int age=Integer.parseInt(request.getParameter("age"));
            String date=request.getParameter("doa");
            int roomNo=Integer.parseInt(request.getParameter("roomNum"));
                  
                  try{
  try{
                      
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/JavaBoard";
                con=DriverManager.getConnection(url,"root","lipak");
                
  }catch(Exception e){
                  out.println("Exception occured in While connecting");
              }
  
               
                
 ps=con.prepareStatement(  "insert into PatientInfo values(?,?,?,?,?)");  
                ps.setString(1,name);  
                ps.setString(2,address);  
                ps.setInt(3,age);  
                ps.setString(4,date);
                ps.setInt(5,roomNo);
                
             
                int result=ps.executeUpdate();
            if(result!=-1){
                out.println("Inserted Successfully\n");
            }else{
                out.println("Fail to insert");
            }
                  
              }catch(Exception e){
                  out.println("Exception occured in get request");
              }

        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          PrintWriter out = response.getWriter();

         String uname = "root";
         String pw = "root";
            String name=request.getParameter("username");
           String pass=request.getParameter("password");
           
           if(pass.equals(pw)&& name.equals(uname)){
             
               RequestDispatcher rd=request.getRequestDispatcher("InsertPatient.jsp");
               rd.forward(request,response);
           }
           else{
                RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
               rd.include(request,response);
           }
        }
    }
