import java.io.IOException;  
import java.io.PrintWriter;  
import java.sql.*;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletConfig;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
public class SerExam extends HttpServlet   
{  
      Connection con;  
      PreparedStatement ps;  
      ResultSet rs;  
      public void init(ServletConfig config)throws ServletException  
      {   
            try   
               {  
                        Class.forName("oracle.jdbc.driver.OracleDriver");  
                        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");   
               }   
                  catch (ClassNotFoundException e)  
                     {  
                        System.out.println(e);  
                     }   
                  catch (SQLException e)   
                     {  
                        System.out.println(e);  
                     }  
      }  
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException   
      {  
            doPost(request, response);  
      }  
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException   
      {  
            response.setContentType("text/html");  
            PrintWriter pw=response.getWriter();  
            String username=request.getParameter("username");  
            String password=request.getParameter("password");  
            pw.println("<html><body>");  
            try   
            {  
                  ps=con.prepareStatement("select * from loginvalidation where username=? and password=?");  
                  ps.setString(1, username);  
                  ps.setString(2, password);  
                  rs=ps.executeQuery();  
                  if(rs.next())  
                  {  
                        pw.println("<h3>welcome " +" " + username +"</h3>");  
                        RequestDispatcher rd1=request.getRequestDispatcher("./home.html");  
                        rd1.include(request,response);  
                        //or  
                        //response.sendRedirect("./home.html");  
                        pw.println("<form method=\"post\" action=\"Login.html\">");  
                        pw.println("<input type=\"submit\" name=\"logout\" " + "value=\"Logout\">");  
                        pw.println("</form>");  
                          
                  }  
                  else  
                  {  
                        pw.println("<center><h3>invalid username/password Enter Correct username/password</h3></center>");  
                        RequestDispatcher rd2=request.getRequestDispatcher("./Login.html");  
                        rd2.include(request,response);  
                        //or  
                        //response.sendRedirect("./Login.html");  
                  }  
            }  
            catch (SQLException e)   
                  {  
                  e.printStackTrace();  
                  }  
      }  
}  