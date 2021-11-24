package com.server.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ServerController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String main(Model model){
        return "/index";
    }

    @RequestMapping(value ="/apiTest", method = RequestMethod.GET)
    public String main(){
        return "/index";
    }

}
