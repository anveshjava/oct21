<%@page import="com.spring.jdbc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Spring Page</title>
</head>
<body>
<h1> Student details</h1>
<% List<Student> students = (List<Student>)request.getAttribute("students"); %>
<table border="3">

<tr>
<td> <b> Student No.</b></td>
<td> <b>First Name </b></td>
<td> <b>Last Name </b></td>
<td> <b>Joining Date </b></td>
</tr>
<%
for (Student st : students){
%>
<tr>
<td><b> <%= st.getStu_id() %> </b></td>

<td><font color="blue"><%= st.getFirst_name() %></font></td>
<td><font color="red"><%= st.getLast_name() %></font></td>
<td><font color="green"><%= st.getJoining_date() %> </font></td>
</tr>
<% 
}%>
</table>
</body>
</html>