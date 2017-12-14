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
	
	<div>
		<form class="form-inline" id="recherche">
			<label for="terme">Rechercher un nom ou un prénom qui commence par : </label>
			<input type="text" id="terme" />
		
		
		
		</form>
	</div>
	
	
	
	
	<div class="row">
					
	<%List<Collaborateur> listeCollabs =(List<Collaborateur>)request.getAttribute("listeCollab");
	for (Collaborateur c : listeCollabs) {	
		%>
		<div class="col-md-4">
		<div class="card" style="width=300px; margin:5px ">
			<div class="card-header">
				<h3><%=c.getNom()%> <%=c.getPrenom()%></h3> 
			</div>
			<div class="card-block">
				<div class="row">
					<div class="col-md-3">
						<img class="img-fluid" style="margin:2px" src="<%=request.getContextPath()%>/img/<%=c.getPhoto()%>"> 
					</div>
					<div class="col-md-9">
						<div class="row">
							<div class="col">Fonction :</div> <div class="col"><%=c.getIntitulePoste()%></div> 
						</div>
						<div class="row">
							<div class="col">Département :</div> <div class="col"><%=c.getDepartement().getNom()%></div> 
						</div>
						<div class="row">
							<div class="col">Email :</div> <div class="col"><%=c.getEmailPro()%></div> 
						</div>
						<div class="row">
							<div class="col">Téléphone :</div> <div class="col"><%=c.getTelephone()%></div> 
					</div>
					</div>
				</div>
				<a href="#" class="btn btn-primary" style="text-align:right">Éditer</a>
			</div>
		</div>
		</div>
	<%
	}
	%>
		</div>
</body>

</html>