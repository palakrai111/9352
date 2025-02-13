<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Employee's List</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

        <link rel="stylesheet" type="text/css" href="css/style.css" />
        
        <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>



</head>
<body>


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
	</div>
					</div>




  <h2>Employee's List</h2>
            <p> Below table displays only 10 employees list </p>            
            <table class="table table-light table-bordered table-striped">
                <thead>
                    <tr>
                        <th>Full Name</th>
                        <th>Email</th>
                        <th>Phone No.</th>
                        <th style="text-align: center;">Update</th>
                        <th style="text-align: center;">Delete</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="employee" items="${model_emp_list}">
                    	<tr>
                    		<td> ${employee.getName()} </td>
                    		<td> ${employee.getEmail()} </td>
                    		<td> ${employee.getPhoneno()} </td>
                    		<td style="text-align: center;"> 
                    			<a href ="<c:url value="/updateEmp/${employee.getEmail()}"/>">u</a>
                    		</td>
                    		<td style="text-align: center;"> 
                    			<a href ="<c:url value="/deleteEmp/${employee.getEmail()}"/>">d</a>
                    		</td>
                    	</tr>
                    </c:forEach>
                </tbody>
            </table>
            



</body>
</html>