package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cs",urlPatterns = {"/controleur","*.php"})
public class ControlleurServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
	  //	PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		req.setAttribute("model", name);
		//req.getRequestDispatcher("vue.jsp").forward(req, resp);
		resp.sendRedirect("vue.jsp?name="+name);
	}
}
