package LW_03.Q2;

import LW_03.Q1.Temperature;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Temperature tem = new Temperature();
        System.out.println("Enter temperature in Fahrenheit : ");
        double f = sc.nextDouble();

        tem.setFahrenheit(f);

        System.out.println("Equivalent Celsius : "+tem.toCelsius());

        sc.close();

    }
}
