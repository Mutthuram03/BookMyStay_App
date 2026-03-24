import java.util.Map;

class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Room Search\n");

        // Single Room
        if (availability.get("Single") > 0) {
            singleRoom.display(availability.get("Single"));
        }

        // Double Room
        if (availability.get("Double") > 0) {
            doubleRoom.display(availability.get("Double"));
        }

        // Suite Room
        if (availability.get("Suite") > 0) {
            suiteRoom.display(availability.get("Suite"));
        }
    }
}