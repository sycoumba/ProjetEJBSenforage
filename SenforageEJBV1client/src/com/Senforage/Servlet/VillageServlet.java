package com.Senforage.Servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SenforageEJBV1.dao.VillageLocal;
import com.SenforageEJBV1.entities.Client;
import com.SenforageEJBV1.entities.Village;

/**
 * Servlet implementation class VillageServlet
 */
@WebServlet("/Village")
public class VillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 @EJB
	    private VillageLocal villagedao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VillageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/view/village/add.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Village v = new  Village();
		v.setNom(request.getParameter("nom"));
		villagedao.add(v);
		request.setAttribute("clients", villagedao.listeVillage());

		request.getRequestDispatcher("WEB-INF/view/client/list.jsp").forward(request,response);
	}

}
