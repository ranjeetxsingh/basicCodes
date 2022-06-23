// WAP to calculate the hypotenuse of a Right-Angled triangle 

// importing util and lang packages 
import java.util.*;
import java.lang.*;

class ques001{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);   // creating scanner class object 

        System.out.print("Enter the First Side of Triangle:  ");
        int firstSide = sc.nextInt();

        System.out.print("Enter the Second Side of Triangle:  ");
        int secondSide = sc.nextInt();  
        
        double hypotenuse;

        // calculating hypotenuse of triangle
        hypotenuse = Math.sqrt(firstSide * firstSide + secondSide * secondSide);

        // printing the result
        System.out.println("Hypotenuse of the Triangle is :  " + hypotenuse);

    }
}