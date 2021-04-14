package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cs",urlPatterns = {"/controleur","*.do"})
public class ControlleurServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String path = req.getServletPath();
		System.out.println(path);
		String viewName = path.substring(1,path.indexOf(".do"));
		System.out.println(viewName);
		String pathView = "views/"+viewName+".jsp";
		System.out.println(pathView);
		req.getRequestDispatcher(pathView).forward(req, resp);;
	}
}
