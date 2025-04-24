package game;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory;

    public Player() {
        inventory = new ArrayList<>();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room startRoom) {
        currentRoom = startRoom;
    }

    public boolean move(Direction direction) {
        Room requestedRoom = null;

        switch (direction) {
            case NORTH:
                requestedRoom = currentRoom.getNorthRoom();

                break;
            case SOUTH:
                requestedRoom = currentRoom.getSouthRoom();
                //TODO
                break;
            case EAST:
                requestedRoom = currentRoom.getEastRoom();
                //TODO
                break;
            case WEST:
                requestedRoom = currentRoom.getWestRoom();
                //TODO
                break;
        }


        // TODO if (requestedRoom != null) make currentRoom the requestedRoom;
        if(requestedRoom!=null){
           setCurrentRoom(requestedRoom);
           return true;
        } else {
            // TODO return whether move was possible
            return false;
        }
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public boolean takeItem(String itemName) {
        Item pickupFromRoom = currentRoom.removeItem(itemName);
        if (pickupFromRoom != null) {
            //TODO
            inventory.add(pickupFromRoom);
            System.out.println("you picked up the item");
            return true;
        }
        return false;
    }
}
