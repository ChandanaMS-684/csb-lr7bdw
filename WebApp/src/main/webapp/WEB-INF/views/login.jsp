<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="customerModel" action="login" method="post">
				<fieldset>
					<legend>Enter Credentials</legend>
					<p>
						<form:label for="username" path="username"  cssErrorClass="error">User Id</form:label>
						<br />
						<form:input path="username" />
						<form:errors path="username" />
					</p>
					<p>
						<form:label for="password" path="password"   cssErrorClass="error">Password</form:label>
						<br />
						<form:input path="password" />
						<form:errors path="password" />
					</p>
					
					<p>
						<button type="submit">Submit</button> 
					</p>
			</fieldset>
</form:form>
</body>
</html>