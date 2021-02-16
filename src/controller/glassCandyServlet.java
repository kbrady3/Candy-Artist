package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CandyArtist;

/**
 * Servlet implementation class glassCandyServlet
 */
@WebServlet("/glassCandyServlet")
public class glassCandyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public glassCandyServlet() {
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
		String ingredient1 = request.getParameter("glass1");
		String ingredient2 = request.getParameter("glass2");
		String ingredient3 = request.getParameter("glass3");
		
		CandyArtist ca = new CandyArtist(ingredient1, ingredient2, ingredient3);
		
		request.setAttribute("glass", ca);
		getServletContext().getRequestDispatcher("/glassCandyResult.jsp").forward(request, response);
		
		doGet(request, response);
	}

}
