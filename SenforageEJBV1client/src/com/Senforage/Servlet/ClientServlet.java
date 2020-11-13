package com.Senforage.Servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SenforageEJBV1.dao.ClientImpl;
import com.SenforageEJBV1.dao.ClientLocal;
import com.SenforageEJBV1.dao.VillageImpl;
import com.SenforageEJBV1.dao.VillageLocal;
import com.SenforageEJBV1.entities.Client;



/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/Client")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    @EJB
	private ClientLocal clientdao;
    @EJB
    private VillageLocal villagedao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("WEB-INF/view/client/add.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Client c = new  Client();
	c.setNom(request.getParameter("nom"));
	c.setPrenom(request.getParameter("prenom"));
	c.setAdresse(request.getParameter("adresse"));
	c.setTelephone(request.getParameter("telephone"));
	clientdao.add(c);
	request.setAttribute("clients", clientdao.listeClient());

	request.getRequestDispatcher("WEB-INF/view/client/list.jsp").forward(request,response);
	}

}
