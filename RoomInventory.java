public class RoomInventory {
    
}
import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * CLASS - RoomInventory
 * ============================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class acts as the single source of truth
 * for room availability in the hotel.
 *
 * Room pricing and characteristics are obtained
 * from Room objects, not duplicated here.
 *
 * @version 3.0
 */

public class RoomInventory {

    // Stores available room count for each room type
    // Key -> Room type
    // Value -> Available rooms
    private HashMap<String, Integer> roomAvailability;

    // Constructor initializes inventory
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    // Initialize inventory data
    private void initializeInventory() {
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    // Returns availability map
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    // Update room availability
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}