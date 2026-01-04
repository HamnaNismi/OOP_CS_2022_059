package LW_03.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Temperature tem = new Temperature();

        System.out.println("Enter temperature in celsius : ");
        double c = input.nextDouble();

        tem.setCelsius(c);
        System.out.println("Celsius value you enter : "+tem.toCelsius());
        System.out.println("Equivalent fahrenheit : "+tem.toFahrenheit());
        input.close();
    }
}
