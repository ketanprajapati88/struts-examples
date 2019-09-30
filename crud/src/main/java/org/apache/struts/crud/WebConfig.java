package org.apache.struts.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebConfig {

    @GetMapping("/")
    public ModelAndView welcome(){
        return new ModelAndView("index");
    }
}
