/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
public class Conversor5 {
    
    // Celsius para Fahrenheit
    public double celsiusParaFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32.0;
    }
    
    // Celsius para Kelvin
    public double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    // Fahrenheit para Celsius
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32.0);
    }
    
    // Fahrenheit para Kelvin
    public double fahrenheitParaKelvin(double fahrenheit) {
        double celsius = fahrenheitParaCelsius(fahrenheit);
        return celsiusParaKelvin(celsius);
    }
    
    // Kelvin para Celsius
    public double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    // Kelvin para Fahrenheit
    public double kelvinParaFahrenheit(double kelvin) {
        double celsius = kelvinParaCelsius(kelvin);
        return celsiusParaFahrenheit(celsius);
    }
}
