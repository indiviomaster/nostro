package ru.indivio.nostro.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //отвечает за обработку REST HTTP заменяет @Controller и @ResponseBody
public class HealthController {
    @RequestMapping(value = "/isAlive", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE) //.TEXT_PLAIN_VALUE
    public String isAlive(){
        return "Nostro: I`m alive.";
    }
}
