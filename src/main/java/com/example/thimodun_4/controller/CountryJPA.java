package com.example.thimodun_4.controller;

import com.example.thimodun_4.model.City;
import com.example.thimodun_4.model.Country;
import com.example.thimodun_4.repository.ICountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CountryJPA {

    @Autowired
    ICountry iCountry;

    @GetMapping("/showCountry")
    public ResponseEntity<List<Country>> show() {
        List<Country> countries = (List<Country>) iCountry.findAll();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }
}
