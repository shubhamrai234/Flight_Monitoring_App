package com.project.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.GenericFilter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class FlightFilter extends GenericFilter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		String tokenHeader = req.getHeader("authorization");
		String token = tokenHeader.substring(7);
		Claims claims=Jwts.parser().setSigningKey("secretKey").parseClaimsJws(token).getBody();
		req.setAttribute("username", claims.getId());
		chain.doFilter(request, response);
		
	}

}
