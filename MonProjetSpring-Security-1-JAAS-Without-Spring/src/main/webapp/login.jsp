<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgrey">
<h1>Formulaire</h1>
	<form action="j_security_check">

		Votre nom : <input type="text" name="j_username"> <br />
		Votre mot de passe : <input type="password" name="j_password">
		
		<br /> <input type="submit" value="S'authentifier ...">


	</form>
</body>
</html>