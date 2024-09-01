import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;;
public class divya extends GenericServlet
{
public void service(ServletRequest request,ServletResponse response) throws IOException
{
String name=request.getParameter("t1");
String no1=request.getParameter("t2");
String no2=request.getParameter("t3");
String no3=request.getParameter("t4");
String no4=request.getParameter("t5");
String no5=request.getParameter("t6");
String no6=request.getParameter("t7");
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body bgcolor=lightblue>");
out.println("<center>");
out.println("<br>");
out.println("<br>");
out.println("<br>");
out.println("<br>");
out.println("<h1>CAB DETAILS</h1>");
out.println("<h1>Welcome to this site:"+name+"</h1>");
out.println("<h1>Your contact number is:"+no1+"</h1>");
out.println("<h1>The pickup location:"+no2+"</h1>");
out.println("<h1>The dropoff location"+no3+"</h1>");
out.println("<h1>Payment method is:"+no4+"</h1>");
out.println("<h1>The pickup date is:"+no5+"</h1>");
out.println("<h1>The pickup time is:"+no6+"</h1>");
out.println("</center>");
out.println("</body>");
out.println("</html>");
out.close();
}
}
