<%@ page import="connect.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="Domain.marvelmovie" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String Name=request.getParameter("name");
    Dao dao=new Dao();
    Connection connection=dao.getConnection();
    if (connection!=null){
        List<marvelmovie> list= dao.selectName(Name);
        out.print("<table border='1' cellspacing='1'><tr>");
        out.print("<caption>Result</caption>");
        out.print("<tr><th width='60'>#Number</th>"
                + "<th width='100'>Movie ID</th>"
                + "<th width='120'>Movie Name</th>"
                + "<th width='100'>Age</th>"
                + "<th width='100'>Date</th>"
                + "<th width='80'>Rating</th>"
                + "<th width='100'>Director</th>"
                + "<th width='100'>Producer</th>"
                + "<th width='100'>Main Actor</th>"
                + "<th width='80'>Oscar</th>"
                + "<th width='120'>Operation</th>");
        int count = 0;
        for (marvelmovie marvelmovie:list){
            out.print("<tr>");
            out.print("<td>" + (++count) + "</td>");
            out.print("<td>" + marvelmovie.getMovieId()+ "</td>");
            out.print("<td>" + marvelmovie.getName() + "</td>");
            out.print("<td>" + marvelmovie.getAge() + "</td>");
            out.print("<td>" + marvelmovie.getDate()+ "</td>");
            out.print("<td>" + marvelmovie.getRate()+ "</td>");
            out.print("<td>" + marvelmovie.getDirectorName()+ "</td>");
            out.print("<td>" + marvelmovie.getProducerName()+ "</td>");
            out.print("<td>" + marvelmovie.getActorName()+ "</td>");
            out.print("<td>" + marvelmovie.getOscar()+ "</td>");
            out.print("<td>" + "<a href=deleteuser.jsp?id=" + marvelmovie.getMovieId() + ">Delete" + "</a>"
                    + " / <a href=updateuser.jsp?id=" + marvelmovie.getMovieId() + ">Update" + "</a>"+ "</td>");
            out.print("</tr>");
        }
        out.print("</table>");
        out.print("<br>" + "<a href=index.jsp?id=>Back to the homepage" + "</br>" );
    }else {
        out.println("Connect fail");
    }
%>
</body>
</html>
