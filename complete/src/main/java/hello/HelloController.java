package hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hello.bean.GreetingBean;

@Controller
public class HelloController {
	@Autowired
	protected GreetingBean greetingBean;

    @GetMapping("/hello")
    public String hello(Model model) {
    	model.addAttribute("name", greetingBean.getMsg());
        return "hello";
    }

}