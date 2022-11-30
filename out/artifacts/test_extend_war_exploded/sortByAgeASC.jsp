<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="connect.Dao" %>
<%@ page import="java.util.List" %>
<%@ page import="Domain.marvelmovie" %>
<html>
<head>
    <title>Find all movie</title>
</head>
<body>
<br><a href=index.jsp?id=>HomePage</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href=homepage.jsp?id=>ListOfMovie</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<a href="https://www.marvel.com/">Marvel Official Website</a></br>
<p></p>
<form action="selectMovieByName.jsp" method="post">
    Enter Movie Name Here：
    <input type="text" name="name">
    <input type="submit" value="Find by movie">
</form>
<form action="selectMovieByDirector.jsp" method="post">
    Enter Director Name Here：
    <input type="text" name="directorname">
    <input type="submit" value="Find by director">
</form>
<form action="selectMovieByProducer.jsp" method="post">
    Enter Producer Name Here：
    <input type="text" name="producername">
    <input type="submit" value="Find by producer">
</form>
<form action="insert.jsp" method="post">
    <input type="submit" value="Insert Data">
</form>
<p>
    <a href="sortByAgeASC.jsp">SortByAgeASC</a>&nbsp&nbsp<a href="sortByAgeDSC.jsp">SortByAgeDESC</a>
    &nbsp&nbsp<a href="sortByRateASC.jsp">SortByRateASC</a>&nbsp&nbsp<a href="sortByRateDSC.jsp">SortByRateDESC</a>
</p>
<%
    Dao dao=new Dao();
    Connection connection=dao.getConnection();
    if (connection!=null){
        //out.println("数据库连接成功");
        List<marvelmovie> list= dao.selectAllByAgeASC();
        out.print("<table border='1' cellspacing='1'><tr>");
        out.print("<caption>Movie Table</caption>");
        out.print("<tr><th width='60'>#number</th>"
                + "<th width='100'>Movie id</th>"
                + "<th width='120'>Movie Name</th>"
                + "<th width='100'>Age</th>"
                + "<th width='100'>Date</th>"
                + "<th width='80'>Rating</th>"
                + "<th width='100'>Director</th>"
                + "<th width='100'>Producer</th>"
                + "<th width='100'>Main Actor</th>"
                + "<th width='80'>Oscar</th>"
                + "<th width='120'>operation</th>");

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
            out.print("<td>" + "<a href=delete.jsp?id=" + marvelmovie.getMovieId() + ">Delete" + "</a>"
                    + " / <a href=update.jsp?id=" + marvelmovie.getMovieId() + ">Update" + "</a>"+ "</td>");
            out.print("</tr>");
        }
        out.print("</table>");
        connection.close();
        connection.close();
    }else {
        out.println("connection fail");
    }
%>
</body>
</html>
