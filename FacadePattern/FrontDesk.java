public class FrontDesk {
    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.housekeeping = new HouseKeeping();
        this.cart = new Cart();
    }
    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestCleaning(String roomNumber) {
        housekeeping.cleanRoom(roomNumber);
    }
    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}