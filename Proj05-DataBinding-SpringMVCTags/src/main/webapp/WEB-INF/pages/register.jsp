<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color: blue; text-align: center;">Employee Register Form</h1>

<frm:form modelAttribute="emp">
	<table align="center">
		<tr>
			<td>Employee Name: </td>
			<td><frm:input path="ename"/></td>
		</tr>
		<tr>
			<td>Employee Address: </td>
			<td><frm:input path="eaddress"/></td>
		</tr>
		<tr>
			<td>Employee Salary: </td>
			<td><frm:input path="esalary"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Register"/></td>
		</tr>
	</table>
</frm:form>