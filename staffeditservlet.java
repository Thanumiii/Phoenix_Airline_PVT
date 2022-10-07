package staff2package;

import java.io.IOException;
import java.io.printwriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.Webservlet;
import javax.servlet.http.Httpservlet;
import javax.servlet.http.HttpservletRequest;
import javax.servlet.http.HttpservletResponse;




@WebServlet(name = "staffeditservelet",urlPatterns = {"/staffeditservelet"})
public class staffEditservlet extends HttpServlet {

   protected void processRequest(HttpservletRequest request,HttpservletResponse response)
    throws ServletException, IOException{
       response.setContentType("text/html;charset=UTF-8");
       try(Printwriter out = response.getWriter()){
           out.println("<!DOCTYPE html>");
           out.println("<html>");
           out.println("<head>");
           out.println("<title>Servlet staffEditservlet</title>");
           out.println("<body>");
           out.println("<h1>Servlet staffEditservlet at"+ request.getContextPath() + "</h1>");
           out.println("</body>");
           out.println("</html>");
       }

   }




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
int NICnumber=Integer.parseInt(request.getparameter("NICnumber");
String firstname=request.getparameter("firstname");
        String lastname=request.getparameter("lastname");
        String contactnumber=request.getparameter("contactnumber");
        String username=request.getparameter("username");
        String password=request.getparameter("password");


    staffUpdate st=new staffupdate(;
    if(st.staffUpdateInfo(NICnumber,firstname,lastname,contactnumber,username,password))
    {
        out.println("<h2><center>updated!!<center></h2>");
        RequestDispatcher rd = request.getRequestDispatcher("EditProfileStaff.jsp");
        rd.include(request,response);
    }
    else{
        out.println("<h2><center>update is not success!</center></h2>");
    }
}

@override
public string getServletInfo(){
   return"short description";
   }

