package staff2package;

import java.sql.connection;
import java.sql.DriveManager;
import java.sql.preparedstatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

//@WebServlet(name = "updateservelet", value = "/updateservelet")
//public class updateservelet extends HttpServlet {
//@Override
// protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

            //@Override
            //protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            }
            }

class staffupdate{
    statement st;
    connection con;
    boolean staffupdateInfo(string firstname,string lastname,int NIC number,string email,string username,string password)
    int state= 0;
    ConnectToDb();
        try
    {
        preparedstatement ps =con.preparestatement("UPDATE staff SET sfirstname=?,slastname=?,semail=?,susername=?,spassword=?,where sNIC number=?")
        ps.setInt(15,NICnumber);
        ps. setString(1,firstname);
        ps. setString(1,lirstname);
        ps.setString(3,email);
        ps.setString(8,username);
        ps.setString(8,password);


        state=ps.executeUpdate();

    }
        catch(Exception e)
    {
        e.printStacktrace();
    }

        return state == 1;
}
    private void connectToDb(){

        try {
            String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/airplanedb";
            Class.forName(driver);
            con=Drivemanager.getconnecttion(url,"root","");
            st=con.cratesStatement();
        }
        catch(ClassNotFoundException|SQLException ex){

            Logger.getLogger(userUpdate.class.getName()).log(Level.SEVERE,null,ex);
        }
    }


