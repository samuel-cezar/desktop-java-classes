/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
public class Principal {
    public static void main(String[] args) {
        Conversor5 conversor = new Conversor5();
        
        // Teste 1: 0°C para Fahrenheit e Kelvin
        System.out.println("0 Celsius = " + conversor.celsiusParaFahrenheit(0) + " Fahrenheit");
        System.out.println("0 Celsius = " + conversor.celsiusParaKelvin(0) + " Kelvin");
        
        // Teste 2: 100°F para Celsius e Kelvin
        System.out.println("\n100 Fahrenheit = " + conversor.fahrenheitParaCelsius(100) + " Celsius");
        System.out.println("100 Fahrenheit = " + conversor.fahrenheitParaKelvin(100) + " Kelvin");
        
        // Teste 3: 300K para Celsius e Fahrenheit
        System.out.println("\n300 Kelvin = " + conversor.kelvinParaCelsius(300) + " Celsius");
        System.out.println("300 Kelvin = " + conversor.kelvinParaFahrenheit(300) + " Fahrenheit");
    }
}
