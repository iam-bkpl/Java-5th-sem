import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.console;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


public class InsertData extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
            String name=request.getParameter("name");
            String address=request.getParameter("address");
            int age=Integer.parseInt(request.getParameter("age"));
            String date=request.getParameter("doa");
            int roomNo=Integer.parseInt(request.getParameter("roomNum"));
            Statement stmt ;
            
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3300/JavaBoard";
                Connection con = DriverManager.getConnection(url,"root","lipak");
               
                  String sql= "INSERT INTO PatientInfo VALUES(name,address,age,date,roomNo)";
                int result=stmt.executeUpdate(sql);
                    if(result!=-1){
                        JOptionPane.showMessageDialog(null,"Inserted Successfully");
                    }else{
                        JOptionPane.showMessageDialog(null,"Fail to insert");
                    }
//                PreparedStatement ps=con.prepareStatement(  
//                "insert into PatientInfo values(?,?,?,?,?)");  
//
//                ps.setString(1,name);  
//                ps.setString(2,address);  
//                ps.setInt(3,age);  
//                ps.setString(4,date);
//                ps.setInt(5,roomNo);
//                
//             
//                int result=ps.executeUpdate();
//            if(result!=-1){
//                out.println("Inserted Successfully\n");
//            }else{
//                out.println("Fail to insert");
//            }
            out.println("<br/>");
            out.println("Employess name:"+name);
            out.println("<br/>");
            out.println("Address:"+address);
            out.println("<br/>");
            out.println("\nAge:"+age);
            out.println("<br/>");
            out.println("\nDate of admission:"+date);
            out.println("<br/>");
            out.println("\nRoom number :"+roomNo);
            System.out.println("fuck you");

                }catch(Exception e){
                e.printStackTrace();
                 }
            out.close();
    }
}