<%@ page import="connect.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<%
    String id;
    id=request.getParameter("id");
    int ID=Integer.parseInt(id);
%>
<form action="info2.jsp">
    MovieID：<input type="text" value="<%=ID%>" name="id">
    MovieName：<input type="text" name="name">
    Age：<input type="text" name="age">
    Date：<input type="text" name="date" >
    Rating：<input type="text" name="rate" >
    Director：<input type="text" name="director" >
    Producer：<input type="text" name="producer" >
    Main Actor：<input type="text" name="actor" >
    Oscar：<input type="text" name="oscar" >
    <input type="submit" value="update">
</form>
</body>
</html>
