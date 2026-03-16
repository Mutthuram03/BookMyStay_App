/**
 * ============================================================
 * MAIN CLASS - UseCase3InventorySetup
 * ============================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Demonstrates how room availability is managed
 * using a centralized inventory.
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Hotel Room Inventory Status\n");

        RoomInventory inventory = new RoomInventory();

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleAvailable = inventory.getRoomAvailability().get("Single");
        int doubleAvailable = inventory.getRoomAvailability().get("Double");
        int suiteAvailable = inventory.getRoomAvailability().get("Suite");

        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + singleAvailable + "\n");

        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleAvailable + "\n");

        System.out.println("Suite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteAvailable);
    }
}