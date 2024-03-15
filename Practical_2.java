/*
Aim: Practical No.2
Author: Ishant Morghade
Version: 2.5
Date: 06 Feb,2024
*/
import java.util.Scanner;
public class Practical_2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        double radius = scanner.nextDouble();
        System.out.println("");
        if (radius <= 0)
        {
            System.out.println("Please enter a non-zero positive number for the radius.");
        } else {
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);

            System.out.println("Perimeter of the circle: " + perimeter);

            System.out.println("");
            System.out.println("Area of the circle: " + area);
        }
        scanner.close();
    }
}