package com.fabiofrau.RestTemplateDemo.DTO;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class OptimizedDrinkDTO {

    private long idDrink;
    private String strDrink;
    private String strDrinkAlternate;
    private String strTags;
    private String strVideo;
    private String strCategory;
    private String strIBA;
    private String strAlcooholic;
    private String strGlass;
    private String strDrinkThumb;
    private Map<String, String> instructions;
    private List<IngredientsAndMeasures> ingredients;
    private String strImageSource;
    private String strImageAttribution;
    private String strCreativeCommonsConfirmed;
    private String dateModified;

}
