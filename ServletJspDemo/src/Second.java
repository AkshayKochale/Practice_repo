import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		PrintWriter out = res.getWriter();
		out.print("hello Second servlet Working.....");
		
		
	}

	@Override
	public void destroy() {
		System.out.println("second destroyed");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("second init");
	}

	
	
}
