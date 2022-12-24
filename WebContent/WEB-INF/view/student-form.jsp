<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
		
			First Name: <form:input path="firstName" placeholder="First Name" />
			
			<br><br>
			
			Last Name: <form:input path="lastName" placeholder="Last Name" />
			
			<br><br>
			
			Country : 
			<form:select path="country">
			
			<!--  
				<form:option value="India" label="India"></form:option>
				<form:option value="France" label="France"></form:option>
				<form:option value="Brazil" label="Brazil"></form:option>
				<form:option value="Belgium" label="Belgium"></form:option>
			-->
				<form:options items="${student.countryOptions}"></form:options>
				
			</form:select>
			
			<br><br>
			
			Favorite Programming Language:
			
				Java <form:radiobutton path="favoriteLanguage" value="Java" />
				JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript" />
				C++ <form:radiobutton path="favoriteLanguage" value="C++" />
				PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
				Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
				
				
			<br><br>
			
			Operating Systems:
			
				Linux <form:checkbox path="operatingSystems" value="Linux" />
				Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
				MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
				
			<br><br>
			
			<input type="submit" value="Submit" />
			
		</form:form>
	</body>
</html>