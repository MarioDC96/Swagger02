package com.swaggerEsercizio02.swaggerEsercizio02.controller;


import com.swaggerEsercizio02.swaggerEsercizio02.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping

    public String welcomeMathMsg(){
        return "Welcome to math session";
    }

    @GetMapping("/divison-info")
    @ApiOperation(value="Division",notes= "Sto facendo la divisione")
    public ArithmeticOperation getDivisionInfo(){
        return new ArithmeticOperation("Division", 2,"Effettua divisione",new String[]{"Distributiva","Invariantiva"});
    }

    @GetMapping("/multiplication-info")
    public ArithmeticOperation getMultiplicationInfo(){
        return new ArithmeticOperation("Multiplication", 2,"Effettua moltiplicazione",new String[]{"Commutativa","Distributiva","Invariantiva"});
    }

    @GetMapping("/square-info/{n}")
    public ArithmeticOperation getSquareInfo(){
        return new ArithmeticOperation("Square", 1,"Effettua quadrato",new String[]{"Distributiva","Invariantiva","Commutatica"});
    }
}
