package LW_04;

import java.util.Scanner;

public class Q7 {
    public static int digitLength(int num){
        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter an integer number (Enter a negative number to stop): ");
            int input = sc.nextInt();

            if(input < 0){
                break;
            }
            else{
                int digit = digitLength(input);
                System.out.println("Number of digits = " +  digit);
            }
        }
        sc.close();
    }
}
