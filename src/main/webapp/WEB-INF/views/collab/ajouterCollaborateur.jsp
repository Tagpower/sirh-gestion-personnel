<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-
dist/css/bootstrap.css">
</head>

<body>

<form>

    <p class="h5 text-center mb-4">Write to us</p>

    <div class="md-form">
        <i class="fa fa-user prefix grey-text"></i>
        <input type="text" id="form3" class="form-control">
        <label for="form3">Your name</label>
    </div>

    <div class="md-form">
        <i class="fa fa-envelope prefix grey-text"></i>
        <input type="text" id="form2" class="form-control">
        <label for="form2">Your email</label>
    </div>

    <div class="md-form">
        <i class="fa fa-tag prefix grey-text"></i>
        <input type="text" id="form32" class="form-control">
        <label for="form34">Subject</label>
    </div>

    <div class="md-form">
        <i class="fa fa-pencil prefix grey-text"></i>
        <textarea type="text" id="form8" class="md-textarea" style="height: 100px"></textarea>
        <label for="form8">Your message</label>
    </div>

    <div class="text-center">
        <button class="btn btn-unique">Send <i class="fa fa-paper-plane-o ml-1"></i></button>
    </div>

</form>
<!-- Form contact -->

</body>
</html>