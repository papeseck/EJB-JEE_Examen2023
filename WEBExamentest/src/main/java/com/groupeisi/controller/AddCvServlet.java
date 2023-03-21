package com.groupeisi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.groupeisi.dao.ICv;
import com.groupeisi.entities.Cv;

@WebServlet(value="/cv/add", name="AddCvServlet")
public class AddCvServlet extends HttpServlet {
		
		private static final long serialVersionUID = 1L;
		
		@EJB
		private ICv cvmetier;
	       
	    public AddCvServlet() {
	        super();
	    }

		public void init(ServletConfig config) throws ServletException {
			// TODO Auto-generated method stub
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//response.getWriter().println(studentmetier.Salut());
			request.getRequestDispatcher("/WEB-INF/views/cv/add.jsp").forward(request, response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String prenom = request.getParameter("prenom");
			String nom = request.getParameter("nom");
			String age = request.getParameter("age");
			String phone = request.getParameter("telephone");
			String email = request.getParameter("email");
			String adresse = request.getParameter("adresse");
			String specialite = request.getParameter("specialite");
			String niveauetude = request.getParameter("niveauetude");
			String experienceprofessionnelle = request.getParameter("experience");
			String motdepasse= request.getParameter("password");
			
			
			
			Cv c = new Cv( 0, prenom, nom, age, phone, email, adresse, specialite, niveauetude, experienceprofessionnelle, motdepasse);
			c.setPrenom(prenom);
			c.setNom(nom);
			c.setAge(age);
			c.setTelephone(phone);
			c.setEmail(email);
			c.setAdresse(adresse);
			c.setSpecialite(specialite);
			c.setNiveauEetude(niveauetude);
			c.setExperienceProfessionnelle(experienceprofessionnelle);
			c.setMotdepasse(motdepasse);
			
			cvmetier.add(c);
			
			
			response.sendRedirect(request.getContextPath()+"/cv/list");
		}

	}


