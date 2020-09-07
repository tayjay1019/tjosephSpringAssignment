package edu.wctc.sales;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/fossils")

public class HomeworkController {

    @PostMapping("/facts")
    public String showFossilFacts(){
        return "pages/fossil-facts";
    }
    @GetMapping("/trilobites")
    public String ShowTriloFacts(){return "pages/trilobites";}

    @RequestMapping("/forward-me")
    public String doForward(){
        return"forward:/glaciers/facts";
    }

    @RequestMapping("/redirect-me")
    public String doRedirect(){
        return "redirect:http://www.google.com";
    }
}
