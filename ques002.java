// wap to swap values of a and b using third variable

import java.util.*;
class ques002 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter value of a: ");
        a = sc.nextInt();
        System.out.print("Enter value of b: ");
        b = sc.nextInt();

        System.out.println("Original values of a and b are : " + a + "  and  " + b);

        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("Swapped values of a and b are : " + a + "  and  " + b);

    }
}