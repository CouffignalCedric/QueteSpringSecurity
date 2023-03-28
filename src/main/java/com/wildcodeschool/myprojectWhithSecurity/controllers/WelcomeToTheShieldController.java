package com.wildcodeschool.myprojectWhithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeToTheShieldController {
    @GetMapping("/")
    public String hello() {
        return "WelcomeToTheShield";
    }

    @GetMapping("/avengers/assemble")
    public String champions() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "Biarritz,Bordeaux,La Loupe,Lille,Lyon,Nantes,Orléans,Paris,Reims,Strasbourg,Toulouse,Amsterdam,Barcelone,Berlin,Lisbonne,Madrid";

    }
}
