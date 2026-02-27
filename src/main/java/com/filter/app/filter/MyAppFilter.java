package com.filter.app.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class MyAppFilter implements Filter {

	public MyAppFilter() {
		System.out.println("Filter Executed");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();
		if (uri.equals("api/res1")) {
			System.out.println("Forwardinig the request without validation.");
			chain.doFilter(request, response);
		} else {
			req.setAttribute("message", "Validation Success");
			System.out.println("Forwarding request after validation");
			chain.doFilter(request, response);
		}
	}
}
