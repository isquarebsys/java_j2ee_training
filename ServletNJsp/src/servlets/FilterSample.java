package servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class FilterSample implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = resp.getWriter();
		out.print("filter is invoked before");

		chain.doFilter(req, resp);// sends request to next resource

		out.print("filter is invoked after");
	}

	public void destroy() {
	}
}