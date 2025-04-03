package com.server.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.domain.ApiTestVO;
import com.server.domain.PaymentDto;
import com.server.service.ServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
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

    @RequestMapping(value = "/paymentTest", method = RequestMethod.POST, headers="Accept=application/json", produces="application/json")
    @ResponseBody
    public ResponseEntity<?>payment(@ModelAttribute PaymentDto paymentDto) throws JsonProcessingException {
        Map<String,Object> resultMap = new HashMap<>();

        paymentDto.buildSubFields();
        ObjectMapper mapper = new ObjectMapper();

        JSONObject json = new JSONObject(paymentDto.getMustFiled());
        Iterator<String> keys = json.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = json.get(key);
            System.out.println(key + " : " + value);
            if(value.equals("")){
                System.out.println(">>>no :" + key);
                break;
            }
        }

        String paymentStr = mapper.writeValueAsString(paymentDto.getPayment());
        String merchantStr = mapper.writeValueAsString(paymentDto.getMerchant());
        String buyerStr = mapper.writeValueAsString(paymentDto.getBuyer());
        String urlStr = mapper.writeValueAsString(paymentDto.getUrl());

        String paramStr = "{\"payment\":" + paymentStr + ",\"merchant\":" + merchantStr+",\"buyer\":"+buyerStr+",\"url\":"+urlStr+"}";
        JSONObject strToObj = new JSONObject(paramStr);
        JSONObject body = new JSONObject();
            body.put("payment", new JSONObject(strToObj.getString("payment")));
            body.put("merchant", new JSONObject(strToObj.getString("merchant")));
            body.put("buyer", new JSONObject(strToObj.getString("buyer")));
            body.put("url", new JSONObject(strToObj.getString("url")));
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "Basic dGVzdF8xODQ5NzA1QzY0MkMyMTdFMEIyRDo=");

        URI url = URI.create("https://api-test.eximbay.com/v1/payments/ready");


        HttpEntity<String> entity = new HttpEntity<>(body.toString(), headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        resultMap.put("result",response.getBody());
        return new ResponseEntity<>(resultMap,HttpStatus.OK);
    }

    public static void main(String arg[]) throws JsonProcessingException {
        PaymentDto paymentDto = new PaymentDto();
        paymentDto.setName("박종학");
        paymentDto.setEmail("이메일");
        paymentDto.setTransaction_type("타입");
        paymentDto.setOrder_id("주문번호");
        paymentDto.setReturn_url("returnUrl");
        paymentDto.setStatus_url("statusUrl");

        paymentDto.buildSubFields();
        ObjectMapper mapper = new ObjectMapper();

        String paymentJson = mapper.writeValueAsString(paymentDto.getPayment());
        String buyerJson = mapper.writeValueAsString(paymentDto.getBuyer());

        String val = "\"payment\":" + paymentJson + ",\"buyer\":" + buyerJson;
        System.out.println(val);
    }

}
