<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container-fluid bg-primary header_design">
            <div class="container">
                <div class="row">
                    <div class="col-3">
                        <a href="profile-admin" class="navbar-brand text-light"> CRM Application </a>
                    </div>
                    <div class="col-6"> </div>
                    <div class="col-3">
                        <a class="navbar-brand text-light" href="#">
                            <img src="images/admin_profile_pic.png" alt="Welcome Admin" style="width:40px;" class="rounded-pill">
                            Admin
                        </a>
                        <a href="#" class="text-light"> Logout </a>
                    </div>
                </div>
            </div>
        </div>

        <nav class="navbar navbar-expand-sm bg-dark navbar-dark container-fluid">
            <div class="container">
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-center" id="collapsibleNavbar">
                    <ul class="navbar-nav">
                    	<li class="nav-item">
                            <a class="nav-link" href="profile-admin">Home</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Employees</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="add-employee">Add Employee</a></li>
                                <li><a class="dropdown-item" href="employees-list">Employee's List</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Products</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Add Products</a></li>
                                <li><a class="dropdown-item" href="#">Products's List</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Complaints</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
	</body>
</html>