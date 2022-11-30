<%@ page import="connect.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a new record</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String id=request.getParameter("id");
    String name=request.getParameter("name");
    String age = request.getParameter("age");
    String date=request.getParameter("date");
    String rate=request.getParameter("rate");
    String director = request.getParameter("directorname");
    String producer = request.getParameter("producername");
    String actor = request.getParameter("actorname");
    String oscar = request.getParameter("oscar");
    int Id = Integer.parseInt(id);
    int Rating=Integer.parseInt(rate);
    int Age=Integer.parseInt(age);
    Dao dao=new Dao();
    Connection connection=dao.getConnection();
    if (connection!=null){
         int i=dao.insert(Id,name,Age,date,Rating, director, producer, actor, oscar);
          out.print("Successfully add "+i+" row</br>");
        out.print("Success "+"<a href=homepage.jsp?id=>Back to the homepage " + "</a>");
    }else {
        out.print("Fail to connect Database</br>");
        out.print("Fail "+"<a href=homepage.jsp?id=>Back to the homepage" + "</a>");
    }
%>
</body>
</html>
