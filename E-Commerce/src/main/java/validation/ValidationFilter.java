package validation;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/user_reg")
public class ValidationFilter extends HttpFilter{
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String cname=request.getParameter("cname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
		if(cname==""||cname==null) {
			request.setAttribute("cnameE", "Please enter name!!");
			rd.forward(request, response);
		}else if(!LetterValidation.letterCheck(cname)){
			request.setAttribute("cnameE", "Only Letters allowed");
			rd.forward(request, response);
		}
		else if(mobile==""||mobile==null) {
			request.setAttribute("mobileE", "Please enter mobile number!!");
			rd.forward(request, response);
		}else if(!NumberValidation.numCheck(mobile)){
			request.setAttribute("mobileE", "Please enter valid mobile");
			rd.forward(request, response);
		}
		else if(email==""||email==null) {
			request.setAttribute("emailE", "Please enter email!!");
			rd.forward(request, response);
		}else if(!EmailValidation.emailCheck(email)){
			request.setAttribute("emailE", "Please enter valid email!!");
			rd.forward(request, response);
		}
		else if(password==""||password==null) {
			request.setAttribute("passwordE", "Please enter password!!");
			rd.forward(request, response);
		}else if(!PasswordValidation.passCheck(password)){
			request.setAttribute("passwordE", "Please enter atleast 1 small & 1 capiatl letter, 1 symbol & 1 num(password should be 8-16 characters)!!");
			rd.forward(request, response);
		}
		else
		{
		
		chain.doFilter(request, response);
		}
	}
}
