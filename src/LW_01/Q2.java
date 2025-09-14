package LW_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Name : ");
        String first = scanner.nextLine();

        System.out.print("Enter the Middle Name : ");
        String middle = scanner.nextLine();

        System.out.print("Enter the Last Name : ");
        String last = scanner.nextLine();

        char fMiddle = middle.charAt(0);

        System.out.println(last + ", " + first + " " + fMiddle + ".");

        scanner.close();
    }
}
