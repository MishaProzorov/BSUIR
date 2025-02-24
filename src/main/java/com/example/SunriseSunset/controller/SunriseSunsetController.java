package com.example.SunriseSunset.controller;

import com.example.SunriseSunset.module.SunriseSunsetModule;
import org.springframework.stereotype.Controller;
import com.example.SunriseSunset.service.SunriseSunsetService;
import org.springframework.ui.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SunriseSunsetController {

    private final SunriseSunsetService sunService;

    public SunriseSunsetController(SunriseSunsetService sunService) {
        this.sunService = sunService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Главная страница");
        return "Home"; // Если используете шаблоны
    }

    @GetMapping("/sun/times")
    public ResponseEntity<SunriseSunsetModule> getSunriseSunset(
            @RequestParam double lat,
            @RequestParam double lng,
            @RequestParam String date) {

        SunriseSunsetModule sunResponse = sunService.getSunriseSunset(lat, lng, date);
        return ResponseEntity.ok(sunResponse);
    }
}
