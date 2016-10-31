<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new Employee</title>
<script>
	function validateform() {
		var id = document.newEmployeeForm.id.value;
		var name = document.newEmployeeForm.name.value;
		var salary = document.newEmployeeForm.salary.value;
		var designation = document.newEmployeeForm.designation.value;

		if (isNaN(id)) {
			document.getElementById("id").innerHTML = "Enter Numeric value only";
			return false;
		} else if (id == 0) {
			document.getElementById("id").innerHTML = "Id can't be 0";
			return false;
		} else if (name == null || name == "") {
			document.getElementById("name").innerHTML = "Name can't be empty";
			return false;
		} else if (isNaN(salary)) {
			document.getElementById("salary").innerHTML = "Enter Numeric value only";
			return false;
		} else if (salary == 0) {
			document.getElementById("salary").innerHTML = "salary can't be 0";
			return false;
		} else if (designation == null || designation == "") {
			document.getElementById("designation").innerHTML = "Name can't be empty";
			return false;
		}
	}
</script>
</head>
<body>
	<h1>Add New Employee</h1>
	<form:form name="newEmployeeForm" method="post" action="save"
		onsubmit="return validateform()">
		<table>
			<tr>
				<td>Id : <input type="text" name="id" required /><span
					style="color: red" id="id"></span></td>

			</tr>
			<tr>
				<td>Name : <input type="text" name="name" required /><span
					style="color: red" id="name"></span></td>

			</tr>
			<tr>
				<td>Salary : <input type="text" name="salary" required /><span
					style="color: red" id="salary"></span></td>

			</tr>
			<tr>
				<td>Designation : <input type="text" name="designation"
					required /><span style="color: red" id="designation"></span></td>

			</tr>
			<tr>

				<td><input type="submit" value="Save" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>