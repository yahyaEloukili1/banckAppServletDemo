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

	private Controller controler;
	@Override   
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pathRquest = req.getServletPath();
		String controllerClassName = pathRquest.substring(1,pathRquest.indexOf(".do"));
		try {
			controler = (Controller) Class.forName("controllers."+controllerClassName).newInstance();
			controler.execute(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
