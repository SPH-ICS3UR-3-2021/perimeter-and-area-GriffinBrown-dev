/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        boolean looping = true;
        double rectLength;
        double rectWidth;
        double circleRadius;
        while (looping) {
            System.out.println("**********");
            System.out.println("Please select one of the following:");
            System.out.println("Enter (1) to find the perimeter of a rectangle.");
            System.out.println("Enter (2) to find the area of a rectangle.");
            System.out.println("Enter (3) to find the perimeter of a circle.");
            System.out.println("Enter (4) to find the area of a circle.");
            System.out.println("Enter (5) to terminate the program.");
            switch (in.nextInt()) {
                case (1):
                    System.out.println("Please enter the length of the rectangle in meters.");
                    rectLength = in.nextDouble();
                    System.out.println("Please enter the width of the rectangle in meters.");
                    rectWidth = in.nextDouble();
                    System.out.println("The perimeter of the rectangle is " + (2 * rectLength + 2 * rectWidth) + " meters.");
                    break;    
                case (2):
                    System.out.println("Please enter the length of the rectangle in meters.");
                    rectLength = in.nextDouble();
                    System.out.println("Please enter the width of the rectangle in meters.");
                    rectWidth = in.nextDouble();
                    System.out.println("The area of the rectangle is " + (rectLength*rectWidth) + " meters.");
                    break;    
                case (3):
                    System.out.println("Please enter the radius of the circle in meters.");
                    circleRadius = in.nextDouble();
                    System.out.println("The perimeter of the circle is " + (2 * Math.PI * circleRadius) + " meters.");   
                    break;
                case (4):
                    System.out.println("Please enter the radius of the circle in meters.");
                    circleRadius = in.nextDouble();
                    System.out.println("The area of the circle is " + (Math.PI * circleRadius * circleRadius) + " meters.");   
                    break;
                case (5):
                    System.out.println("Thank you for using this program.");
                    looping = false;
                    break;
                default:
                    System.out.println("Error - please enter a valid number.");
            } 
        }
    }
    
}
