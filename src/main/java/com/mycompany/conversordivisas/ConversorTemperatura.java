/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordivisas;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class ConversorTemperatura {
    
    
    
    public ConversorTemperatura(){
    }
    
    public ArrayList<String> llenarArrayTemperaturas(){
        ArrayList<String> temperaturas = new ArrayList();
        temperaturas.add("Celsius");
        temperaturas.add("Fahrenheit");
        temperaturas.add("Kelvin");
        temperaturas.add("Rankine");
        
        return temperaturas;
    }
        
    public double conversor(String tempActual, String tempFinal, double temperatura){
        double tempConvertida = 0;
        
        if(tempActual.equals("Celsius")){
            switch (tempFinal){
                case "Fahrenheit": tempConvertida = celsiusToFahrenheit(temperatura); break;
                case "Kelvin": tempConvertida = celsiusToKelvin(temperatura); break;
                case "Rankine": tempConvertida = celsiusToRankine(temperatura); break;
            }
            return tempConvertida;
        }
        
        if(tempActual.equals("Kelvin")){
            switch (tempFinal){
                case "Fahrenheit": tempConvertida =  kelvinToFahrenheit(temperatura); break;
                case "Celsius": tempConvertida = kelvinToCelsius(temperatura);break;
                case "Rankine": tempConvertida = kelvinToRankine(temperatura);break;
            }
            return tempConvertida;
        }
        
        if(tempActual.equals("Fahrenheit")){
            switch (tempFinal){
                case "Celsius": tempConvertida = fahrenheitToCelsius(temperatura);break;
                case "Kelvin": tempConvertida = fahrenheitToKelvin(temperatura);break;
                case "Rankine": tempConvertida = fahrenheitToRankine(temperatura);break;
            }
            return tempConvertida;
        }
        
        if(tempActual.equals("Rankine")){
            switch (tempFinal){
                case "Fahrenheit": tempConvertida = rankineTofahrenheit(temperatura);break;
                case "Kelvin": tempConvertida = rankineToKelvin(temperatura);break;
                case "Celsius": tempConvertida =rankineToCelsius(temperatura) ;break;
            }
            return tempConvertida;
        }
        return tempConvertida;
    }
    
    public double celsiusToFahrenheit(double temperatura){
        double tempFinal = 0;
        tempFinal = temperatura*9/5 + 32;
        return tempFinal;
    }
    
    public double fahrenheitToCelsius(double temperatura){
        double tempFinal = 0;
        tempFinal = (temperatura-32)*5/9;
        return tempFinal;
    }
    
    public double celsiusToKelvin(double temperatura){
        double tempFinal = 0;
        tempFinal = temperatura + 273.15 ;
        return tempFinal;
    }
    
    public double kelvinToCelsius(double temperatura){
        double tempFinal = 0;
        tempFinal = temperatura - 273.15 ;
        return tempFinal;
    }
    
    public double celsiusToRankine(double temperatura){
        double tempFinal = 0;
        tempFinal = temperatura*9/5 + 491.67  ;
        return tempFinal;
    }
    
    public double rankineToCelsius(double temperatura){
        double tempFinal = 0;
        tempFinal = (temperatura - 491.67)*5/9 ;
        return tempFinal;
    }
    
    public double fahrenheitToKelvin(double temperatura){
        double tempFinal = 0;
        tempFinal = (temperatura-32)*5/9 + 273.15;
        return tempFinal;
    }
     
    public double kelvinToFahrenheit(double temperatura){
        double tempFinal = 0;
        tempFinal = (temperatura - 273.15)*9/5 + 32;
        return tempFinal;
    } 
    
    public double fahrenheitToRankine(double temperatura){
        double tempFinal = 0;
        tempFinal = temperatura + 459.67;
        return tempFinal;
    }
    
    public double rankineTofahrenheit(double temperatura){
        double tempFinal = 0;
        tempFinal = temperatura - 459.67;
        return tempFinal;
    }
    
    public double kelvinToRankine(double temperatura){
        double tempFinal = 0;
        tempFinal = temperatura*9/5 ;
        return tempFinal;
    }
    
    public double rankineToKelvin(double temperatura){
        double tempFinal = 0;
        tempFinal = temperatura*5/9;
        return tempFinal;
    }
}
