<%@ page import="connect.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<%
    String id=request.getParameter("id");
    int ID=Integer.parseInt(id);
    out.print("Movie will be deleted with movieId "+ID + "</br>");
    Dao dao=new Dao();
    Connection connection=dao.getConnection();
    if(connection!=null){

        int i=dao.deleteMovie(ID);
        out.print("Successfully Delete "+i+" row</br>");
        out.print("Success "+"<a href=index.jsp?id=>Back to the homepage" + "</a>");
    }else {
        out.print("Fail to connect Database</br>");
        out.print("Fail "+"<a href=index.jsp?id=>Back to the homepage" + "</a>");
    }
%>
</body>
</html>
