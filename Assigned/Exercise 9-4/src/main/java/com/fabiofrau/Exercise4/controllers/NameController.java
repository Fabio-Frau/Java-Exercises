package com.fabiofrau.Exercise4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@Tag(name = "Esercizio Swagger")
@RequestMapping("/v1/names")
public class NameController {

    @Operation(summary = "Restituisce il nome come fornito")
    @GetMapping("/name/straight")
    @ApiResponses( value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND")
    })
    public String getStraightName(@RequestParam(required = true, name = "name")
                                      @Parameter(name = "nome", description = "Il nome fornito",
                                      example = "Fabio") String name) {
        return name;
    }

    @Operation(summary = "Restituisce il nome fornito al contrario")
    @PostMapping("/name/reverse")
    @ApiResponses( value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND")
    })
    public String getReverseName(@RequestParam(required = true, name = "name")
                                     @Parameter(name = "nome", description = "Il nome fornito",
                                             example = "Fabio") String name) {
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }

}
