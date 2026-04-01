public class RoomAllocationService {

    public void allocate(Reservation r, RoomInventory inventory) {

        String roomId = inventory.allocateRoom(r.getRoomType());

        if (roomId != null) {
            System.out.println("Booking confirmed for Guest: " +
                    r.getGuestName() + ", Room ID: " + roomId);
        } else {
            System.out.println("No rooms available for " + r.getRoomType());
        }
    }
}