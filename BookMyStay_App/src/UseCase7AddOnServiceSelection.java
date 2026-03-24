public class UseCase7AddOnServiceSelection {
    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        String reservationId = "Single-1";

        AddOnServiceManager manager = new AddOnServiceManager();

        AddOnService s1 = new AddOnService("Breakfast", 100);
        AddOnService s2 = new AddOnService("Spa", 50);

        manager.addService(reservationId, s1);
        manager.addService(reservationId, s2);

        double totalCost = manager.calculateTotalServiceCost(reservationId);

        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}