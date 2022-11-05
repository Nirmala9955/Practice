<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1 style="color: blue; text-align: center;">Reading Simple Values</h1>
<div style="text-align: center;">
	<b>Name: ${name}</b> <br>
	<b>Age: ${age}</b><br>
	<b>Address: ${address}</b><br>
	<b>Nick Names: 
		<c:forEach var="name" items="${nickNames}">
			${name},
		</c:forEach>
	</b><br>
	<b>Mobile Nos: 
		<c:forEach var="no" items="${mobileNos}">
			${no},
		</c:forEach>
	</b><br>
	<b>Subject Experts: 
		<c:forEach var="subject" items="${subjectExpert}">
			${subject},
		</c:forEach>
	</b><br>
	<b>IDs: 
		<c:forEach var="id" items="${ids}">
			${id.key} - ${id.value},
		</c:forEach>
	</b><br>
</div>
<br>
