package LW_04;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter the number of rows you want for the pyramid: ");
        int rows = SC.nextInt();

        for(int i = 1; i <= rows ; i++){
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for(int r = 1; r <= (2*i-1); r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
