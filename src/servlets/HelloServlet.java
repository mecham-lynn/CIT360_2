
package servpkg;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class HelloServlet extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      
      response.setContentType("text/html;charset=UTF-8");
      
      PrintWriter out = response.getWriter();
 
      // Write the response message, in an HTML page
      try {
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Hey Everybody</title></head>");
         out.println("<body>");
         out.println("<h1>Hi Guys! Welcome to my first servlet! </h1>"); 
         out.println("<p> If you are seeing this then my servlet is working and i would like to say HELLO! </p>")

    
         out.println("</body>");
         out.println("</html>");
      } finally {
         out.close();  // Always close the output writer
      }
   }
}