package com.server.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

@Data
public class PaymentDto {
    private String transaction_type;
    private String order_id;
    private String currency;
    private String amount;
    private String lang;

    private String mid;

    private String name;
    private String email;

    private String return_url;
    private String status_url;
    private String test;

    private String payment;
    private String merchant;
    private String buyer;
    private String url;
    private String mustFiled;


    public void buildSubFields() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Payment payment = new Payment();
        payment.setTransaction_type(this.transaction_type);
        payment.setOrder_id(this.order_id);
        payment.setCurrency(this.currency);
        payment.setAmount(this.amount);
        payment.setLang(this.lang);
        payment.setTest("");
        this.payment = mapper.writeValueAsString(payment);

        Merchant merchant = new Merchant();
        merchant.setMid(this.mid);
        this.merchant = mapper.writeValueAsString(merchant);

        Buyer buyer = new Buyer();
        buyer.setName(this.name);
        buyer.setEmail(this.email);
        this.buyer = mapper.writeValueAsString(buyer);

        Url url = new Url();
        url.setReturn_url(this.return_url);
        url.setStatus_url(this.status_url);
        this.url = mapper.writeValueAsString(url);

        MustFiled mustFiled = new MustFiled();
        mustFiled.setReturn_url(this.return_url);
        this.mustFiled = mapper.writeValueAsString(mustFiled);
    }

    @Data
    public static class Payment {
        private String transaction_type;
        private String order_id;
        private String currency;
        private String amount;
        private String lang;
        private String test;
    }

    @Data
    public static class Merchant{
        private String mid;
    }

    @Data
    public static class Buyer {
        private String name;
        private String email;
    }

    @Data
    public static class Url{
        private String return_url;
        private String status_url;
    }

    @Data
    public static class MustFiled{
        private String return_url;
    }


}