<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="studentAttribute">
	First name: <form:input path="firstName" />
		<br>
		<br>
	Second name: <form:input path="lastName" />
		<br>
		<br>
	Country: 
	<form:select path="country">
			<form:options items="${studentAttribute.countryList }"/>
	</form:select>
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>