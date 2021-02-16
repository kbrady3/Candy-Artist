package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CandyArtist;

/**
 * Servlet implementation class trufflesServlet
 */
@WebServlet("/trufflesServlet")
public class trufflesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public trufflesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ingredient1 = request.getParameter("choc1");
		String ingredient2 = request.getParameter("choc2");
		String ingredient3 = request.getParameter("choc3");
		
		CandyArtist ca = new CandyArtist(ingredient1, ingredient2, ingredient3);
		
		request.setAttribute("truffle", ca);
		getServletContext().getRequestDispatcher("/trufflesResult.jsp").forward(request, response);
		
		doGet(request, response);
	}

}
