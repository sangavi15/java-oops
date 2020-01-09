package section2;

public class Delivery {
    void displayDeliveryDetails(String bowler, String batsman) {
        System.out.println("1.Player details of the delivery ");
        System.out.println("Bowler : " + bowler);
        System.out.println("Batsman : " + batsman);
    }

    void displayDeliveryDetails(Long runs) {
        if (runs == 4) {
            System.out.println("Number of runs scored in the delivery  :4");
            System.out.println("It is a boundary.");
        } else if (runs == 6) {
            System.out.println("Number of runs scored in the delivery :6");
            System.out.println("It is a Sixer.");
        } else {
            System.out.println("Number of runs scored in the delivery :" + runs);
        }
    }
}
