public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Room Objects
        Room singleRoom = new Room("Single", 1, 250, 1500);
        Room doubleRoom = new Room("Double", 2, 400, 2500);
        Room suiteRoom = new Room("Suite", 3, 750, 5000);

        // Service
        RoomSearchService service = new RoomSearchService();

        // Search (READ-ONLY OPERATION)
        service.searchAvailableRooms(inventory, singleRoom, doubleRoom, suiteRoom);
    }
}