import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    private Map<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public void releaseRoom(String roomType) {
        rooms.put(roomType, rooms.get(roomType) + 1);
    }

    public int getAvailableRooms(String roomType) {
        return rooms.get(roomType);
    }
}