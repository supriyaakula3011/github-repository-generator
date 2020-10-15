package net.codejava;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		ModelAndView mav=new ModelAndView("home");
		mav.addObject("message","Greetings message from controller");
		System.out.println("say hello got called");
		return mav;
	}

}
