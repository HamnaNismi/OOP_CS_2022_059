package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in centimeter : ");
        double cm = scanner.nextDouble();

        double in ;
        in =  cm / 2.54 ;

        int ft = (int) (in / 12) ;

        in = in % 12 ;

        System.out.println(cm +" cm = "+ ft +" feet and " + String.format("%.2f", in)  + " inches ");

        scanner.close();
    }
}
