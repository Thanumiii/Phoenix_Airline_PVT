<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Resultset"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.connection"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Connection connection=null;
    Statement st=null;
    Resultset re=null;
    String driver="com.mysql.jdbc.Driver";
    string url="jdbc:mysql://localhoost:3306/airplanedb";
    Class.forName(driver);
    Connection con=DriverManager.getConnection(url,"root","");
%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>





<body>
<div class="topnav" id="myTopnav">
    <a href="index.html">Home</a>
    <a href="staff1.html">loign</a>
</div>

<p style="margin-left:15px;">updating user profile</p>
<div class="container">
    <table border="1px" cellspacing="0" cellpadding="5">
        <tr>

            <th>NIC number</th>
            <th>firstname</th>
            <th>lastname</th>
            <th>username</th>
            <th>password</th>
        </tr><tr>

        <% try
{
    st=con.createStatement();

    String sql="SELECT * FROM staff";
    rs=st.executequerry(sql);
    while(rs.next()){

        %>
        <td><%=rs.getInt("NICnumber")%></td>
            <td><%=rs.getInt("firstname")%></td>
            <td><%=rs.getInt("lastname")%></td>
            <td><%=rs.getInt("username")%></td>
            <td><%=rs.getInt("password")%></td>

            <td>




            </td>
    }
}
    </table>

</div>

</body>
</html>













