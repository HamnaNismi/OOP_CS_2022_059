package LW_04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i=1 ; i < 11 ; i++){
            System.out.println(n + " * "+ i + " = " + n*i);
        }

    }


}
