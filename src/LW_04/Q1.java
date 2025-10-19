package LW_04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter the first value(a) : ");
        a = sc.nextInt();
        System.out.println("Enter the first value(b) : ");
        b = sc.nextInt();
        System.out.println("Enter the first value(c) : ");
        c = sc.nextInt();

        if(a>b){
            if(b>c){
                System.out.println("The smallest value is " + c);
            } else {
                System.out.println("The smallest value is " + b);
            }
        } else if (a>c){
            System.out.println("The smallest value is " + c);
        }else {
            System.out.println("The smallest value is " + a);
        }

    }
}
