package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String name=request.getParameter("hello");
		System.out.println(name);
		
		ModelAndView mav=new ModelAndView("index");
		mav.addObject("helloworld", "hello"+name);
		return mav;
	}

}
