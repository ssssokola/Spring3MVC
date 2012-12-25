package net.viralpatel.spring3.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
 
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        String message = "Hello World, Spring 3.0!111111111";
        return new ModelAndView("hello", "message", message);
    }
    
    @RequestMapping("/bye")
    public ModelAndView byeWorld() {
 
        String message = "Bye World1111111";
        return new ModelAndView("hello", "message", message);
    }
}