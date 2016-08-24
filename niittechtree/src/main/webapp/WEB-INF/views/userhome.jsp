<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link
	href="maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdn.datatables.net/1.10.11/css/dataTables.bootstrap.min.css"
	rel="stylesheet">
<link
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css" />
<script type="text/javascript"
	src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" />





</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<!-- Services -->
	<div class="services-container section-container">
		<div class="container">
			<div class="panel-title">
				<h2>Home</h2>
			</div>
			<div>

				Welcome &nbsp;
				<c:if test="${not empty pageContext.request.userPrincipal}">
					<h5>
						<c:out value="${pageContext.request.userPrincipal.name}" />
					</h5>
				</c:if>

			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-sm-4">
			 
				<img src="resources/images/<c:out value="${pageContext.request.userPrincipal.name}" />.jpg" alt="profile image"
					height="100" width="100" /><br>
				<p>
					<a href="imageupload">Upload Photo</a>
				</p>
			</div>
			<div class="col-sm-6">
				<table class="table">
					<tr>
						<th>Profile
						<th>
					</tr>
					<c:if test="${! empty userinfo}">
						<c:set value="${userinfo}" var="user" />
						<tr>

							<td>Name : <c:out value="${user.name}" /></td>
						</tr>
						<tr>
							<td>Username : ${user.username}</td>
						</tr>
						<tr>
							<td>Email : ${user.email}</td>
						</tr>
						<tr>
							<td>Phone no : ${user.phoneno}</td>
						</tr>
						<tr>
							<td>Location : ${user.location}</td>
						</tr>
					</c:if>
				</table>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
			<table class="table">
			<tr>
				<td><a href="blog" class="btn btn-link"
					style="background-color: blue; color: white;">Blog</a>
				</td>
			
				<td><a href="forum" class="btn btn-link"
					style="background-color: blue; color: white;">Wall</a>
			</td>
			
				<td><a href="#" class="btn btn-link"
					style="background-color: blue; color: white;">Chat</a>
			</td>
			</tr>
		</table>
		</div>

	</div>
	<br>
	<br>
	<br>
	<br>
	<br>

</body>
</html>