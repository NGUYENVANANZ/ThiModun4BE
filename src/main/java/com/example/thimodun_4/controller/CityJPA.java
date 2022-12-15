package com.example.thimodun_4.controller;

import com.example.thimodun_4.model.City;
import com.example.thimodun_4.model.Country;
import com.example.thimodun_4.repository.ICity;
import com.example.thimodun_4.repository.ICountry;
import com.example.thimodun_4.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CityJPA {
    @Autowired
    ICity iCity;

    @Autowired
    ICountry iCountry;

    @Autowired
    CityService cityService;

    @GetMapping("/show")
    public ResponseEntity<List<City>> show() {
        List<City> cities = (List<City>) iCity.findAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @GetMapping("/deatil/{id}")
    public ResponseEntity<City> deatil(@PathVariable long id) {
        City cities = iCity.findById(id).get();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @PostMapping("/creat")
    public ResponseEntity creat(@RequestBody City city) {
        iCity.save(city);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<City> edit(@PathVariable long id) {
        City cities = iCity.findById(id).get();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<City> edit(@RequestBody City city) {
        iCity.save(city);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable long id) {
        iCity.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
