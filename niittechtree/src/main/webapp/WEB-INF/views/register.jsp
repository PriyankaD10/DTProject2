<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="services-container section-container">
		<div class="container">
			<div class="panel-title">
				<h2>Register</h2>
			</div>

			<div class="row">
				<div>
					<div>
						<h5>New users register here</h5>
						<div>

							<hr />
							<div class="col-sm-10">
								<form:form method="post" action="saveuser" modelAttribute="newuser">

									<table class="table-striped" width="100%">
										<tr>

											<td><form:hidden path="id" /></td>
										</tr>
										<tr>
											<td><form:label path="name">Name</form:label></td>
											<td><form:input path="name" class="form-control"/></td>
											<td><form:errors path="name" cssClass="error"/><br></td>
										</tr>
										
										<tr>
											<td><br><form:label path="username">Username</form:label></td>
											<td><form:input path="username" class="form-control" /></td>
											<td><form:errors path="username" cssClass="error"/><br></td>
										</tr>
										<tr>
											<td><br><form:label path="password">Password</form:label><br></td>
											<td><form:input path="password" type="password" class="form-control" /></td>
											<td><form:errors path="password" cssClass="error"/><br></td>
										</tr>
										<tr>
											<td><form:label path="email">Email</form:label><br></td>
											<td><form:input path="email" type="email" class="form-control"/></td>
											<td><form:errors path="email" cssClass="error"/><br></td>
										</tr>
										
										<tr>
											<td><form:label  path="location">Location</form:label><br></td>
											<td><form:input path="location" class="form-control"/></td>
											<td><form:errors path="location" cssClass="error"/><br></td>
										</tr>
										<tr>
											<td><form:label  path="phoneno">Mobile</form:label><br></td>
											<td><form:input path="phoneno" class="form-control"/></td>
											<td><form:errors path="phoneno" cssClass="error"/><br></td>
										</tr>
										
										<tr>
											<br>
											<c:choose>
												<c:when test="${empty newuser.username}">
													<td><input type="submit" value="Register"
														class="btn btn-primary" /></td>
												</c:when>
											</c:choose>
										</tr>
									</table>

								</form:form>
							</div>

						</div>
					</div>
				</div>
			</div>
			<div></div>
			<script>
				$(document).ready(function() {
					$('#example').DataTable();
				});
			</script>
</body>
</html>