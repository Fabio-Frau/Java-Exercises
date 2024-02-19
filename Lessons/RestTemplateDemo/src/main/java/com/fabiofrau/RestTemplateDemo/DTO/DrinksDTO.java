package com.fabiofrau.RestTemplateDemo.DTO;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DrinksDTO {

    List<SingleDrinkDTO> drinks;

}
