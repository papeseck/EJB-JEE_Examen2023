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

@WebServlet(value="/cv/list", name="ListeCvServlet")
public class ListeCvServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		@EJB
		private ICv cvmetier;
	       
	    public ListeCvServlet() {
	        super();
	    }

		public void init(ServletConfig config) throws ServletException {
			// TODO Auto-generated method stub
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			request.setAttribute("listcv", cvmetier.list());
			request.getServletContext().getRequestDispatcher("/WEB-INF/views/cv/list.jsp").forward(request, response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		}

	}




