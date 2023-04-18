package ControllerToUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welMsg")
	public ModelAndView welcomeMsg() {
		
		String msg="Welcome To BikkadIT";
		ModelAndView mva=new  ModelAndView ();
		mva.addObject("MESSAGE", msg);
		mva.setViewName("wel");
		return mva;
		
	}
}
