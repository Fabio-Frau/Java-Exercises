package com.fabiofrau.RestTemplateDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilterDrinksDTO {

    private String strDrink;
    private String strDrinkThumb;
    private String idDrink;


}
