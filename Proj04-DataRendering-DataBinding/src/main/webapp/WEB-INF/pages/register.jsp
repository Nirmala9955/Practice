<%@ page isELIgnored="false"%>

<h1 style="color: blue; text-align: center;">Employee Register Form</h1>

<form method="post">
	<table>
		<tr>
			<td>Employee Name: </td>
			<td><input type="text" name="ename"></td>
		</tr>
		<tr>
			<td>Employee Address: </td>
			<td><input type="text" name="eaddress"></td>
		</tr>
		<tr>
			<td>Employee Salary: </td>
			<td><input type="text" name="esalary"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Register"></td>
		</tr>
	</table>
</form>