package demo.ignat.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {

    @RequestMapping("/parameters")
    public String parameters(@RequestParam(required = false) String name,
                             @RequestParam(required = false) String color,
                             Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "parameters.html";

    }

    @RequestMapping("/variables/{name}/{color}")
    public String variables(@PathVariable String name,
                            @PathVariable String color,
                            Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "variables.html";

    }
}
