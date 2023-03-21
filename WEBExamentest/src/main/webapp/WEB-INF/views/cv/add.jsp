<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Ajout d'un CV</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">

    <!-- Favicon -->
    <link href="/WEBExamentest/template/asset/img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Jost:wght@500;600;700&family=Open+Sans:wght@400;600&display=swap" rel="stylesheet"> 

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="/WEBExamentest/template/asset/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
 	<link href="/WEBExamentest/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
    <!-- Topbar Start -->
    <div class="container-fluid bg-dark">
        <div class="row py-2 px-lg-5">
            <div class="col-lg-6 text-center text-lg-left mb-2 mb-lg-0">
                <div class="d-inline-flex align-items-center text-white">
                    <small><i class="fa fa-phone-alt mr-2"></i></small>
                    <small class="px-3">|</small>
                    <small><i class="fa fa-envelope mr-2"></i>Diabel</small>
                </div>
            </div>
            <div class="col-lg-6 text-center text-lg-right">
                <div class="d-inline-flex align-items-center">
                    <a class="text-white px-2" href="">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    <a class="text-white px-2" href="">
                        <i class="fab fa-twitter"></i>
                    </a>
                    <a class="text-white px-2" href="">
                        <i class="fab fa-linkedin-in"></i>
                    </a>
                    <a class="text-white px-2" href="">
                        <i class="fab fa-instagram"></i>
                    </a>
                    <a class="text-white pl-2" href="">
                        <i class="fab fa-youtube"></i>
                    </a>
                </div>
            </div>
        </div>
    </div>
    <!-- Topbar End -->


    <!-- Navbar Start -->
    <div class="container-fluid p-0">
        <nav class="navbar navbar-expand-lg bg-white navbar-light py-3 py-lg-0 px-lg-5">
            <a href="index.html" class="navbar-brand ml-lg-3">
                <h1 class="m-0 text-uppercase text-primary"><i class="fa fa-book-reader mr-3"></i>Plateforme de recherche d'emploie</h1>
            </a>
            <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-between px-lg-3" id="navbarCollapse">
                <div class="navbar-nav mx-auto py-0">
                    <a href="<%=request.getContextPath()+"/"%>" class="nav-item nav-link active">Home</a>
                    
                   
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Gestion des CV</a>
                        <div class="dropdown-menu m-0">
                            <a href="<%=request.getContextPath()+"/cv/add"%>" class="dropdown-item">Ajouter un CV</a>
                            <a href="<%=request.getContextPath()+"/cv/list"%>" class="dropdown-item">Listes des CV </a>
                         </div>
                    </div>
                     
                </div>
                
            </div>
        </nav>
    </div>
    <!-- Navbar End -->


    <!-- Header Start -->
    <div class="jumbotron jumbotron-fluid position-relative overlay-bottom" style="margin-bottom: 90px;">
   
		  <!-- ======= Hero Section ======= -->
		  <section id="hero" class="d-flex align-items-center">
		
		    <div class="container">
		      <div class="row mt-4">
		        <div class="col-md-6" data-aos="fade-up" data-aos-delay="200">
		          
		          <!-- Chargement content ........... -->
		          
				  <div class="card">
				  	
				  	<div class="card-header">
				  		<h4>Formulaire d'ajout d'un cv</h4>
				  	</div>
				  	
				  	<div class="card-body">
				  		<form action="add" method="post" class="form-group">
				  			
				  			<div class="mb-2">
								<h6 class="form-group">Prénom</h6>
								<input type="text" name="prenom"
									placeholder="Entrer le prenom " class="form-control" required>
							</div>
							
							<div class="mb-2">
								<h6 class="form-group">Nom</h6>
								<input type="text" name="nom"
									placeholder="Entrer le nom  ..." class="form-control" required>
							</div>
							
							<div class="mb-2">
								<h6 class="form-group">Age</h6>
								<input type="text" name="age"
									placeholder="" class="form-control" required>
							</div>
							<div class="mb-2">
								<h6 class="form-group">Adresse</h6>
								<input type="text" name="adresse"
									placeholder="Entrer votre adresse ..." class="form-control" required>
							</div>
							<div class="mb-2">
								<h6 class="form-group">Email</h6>
								<input type="email" name="email"
									placeholder="Entrer votre mail ..." class="form-control" required>
							</div>
							
							<div class="mb-2">
								<h6 class="form-group">Téléphone</h6>
								<input type="text" name="telephone"
									placeholder="Entrer le numéro de téléphone  ..." class="form-control" required>
							</div>
							<div class="mb-2">
								<h6 class="form-group">Mot de passe</h6>
								<input type="password" name="password"
									placeholder="Entrer votre mot de passe" class="form-control" required>
							</div>
							<div class="mb-2">
								<h6 class="form-group">Specialite</h6>
								<input type="text" name="specialite"
									 class="form-control" required>
							</div>
							<div class="mb-2">
								<h6 class="form-group">Niveau d'etude</h6>
								<input type="text" name="niveauetude"
									 class="form-control" required>
							</div>
							<div class="mb-2">
								<h6 class="form-group">Experience Professionnelle</h6>
										<textarea  name="experience">
												Votre experience professionnelle
										</textarea>
							</div>
							
							<div class="mt-4">
								<input type="submit" name="ajouter" value="Ajouter" class="btn btn-primary">
								<input type="reset" name="annuler" value="Annuler"
									class="btn btn-danger">
							</div>
							
				  		</form>
				  	</div>
				  	
				  </div>
		          
		          <!-- Chargement content ........... -->
		          
		        </div>
		        <div class="col-lg-6 order-1 order-lg-2 hero-img" data-aos="zoom-in" data-aos-delay="200">
		          <img src="/SchoolWeb/template/assets/img/hero-img.png" class="img-fluid animated" alt="">
		        </div>
		      </div>
		    </div>
		
		  </section><!-- End Hero -->
		
		  
		       
    </div>
    <!-- Header End -->


    <!-- Footer Start -->
    
    <div class="container-fluid bg-dark text-white-50 border-top py-4" style="border-color: rgba(256, 256, 256, .1) !important;">
        <div class="container">
            <div class="row">
                <div class="col-md-6 text-center text-md-left mb-3 mb-md-0">
                    <p class="m-0">Copyright &copy; <a class="text-white" href="#">Your Site Name</a>. All Rights Reserved.
                    </p>
                </div>
                <div class="col-md-6 text-center text-md-right">
                    <p class="m-0">Designed by <a class="text-white" href="https://htmlcodex.com">HTML Codex</a>
                    </p>
                </div>
            </div>
        </div>
    </div>
    <!-- Footer End -->


    <!-- Back to Top -->
    <a href="#" class="btn btn-lg btn-primary rounded-0 btn-lg-square back-to-top"><i class="fa fa-angle-double-up"></i></a>


    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <script src="/WEBExamentest/template/asset/lib/easing/easing.min.js"></script>
    <script src="/WEBExamentest/template/asset/lib/waypoints/waypoints.min.js"></script>
    <script src="/WEBExamentest/template/asset/lib/counterup/counterup.min.js"></script>
    <script src="/WEBExamentest/template/asset/lib/owlcarousel/owl.carousel.min.js"></script>

    <!-- Template Javascript -->
    <script src="/WEBExamentest/template/asset/js/main.js"></script>
</body>

</html>