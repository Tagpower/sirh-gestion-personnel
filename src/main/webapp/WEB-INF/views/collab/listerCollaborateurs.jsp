<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.0.0-beta.2-
dist/css/bootstrap.css">
</head>

<body>
	<h1>Les collaborateurs</h1>
	
	<p>Un autre mini paragraphe de test</p>
	
	<%List<Collaborateur> listeCollabs =(List<Collaborateur>)request.getAttribute("listeNoms");
	for (Collaborateur c : listeCollabs) {	
		%>
		
		<div class="card" style="width:20rem; margin:5px">
			<div class="card-header">
				<%=c.getNom()%> <%=c.getPrenom()%> 
			</div>
			<div class="card-block">
				<img alt="" src="<%=request.getContextPath()%>img/<%=c.getPhoto()%>"> 
				<ul>
					<li><%=c.getEmailPro()%></li>
					<li><%=c.getAdresse()%></li>
				</ul>
				<a href="#" class="btn btn-primary" style="text-align:right">Éditer</a>
			</div>
		</div>
	<%
	}
	%>
		
</body>

</html>