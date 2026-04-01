import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms = new HashMap<>();
    private Map<String, Integer> counters = new HashMap<>();

    public RoomInventory() {
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);

        counters.put("Single", 1);
        counters.put("Double", 1);
        counters.put("Suite", 1);
    }

    public synchronized String allocateRoom(String roomType) {

        if (rooms.get(roomType) > 0) {
            int id = counters.get(roomType);
            counters.put(roomType, id + 1);

            rooms.put(roomType, rooms.get(roomType) - 1);

            return roomType + "-" + id;
        }

        return null;
    }

    public void displayInventory() {
        System.out.println("\nRemaining Inventory:");
        for (String type : rooms.keySet()) {
            System.out.println(type + ": " + rooms.get(type));
        }
    }
}