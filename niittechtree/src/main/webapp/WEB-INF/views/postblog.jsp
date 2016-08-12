<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
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


</script>


</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<!-- Services -->
	<div class="services-container section-container">
		<div class="container">
			<div class="panel-title">
				<h2>Blogs</h2>
			</div>

			<div class="row">
				<div>


					<div>
						<h5>Post or Edit Blogs</h5>
						<div>

							<hr />
							<div class="col-sm-10">
								<form:form method="post" action="saveblog" modelAttribute="blog">

									<table class="table-striped" width="100%">
										<tr>

											<td colspan="2"><form:hidden path="id" /></td>

										</tr>

										<tr>
											<td colspan="2"><form:label path="blogtitle">Title</form:label></td>
										</tr>
										<tr>
											<td><form:input path="blogtitle" class="form-control" /><br></td>
										</tr>
										<tr>
											<td colspan="2"><form:label path="blogcontent">Blog Content</form:label><br></td>

										</tr>
										<tr>
											<td colspan="2"><form:textarea path="blogcontent"
													class="form-control" rows="10" /></td>
										</tr>

										<tr>
											<c:choose>
												<c:when test="${empty blog.blogtitle}">
													<td><input type="submit" value="Post"
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