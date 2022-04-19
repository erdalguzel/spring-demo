<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Customer Confirmation Page</title>
</head>

<body>
	The customer is: ${customerAttribute.firstName} ${customerAttribute.lastName }
	Course code: ${customerAttribute.courseCode }
</body>

</html>