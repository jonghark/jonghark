package com.server.web;

import com.server.domain.ApiTestVO;
import com.server.service.ServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ServerController {

    private final ServerService serverService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String main(Model model){
        return "/index";
    }

    @RequestMapping(value ="/apiTest", method = RequestMethod.POST, headers="Accept=application/json", produces="application/json")
    @ResponseBody
    public ResponseEntity<?> apiTest(@ModelAttribute ApiTestVO apiTestVO , HttpServletRequest request){
        Map<String,Object> resultMap = new HashMap<>();
        apiTestVO = serverService.serverServiceTest(apiTestVO);
        resultMap.put("data",apiTestVO);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    //test
    //test
    //1111
}
