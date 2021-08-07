package com.example.dataparsing.controller;


import com.example.dataparsing.repository.DataRepository;
import lombok.AllArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/data")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class DataController {

    private final DataRepository dataRepository;

    @GetMapping("/carbon_intensity")
    public String getCarbon() {
        System.out.println(dataRepository.getCarbonIntensity().length());
        return dataRepository.getCarbonIntensity().toString();
    }

    @GetMapping("/exlexon")
    public String getExexon() {
        return dataRepository.getElexon().toString();
    }

    @GetMapping("/solar")
    public String getSolar() {
        return dataRepository.getSolar().toString();
    }

    @GetMapping("/temp")
    public String getWeather() {
        return dataRepository.getTempDB().toString();
    }
    @GetMapping("/wind_off")
    public String getWindOff() {
        return dataRepository.getWindOff().toString();
    }

    @GetMapping("/wind_on")
    public String getWindOn() {return dataRepository.getWindOn().toString();}

    @GetMapping("/ai_1")
    public String getAiFirstVersion() {return dataRepository.getAiFirstVersion().toString();}
    @GetMapping("/ai_2")
    public String getAiSecondVersion() {return dataRepository.getAiSecondVersion().toString();}




}
