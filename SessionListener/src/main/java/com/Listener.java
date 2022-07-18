package com;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Listener implements HttpSessionListener{
	int current=0;
	int total=0;
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		current++;
		total++;
		System.out.println(current+""+total);
		ServletContext cx=se.getSession().getServletContext();
		cx.setAttribute("currentuser", current);
		cx.setAttribute("totaluser", total);
		
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		current--;
		ServletContext cx=se.getSession().getServletContext();
		cx.setAttribute("currentuser", current);
	}
}
