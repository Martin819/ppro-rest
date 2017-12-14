package cz.uhk.ppro.rest.controllers;

import java.util.concurrent.atomic.AtomicLong;

import cz.uhk.ppro.rest.model.Greeting;
import cz.uhk.ppro.rest.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @RequestMapping("/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return greetingService.createGreeting(name);
    }
}