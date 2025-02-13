<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Bootstrap Example</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
		
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>
	<body>
		<jsp:include page="header-admin.jsp" />
	
		<div class="container-fluid">
			<div class="container">
	
			<c:if test="${not empty status}">
					<div class="row">
						<div class="alert alert-success alert-dismissible fade show"
							role="alert">
							${status}
							<button type="button" class="btn-close" data-bs-dismiss="alert"
								aria-label="Close"></button>
						</div>
					</div>
				</c:if> 
	
			  	<c:if test="${not empty error}">
					<div class="row">
						<div class="alert alert-danger alert-dismissible fade show"
							role="alert">
							${error}
							<button type="button" class="btn-close" data-bs-dismiss="alert"
								aria-label="Close"></button>
						</div>
					</div>
				</c:if> 
	
				<div class="row">
					<div class="col-3"></div>
					<div class="col-6 d-flex justify-content-center">
						<div class="addemp_div_design bg-light">
							<h3>Register Employee</h3>
							<br />
							<form action="addEmpForm" method="post" >
								<div class="mb-3">
									<label class="form-label">Enter Full Name</label>
									<input type = text name="name" class="form-control" value = ""/>
								</div>
								<div class="mb-3">
									<label class="form-label">Enter Email</label>
									<input type = text name="email" class="form-control" value = "" />
									
								</div>
								<div class="mb-3">
									<label class="form-label">Enter Password</label>
									<input type = password name="password" class="form-control" value = "" />
									
								</div>
								<div class="mb-3">
									<label class="form-label">Enter Phone No.</label>
									<input type = text name="phoneno" class="form-control" />
									
								</div>
								<input type="submit" value="Register" class="btn btn-primary" />
							</form>
						</div>
					</div>
					<div class="col-3"></div>
				</div>
			</div>
		</div>
	
	</body>
</html>
