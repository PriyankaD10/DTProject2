<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link href="maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"> 
<link href="https://cdn.datatables.net/1.10.11/css/dataTables.bootstrap.min.css" rel="stylesheet"> 
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet"> 
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"/> 
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"/>

<script src="http://code.angularjs.org/1.4.8/angular.js"></script>
<script src="http://code.angularjs.org/1.4.8/angular-resource.js"></script>
<script src="http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.11.0.js"></script>
<script>

var app=angular.module('MyForm',['ui.bootstrap','ngResource']);
app.controller('myCtrl',function($scope){
	
	$scope.predicate='discusstitle';
	$scope.reverse=true;
	$scope.currentPage=1;
	$scope.order=function(predicate){
		$scope.reverse=($scope.predicate===predicate)?!$scope.reverse:false;
		$scope.predicate=predicate;
	};
	$scope.forums=${forumlist};
	
		$scope.totalItems = $scope.forums.length;  
	       $scope.numPerPage = 5;  
	       $scope.paginate = function (value) {  
	         var begin, end, index;  
	         begin = ($scope.currentPage - 1) * $scope.numPerPage;  
	         end = begin + $scope.numPerPage;  
	         index = $scope.forums.indexOf(value);  
	         return (begin <= index && index < end);  
		
	};
	
});
</script>


</head>
<body ng-app="MyForm">
<jsp:include page="header.jsp"></jsp:include>        
        <!-- Services -->
        <div class="services-container section-container">
	        <div class="container">
				<div class="panel-title"><h2>Forum</h2></div>
				
				<div>
								<a href="addnewdiscuss" class="btn btn-link" style="background-color:blue; color:white;" >Add New Discussion</a>					
							</div>
				
			<div class="row">
				<div class=col-sm-8>


					<div ng-controller="myCtrl">
						<h5>Wall :Posted</h5>
						<div>
							
							<hr />

							<table width="80%" class="table table-striped" id="example">
								<thead>
									<tr>

										<th><a href="#" ng-click="order('id')">Wall ID</a></th>
										<th><a href="#" ng-click="order('discusscategory')">Category
												</a></th>
										<th><a href="#" ng-click="order('discusstitle')">Title
												Content</a></th>
										<th><a href="#" ng-click="order('discusscontent')">Content
												Date</a></th>
										<th><a href="#" ng-click="order('discusscreatedate')">Creation Date</a></th>
										
										<th><a href="#" ng-click="order('discussusername')">Username</a></th>
										<!-- <th>Edit</th> -->
									</tr>
								</thead>
								<tbody>

									<tr
										ng-repeat="forum in forums | orderBy:predicate:reverse | filter:paginate"
										ng-class-odd="'odd'">


										<td>{{forum.id}}</td>
										<td>{{forum.discusscategory}}</td>
										<td>{{forum.discusstitle}}</td>
										<td>{{forum.discusscontent}}</td>
										<td>{{forum.discusscreatedate}}</td>
										<td>{{forum.discussusername}}</td>


										<%-- <c:set var="pid" value="{{product.id}}"></c:set>
										            
										            <c:set var="pname" value="{{product.productname}}"></c:set>
										            
										            <c:set var="pdesc" value="{{product.productdescription}}"></c:set>
										            
										            <c:set var="pprice" value="{{product.productprice}}"></c:set>
										            
										            <c:set var="pcategory" value="{{product.category}}"></c:set>
										            
										            <c:set var="pstatus" value="{{product.status}}"></c:set>
										             
													<td><a href="Details?id=${pid}&productname=${pname}&productdescription=${pdesc}&productprice=${pprice}&productcategory=${pcategory}&productstatus=${pstatus}">View Details</a></a></td>
												<!-- 	<div ng-init="myVar = 'ProductDetails/'">
													 
										            <td><a ng-href="{{myVar}}{{product.id}}">View Details</a></a></td> --%>
									</tr>
								</tbody>
							</table>

						</div>
					</div>
				</div>
			</div>
			<div>
			</div>
			<script>
$(document).ready(function(){
    $('#example').DataTable();
});
</script>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

</body>
</html>