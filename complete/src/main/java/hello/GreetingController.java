package hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hello.bean.GreetingBean;

@Controller
public class GreetingController {
	@Autowired
	protected GreetingBean greetingBean;

    @GetMapping("/greeting")
    public String greeting(HttpServletRequest request,@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    	
    	model.addAttribute("name", request.getRemoteUser());
    	
    	greetingBean.setMsg(name);
        return "greeting";
    }

}