package com.fabiofrau.RestTemplateDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientsAndMeasures {

    private String ingredient;
    private String measure;

}
