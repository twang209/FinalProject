<%@ page import="connect.Dao" %>
<%@ page import="java.sql.Connection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert new Movie</title>
</head>
<body>
<form action="info.jsp" method="post">
<h4 align="center">Insert</h4>
<table align="center" border="1" cellspacing="2">
    <tr>
        <td width="80" align="center">ID：</td>
        <td width="120"><input type="text" name="id"></td>
    </tr>
    <tr>
        <td width="80" align="center">Movie Name：</td>
        <td width="120"><input type="text" name="name"></td>
    </tr>
    <tr>
        <td width="80" align="center">Age：</td>
        <td width="120"><input type="text" name="age"></td>
    </tr>
    <tr>
        <td width="80" align="center">Date：</td>
        <td width="120"><input type="text" name="date"></td>
    </tr>
    <tr>
        <td width="80" align="center">Rating：</td>
        <td width="120"><input type="text" name="rate"></td>
    </tr>
    <tr>
        <td width="80" align="center">Director：</td>
        <td width="120"><input type="text" name="directorname"></td>
    </tr>
    <tr>
        <td width="80" align="center">Producer：</td>
        <td width="120"><input type="text" name="producername"></td>
    </tr>
    <tr>
        <td width="80" align="center">Main Actor：</td>
        <td width="120"><input type="text" name="actorname"></td>
    </tr>
    <tr>
        <td width="80" align="center">Oscar：</td>
        <td width="120"><input type="text" name="oscar"></td>
    </tr>
    <tr>
        <th width="120" colspan="2"><input type="submit" value="Submit"></th>
    </tr>
</table>
</form>
<br>
<h4 align="center">
<a href=homepage.jsp?id=>Back to the HomePage</a>
</h4>

</br>

</body>
</html>
