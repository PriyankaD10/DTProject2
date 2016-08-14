<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				<h2>Login</h2>
			</div>

			<div class="row">
				<div class="col-sm-6">
					<div class="form-bottom-right" width="60%">
						<form name='loginForm' action="<c:url value='perform_login' />"
							method='POST' class="registration-form">
							<div class="form-group" height="100" width="200">
								<label class="sr-only" for="username">Username</label> <input
									type="text" name="username" placeholder="First name..."
									class="form-first-name form-control" id="form-first-name">
							</div>
							<div class="form-group" height="100" width="200">
								<label class="sr-only" for="password">Password</label> <input
									type="password" name="password" placeholder="Password..."
									class="form-password form-control" id="form-password">
							</div>

							<button type="submit" class="btn btn-primary">Login</button>
							<%-- <input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" /> --%>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
</body>
</html>