<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Departement"%>

<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.0.0-beta.2-
dist/css/bootstrap.css">
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>

<form id="form" method="post">

    <h2>Nouveau collaborateur</h2>

    <div class="form-group-row">
        <i class="fa fa-user prefix grey-text"></i>
   	    <label for="formNom" class="col-md-2 col-form-label">Nom</label>
    	<div class="col-md-10">
	        <input required type="text" id="formNom" name="nom" class="form-control">
    	</div>
    </div>

    <div class="form-group-row">
        <i class="fa fa-user prefix grey-text"></i>
   	    <label for="formPrenom" class="col-md-2 col-form-label">Prénom</label>
    	<div class="col-md-10">
	        <input required type="text" id="formPrenom" name="prenom" class="form-control">
    	</div>
    </div>

    <div class="form-group-row">
        <i class="fa fa-user prefix grey-text"></i>
   	    <label for="formDate" class="col-md-2 col-form-label">Date de naissance</label>
    	<div class="col-md-10">
	        <input required type="date" id="formDate" name="ddn" class="form-control">
    	</div>
    </div>

    <div class="form-group-row">
        <i class="fa fa-pencil prefix grey-text"></i>
        <label for="fromAdresse" class="col-md-2 col-form-label">Adresse</label>
        <div class="col-md-10">
	        <textarea required id="formAdresse" name="adresse" class=" form-control"></textarea>
        </div>
    </div>
    
    <div class="form-group-row">
        <i class="fa fa-user prefix grey-text"></i>
   	    <label for="formTel" class="col-md-2 col-form-label">Téléphone</label>
    	<div class="col-md-10">
	        <input required type="text" id="formTel" name="telephone" class="form-control">
    	</div>
    </div>
    

	<div class="form-group-row">
        <i class="fa fa-user prefix grey-text"></i>
   	    <label for="formNumSecu" class="col-sm-2 col-form-label">Numéro de sécurité sociale</label>
    	<div class="col-md-10">
	        <input required type="text" id="formNumSecu" name="numSecu" class="form-control">
    	</div>
    </div>

    <div class="text-right">
        <button id="envoyer" class="btn btn-unique">Créer<i class="fa fa-paper-plane-o ml-1"></i></button>
    </div>

</form>



</body>
</html>