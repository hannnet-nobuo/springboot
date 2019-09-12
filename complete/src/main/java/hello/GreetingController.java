package hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(HttpServletRequest request,@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    	name = request.getRemoteUser();
    	model.addAttribute("name", name);
    	
        return "greeting";
    }

}