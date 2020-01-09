package section2;

import java.util.Scanner;

public class DeliveryMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu ");
        System.out.println("1.Player details of the delivery ");
        System.out.println("2.Run details of the delivery ");
        int ch = sc.nextInt();
        sc.nextLine();
        Delivery d = new Delivery();
        switch (ch) {
        case 1:
            System.out.println("Enter the bowler name ");
            String[] bowler = sc.nextLine().split(" ");
            int a = bowler.length;
            System.out.println("Enter the batsman name ");
            String[] batsman = sc.nextLine().split(" ");
            int b = batsman.length;
            d.displayDeliveryDetails(bowler[a - 1], batsman[b - 1]);
            break;
        case 2:
            System.out.println("Enter the number of runs ");
            long runs = sc.nextLong();
            d.displayDeliveryDetails(runs);
            break;
        default:
            System.out.println("Choose an appropriate number");
        }
        sc.close();

    }
}
