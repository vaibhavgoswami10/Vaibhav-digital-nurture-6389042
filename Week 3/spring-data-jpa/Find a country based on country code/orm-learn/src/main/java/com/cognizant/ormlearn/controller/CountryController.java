package com.cognizant.ormlearn.controller;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {
        try {
            Country country = countryService.findCountryByCode(code);
            return ResponseEntity.ok(country);
        } catch (CountryNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
