package LW_01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter outer circle radius : ");
        double outerCircleRadius = sc.nextDouble();

        System.out.print("Enter inner circle radius : ");
        double innerCircleRadius = sc.nextDouble();

        Circle outerCircle = new Circle(outerCircleRadius);
        Circle innerCircle = new Circle(innerCircleRadius);

        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();
        double shadedArea = outerCircleArea - innerCircleArea;

        double outerCircleCircumference = outerCircle.computeCircumference();
        double innerCircleCircumference = innerCircle.computeCircumference();

        System.out.println("Shaded area : " + shadedArea);
        System.out.println("Outer Circle Circumference : " + outerCircleCircumference);
        System.out.println("Inner Circle Circumference : " + innerCircleCircumference );

    }
}
