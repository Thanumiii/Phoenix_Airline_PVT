package staff2package;

import java.io.IOException;
import java.io.printwriter;
import java.sql.connection;
import java.sql.DriveManager;
import java.sql.PreparedStatement;
import java.sql.Resultset;
import java.sql.SQLException;
import.java.util.logging.Level;
import.java.util.logging.Logger
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.Webservlet;
import javax.servlet.http.Httpservlet;
import javax.servlet.http.HttpservletRequest;
import javax.servlet.http.HttpservletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "staffloginservlet", value = "/staffloginservlet")
public class staffloginservlet extends HttpServlet {

    protected void processRequest(HttpservletRequest request,HttpservletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (Printwriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet staffloginservlet</title>");
            out.println("<body>");
            out.println("<h1>Servlet staffloginservlet at" + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }

    }







    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
processRequest(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            Printwriter out=response.getWriter()
            int NICnumber=Integer.ParseInt(request.getParameter("staffNICnumber"))
            string password=request.getparameter("staffpassword");
            boolean status=false;

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriveManager.getConnection("jdbc:mysql://localhost:3306/airplanedb","root","");
            Preparedstatement ps=con.preparestatement(" SELECT sfirstname=?,slastname=?,semail=?,susername=?,spassword=?,where sNIC number=?")

              ps.setInt(1,NICnumber);
              ps.setstring(2,password);

              Resultset re=ps.executequery();
              while(rs.next()){
                  status=true;
              }
              if(status==true){

                  RequestDispatcher rd=request.getRequestDispatcher("staff1.html");
                  rd.forward(request,response);
                  Httpsession session=request.getsession();
                  session.SetAttribute("password",password);

              }else{
                  RequestDispatcher rd=request.getRequestDispatcher
              }




        }



    }
}
