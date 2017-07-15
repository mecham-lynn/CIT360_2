
package servpkg;
 
import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HelloServlet extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      
      response.setContentType("text/html;charset=UTF-8");
      
      PrintWriter out = response.getWriter();

      String title = "Example of Header Request";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
                
      out.println(docType +
      "<html>\n" +
      "<head><title>" + title + "</title></head>\n"+
         "<body bgcolor = \"#f0f0f0\">\n" +
         "<h1 align = \"center\">" + title + "</h1>\n" +
         "<table width = \"100%\" border = \"1\" align = \"center\">\n" +
         "<tr bgcolor = \"#949494\">\n" +
         "<th>Header Name</th><th>Header Value(s)</th>\n"+
         "</tr>\n"
         );
     Enumeration headerNames = request.getHeaderNames();

     while(headerNames.hasMoreElements()){
         String paramName = (String)headerNames.nextElement();
         out.print("<tr><td>" + paramName + "</td>\n");
         String paramValue = request.getHeader(paramName);
         out.println("<td> " + paramValue + "</td?</tr> \n");
     }
        out.println("</table>\n</body></html>");

      
   }
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
	  doGet(request,response);
   }
}