package section2;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle\n 2. Square\n 3. Circle\n 4. Hexagon  ");
        System.out.println("Area Calculator --- Choose your shape ");
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            System.out.println("Enter length and breadth: ");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            Rectangle r = new Rectangle(length, breadth, "Rectangle");
            System.out.printf("Area of rectangle is:%.2f", r.calculateArea());
            break;
        case 2:
            System.out.println("Enter side");
            int side = sc.nextInt();
            Square s = new Square(side, "Square");
            System.out.printf("Area of rectangle is:%.2f", s.calculateArea());
            break;
        case 3:
            System.out.println("Enter radius");
            int radius = sc.nextInt();
            Circle c = new Circle(radius, "Circle");
            System.out.printf("Area of rectangle is:%.2f", c.calculateArea());
            break;
        case 4:
            System.out.println("Enter radius");
            int side1 = sc.nextInt();
            Hexagon h = new Hexagon(side1);
            System.out.printf("Area of rectangle is:%.2f", h.calculateArea());
            break;
        default:
            System.out.println("Choose an appropriate number");

        }
        sc.close();
    }

}
