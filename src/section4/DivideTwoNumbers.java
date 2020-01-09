package section4;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c;
        System.out.println("Enter 2 numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            if (b == 0) {
                throw new DivideByZeroException();
            } else {
                c = a / b;

                System.out.println("The quotient of" + a + "/" + b + "=" + c);
            }
        } catch (DivideByZeroException e) {
            System.out.println(e);

        } finally {
            System.out.println("Inside finally blocked");
        }
        s.close();
    }

}
