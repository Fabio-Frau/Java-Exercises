package com.fabiofrau.RestTemplateDemo.controllers;

import com.fabiofrau.RestTemplateDemo.DTO.DrinksDTO;
import com.fabiofrau.RestTemplateDemo.DTO.OptimizedDrinkDTO;
import com.fabiofrau.RestTemplateDemo.DTO.SingleDrinkDTO;
import com.fabiofrau.RestTemplateDemo.services.CocktailService;
import org.springframework.boot.autoconfigure.graphql.ConditionalOnGraphQlSchema;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//URLs
//https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita


@RestController
@RequestMapping("/v1/cocktail")
public class CocktailController {


    private CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("/alcholic")
    public List<OptimizedDrinkDTO> getAlcholicCocktails() {
        return cocktailService.getAlcholicCocktails();
    }

    @GetMapping("/notAlcholic")
    public List<OptimizedDrinkDTO> getNotAlcholicCocktails() {
        return cocktailService.getNotAlcholicCocktails();
    }




}
