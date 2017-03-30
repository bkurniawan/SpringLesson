<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	
	First Name  : <form:input path="firstName" />

		<br>
		<br>

	Last Name : <form:input path="lastName" />
		<br>
		<br>


	<!--  Country : 
		<form:select path="country">
			<form:option value="BRA" label="Brazil" />
			<form:option value="FRA" label="France" />
			<form:option value="GER" label="Germany" />
			<form:option value="INR" label="India" />

		</form:select>
-->
		<br>
		<br>


	Country Options :  
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>

		<br>
		<br>


		<input type="submit" value="Submit">
		
		<br>
		<br>
		
		path="country" adalah nama field di Student class.
		Spring akan mengisi setCountry() dengan option pada saat submit. 
		jadi pada saat kita memanggil ${student.country}, Spring akan memanggil getCountry() di Student class yang sudah diisi oleh Spring dengan value yang dipilih.
		
		
		
	</form:form>
</body>
</html>
