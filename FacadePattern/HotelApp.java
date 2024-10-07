public class HotelApp {
    public static void main(String[] args) {
    FrontDesk frontDesk = new FrontDesk();

    System.out.println("Welcome to The Stanley Hotel! \n");

    frontDesk.pickUpVehicle("AWSOM-50");
    System.out.println("");
    frontDesk.requestCleaning("237");
    System.out.println("");
    frontDesk.requestCart(7);
    System.out.println("");

    }
 }
