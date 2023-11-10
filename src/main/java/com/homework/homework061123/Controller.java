package com.homework.homework061123;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;
    public Controller(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String sayWelcome(){
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String sumUp(Integer num1, Integer num2){
        if(num1 == null || num2 == null) {
            return "ОШИБКА: Параметр отсутствует";
        }
        return num1 + " + " + num2 + " = " + calculatorService.getSum(num1, num2);
    }
    @GetMapping("/minus")
    public String subtract(Integer num1, Integer num2){
        if(num1 == null || num2 == null) {
            return "ОШИБКА: Параметр отсутствует";
        }
        return num1 + " - " + num2 + " = " + calculatorService.getDifference(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(Integer num1, Integer num2){
        if(num1 == null || num2 == null) {
            return "ОШИБКА: Параметр отсутствует";
        }
        return num1 + " * " + num2 + " = " + calculatorService.getMultiplication(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(Double num1, Double num2){
        if(num1 == null || num2 == null) {
            return "ОШИБКА: Параметр отсутствует";
        }
        if(num2 == 0){
            return "ОШИБКА: Деление на ноль";
        }
        return num1 + " / " + num2 + " = " + calculatorService.getQuotient(num1, num2);
    }
}
