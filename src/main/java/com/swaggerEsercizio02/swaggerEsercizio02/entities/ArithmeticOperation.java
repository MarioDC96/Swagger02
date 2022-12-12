package com.swaggerEsercizio02.swaggerEsercizio02.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArithmeticOperation {

    private String name;
    private int minNumberOfOperands;
    private String description;
    private String[] properties;


}
