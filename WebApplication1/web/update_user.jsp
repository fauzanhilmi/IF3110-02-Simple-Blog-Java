<%-- 
    Document   : update_user
    Created on : Nov 20, 2014, 6:45:17 PM
    Author     : adwisatya
--%>
<%@page import = "java.sql.*" %>
<%@page import = "java.io.*" %>
<%@include file= "/WEB-INF/jspf/koneksi.jspf" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update User</title>
    </head>
    <body>
        <%
		try{
			Connection connection = null;
			Statement statement = null;
			ResultSet rs = null;
			Class.forName(xDRIVER);
			connection = DriverManager.getConnection(xSTRING,xUSERNAME,xPASSWORD);
			statement = connection.createStatement();
			String Data = "select * from users where username = 'aryya'";
			rs = statement.executeQuery(Data);
			
			while(rs.next()){
		%>	
			<form method="post" action="update.jsp">
				<label>Nama: </label><input type="text" id="user_name" name="user_name" value="<%=rs.getString("nama")%>">
				<br/>
				<label>Username: </label><input type="text" id="user_username" name="user_username" value="<%=rs.getString("username")%>">
				<br/>
				<label>Password: </label><input type="text" id="user_password" name="user_password" value="<%=rs.getString("password")%>">
				<br/>
				<label>Email: </label><input type="text" id="user_email" name="user_email" value="<%=rs.getString("email")%>">
				<br/>
				<input type="submit" value="Update">
			</form>
		<%
			}
			rs.close();
			statement.close();
			connection.close();
		}catch(Exception ex){
			out.println("Gagal tersambung. Terdaapat kesalahan.");
		}	
		%>
		

    </body>
</html>
