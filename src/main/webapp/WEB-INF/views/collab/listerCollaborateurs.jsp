<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="dev.sgp.entite.Departement"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
	<link rel="stylesheet" href=<c:url value="${request.getContextPath()}/bootstrap-4.0.0-beta.2-dist/css/bootstrap.css"/> >
</head>

<body>
	<h1>Les collaborateurs</h1>
	
	<p>Un autre mini paragraphe de test</p>
	
	<div class="row">
		<form id="recherche" method="post">
			<div class="row">
				<div class="col-md-4" style="text-align:right">
					<label for="terme">Rechercher un nom ou un prénom qui commence par : </label>
				</div>
				<div class="col-md-2">
					<input type="text" id="terme" class="form-control " />
				</div>
				<div class="col-md-6" style="text-align:center">
					<a href="#" class="btn btn-secondary" style="text-align:right">Rechercher</a>
					<input type="checkbox" id="includeInactive" />
					<label for="includeInactive">Voir les collaborateurs désactivés</label>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4" style="text-align:right">
					<label for="includeInactive">Filtrer par département :</label>
				</div>
				<div class="col-md-2">
					<select class="custom-select" id="selectDept">
						<option value="-1">Tous</option>
						<c:forEach items="${listeDept}" var="d">
							<option value="${d.id} "> ${d.nom} </option>
						</c:forEach>
					
					</select>
				</div>
				<div class="col-md-6"></div>
			</div>
		</form>
	</div>
	
	
	
	
	<div class="row">
		
	<c:forEach items="${listeCollab}" var="c">
		<div class="col-md-4">
		<div class="card" style="width=300px; margin:5px ">
			<div class="card-header">
				<h3>${c.getNom().toUpperCase()} ${c.getPrenom()}</h3> 
			</div>
			<div class="card-block">
				<div class="row">
					<div class="col-md-3">
						<img class="img-fluid" style="margin:2px;  max-width:75px" src=<c:url value="${request.getContextPath()}/img/${c.getPhoto()}"/> >  
					</div>
					<div class="col-md-9">
						<div class="row">
							<div class="col">Fonction :</div> <div class="col">${c.getIntitulePoste()}</div> 
						</div>
						<div class="row">
							<div class="col">Département :</div> <div class="col">${c.getDepartement().getNom()}</div> 
						</div>
						<div class="row">
							<div class="col">Email :</div> <div class="col">${c.getEmailPro()}</div> 
						</div>
						<div class="row">
							<div class="col">Téléphone :</div> <div class="col">${c.getTelephone()}</div> 
					</div>
					</div>
				</div>
				<a href="#" class="btn btn-primary" style="text-align:right">Éditer</a>
			</div>
		</div>
		</div>
	</c:forEach>	
		</div>
</body>
</html>