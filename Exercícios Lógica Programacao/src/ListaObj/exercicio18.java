package ListaObj;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
    System.out.println("Digite a temperatura em Celsius:  ");
    Scanner temp = new Scanner(System.in);
    double tempCelsius = temp.nextDouble();
    double tempKelvin = tempCelsius + 273.15;
    double tempFahrenheit = (tempCelsius * 1.8) + 32;
    System.out.printf("O temperatura em Celsius: %2.2f\nA temperatura em Kelvin: %2.2f\nA temperatura em Fahrenheit: %2.2f", tempCelsius,tempKelvin,tempFahrenheit);
 }
}
