package com.fabiofrau.RestTemplateDemo.services;

import com.fabiofrau.RestTemplateDemo.DTO.DrinksDTO;
import com.fabiofrau.RestTemplateDemo.DTO.IngredientsAndMeasures;
import com.fabiofrau.RestTemplateDemo.DTO.OptimizedDrinkDTO;
import com.fabiofrau.RestTemplateDemo.DTO.SingleDrinkDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CocktailService {

    public static OptimizedDrinkDTO mapDrink(SingleDrinkDTO singleDrink) {
        if(singleDrink == null) return null;
        OptimizedDrinkDTO optimized = new OptimizedDrinkDTO();
        optimized.setIdDrink(singleDrink.getIdDrink());
        optimized.setStrDrink(singleDrink.getStrDrink());
        optimized.setStrDrinkAlternate(singleDrink.getStrDrinkAlternate());
        optimized.setStrTags(singleDrink.getStrTags());
        optimized.setStrVideo(singleDrink.getStrVideo());
        optimized.setStrCategory(singleDrink.getStrCategory());
        optimized.setStrIBA(singleDrink.getStrIBA());
        optimized.setStrAlcooholic(singleDrink.getStrAlcooholic());
        optimized.setStrGlass(singleDrink.getStrGlass());
        //optimized.setInstructions(singleDrink.getStrInstructions());
        optimized.setStrDrinkThumb(singleDrink.getStrDrinkThumb());
        optimized.setStrImageSource(singleDrink.getStrImageSource());
        optimized.setStrImageAttribution(singleDrink.getStrImageAttribution());
        optimized.setStrCreativeCommonsConfirmed(singleDrink.getStrCreativeCommonsConfirmed());
        optimized.setDateModified(singleDrink.getDateModified());

        Map<String, String> instructions = new HashMap<>();

        if(singleDrink.getStrInstructions() != null) {
            instructions.put("EN", singleDrink.getStrInstructions());
        }
        if(singleDrink.getStrInstructionsDE() != null) {
            instructions.put("DE", singleDrink.getStrInstructionsDE());
        }
        if(singleDrink.getStrInstructionsES() != null) {
            instructions.put("ES", singleDrink.getStrInstructionsES());
        }
        if(singleDrink.getStrInstructionsFR() != null) {
            instructions.put("FR", singleDrink.getStrInstructionsFR());
        }
        if(singleDrink.getStrInstructionsIT() != null) {
            instructions.put("IT", singleDrink.getStrInstructionsIT());
        }
        if(singleDrink.getStrInstructionsZH() != null) {
            instructions.put("ZH", singleDrink.getStrInstructionsZH());
        }

        optimized.setInstructions(instructions);


        List<IngredientsAndMeasures> ingredientsAndMeasures = new ArrayList<>();

        if(singleDrink.getStrIngredient1() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient1(), singleDrink.getStrMeasure1()));
        }

        if(singleDrink.getStrIngredient2() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient2(), singleDrink.getStrMeasure2()));
        }

        if(singleDrink.getStrIngredient3() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient3(), singleDrink.getStrMeasure3()));
        }

        if(singleDrink.getStrIngredient4() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient4(), singleDrink.getStrMeasure4()));
        }

        if(singleDrink.getStrIngredient5() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient5(), singleDrink.getStrMeasure5()));
        }

        if(singleDrink.getStrIngredient6() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient6(), singleDrink.getStrMeasure6()));
        }

        if(singleDrink.getStrIngredient7() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient7(), singleDrink.getStrMeasure7()));
        }

        if(singleDrink.getStrIngredient8() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient8(), singleDrink.getStrMeasure8()));
        }

        if(singleDrink.getStrIngredient9() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient9(), singleDrink.getStrMeasure9()));
        }

        if(singleDrink.getStrIngredient10() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient10(), singleDrink.getStrMeasure10()));
        }

        if(singleDrink.getStrIngredient11() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient11(), singleDrink.getStrMeasure11()));
        }

        if(singleDrink.getStrIngredient12() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient12(), singleDrink.getStrMeasure12()));
        }

        if(singleDrink.getStrIngredient13() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient13(), singleDrink.getStrMeasure13()));
        }

        if(singleDrink.getStrIngredient14() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient14(), singleDrink.getStrMeasure14()));
        }

        if(singleDrink.getStrIngredient15() != null) {
            ingredientsAndMeasures.add(new IngredientsAndMeasures(
                    singleDrink.getStrIngredient15(), singleDrink.getStrMeasure15()));
        }



        optimized.setIngredients(ingredientsAndMeasures);


        return optimized;
    }

    public List<OptimizedDrinkDTO> getCocktail() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<DrinksDTO> response = template.getForEntity
                ("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita",
                        DrinksDTO.class);

        List<SingleDrinkDTO> dto = response.getBody().getDrinks();
        List<OptimizedDrinkDTO> output = new ArrayList<>(dto.size());

        for (int i = 0; i < dto.size(); i++) {
            output.add(mapDrink(dto.get(i)));
        }

        return output;

    }

    public List<OptimizedDrinkDTO> getAlcholicCocktails() {

        RestTemplate template = new RestTemplate();
        ResponseEntity<DrinksDTO> response = template.getForEntity
                ("https://www.thecocktaildb.com/api/json/v1/1/filter.php?a=Alcoholic",
                        DrinksDTO.class);

        List<SingleDrinkDTO> dto = response.getBody().getDrinks();
        List<OptimizedDrinkDTO> output = new ArrayList<>(dto.size());

        for (int i = 0; i < dto.size(); i++) {
            output.add(mapDrink(dto.get(i)));
        }

        return output;
    }

    public List<OptimizedDrinkDTO> getNotAlcholicCocktails() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<DrinksDTO> response = template.getForEntity
                ("https://www.thecocktaildb.com/api/json/v1/1/filter.php?a=Non_Alcoholic",
                        DrinksDTO.class);

        List<SingleDrinkDTO> dto = response.getBody().getDrinks();
        List<OptimizedDrinkDTO> output = new ArrayList<>(dto.size());

        for (int i = 0; i < dto.size(); i++) {
            output.add(mapDrink(dto.get(i)));
        }

        return output;
    }
}
