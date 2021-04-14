package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Controller {

	public abstract void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
