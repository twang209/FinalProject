<%@ page import="connect.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
<%
    String id=request.getParameter("id");
    String name=request.getParameter("name");
    String age = request.getParameter("age");
    String date=request.getParameter("date");
    String rate=request.getParameter("rate");
    String director=request.getParameter("director");
    String producer=request.getParameter("producer");
    String actor=request.getParameter("actor");
    String oscar=request.getParameter("oscar");
    int Id = Integer.parseInt(id);
    int Rating=Integer.parseInt(rate);
    int Age=Integer.parseInt(age);
    out.print("Movie id: "+Id+"</br>");
    Dao dao=new Dao();
    Connection connection=dao.getConnection();
    if (connection!=null){
       int i=dao.update(name,Age,date,Rating,director,producer,actor,oscar, Id);
       out.print("Successfully update "+i+" row</br>");
        out.print("Success "+"<a href=homepage.jsp?id=>Back to the homepage" + "</a>");
    }else{
        out.print("Fail to connect Database</br>");
        out.print("Fail "+"<a href=homepage.jsp?id=>Back to the homepage" + "</a>");
    }
%>
</body>
</html>
