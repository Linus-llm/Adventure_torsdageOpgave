package game;

import java.util.ArrayList;

public class Room {
    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;

    private String name;
    private String description;
    private ArrayList<Item> items;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    // Convenience methods for creating and adding Item
    public void addItem(String description) {
        this.addItem(new Item(description));
    }

    // Convenience methods for creating and adding Item with custom short name
    public void addItem(String description, String name) {
        this.addItem(new Item(description, name));
    }

    public Room getNorthRoom() {
        return this.northRoom; //TODO
    }

    public void setNorthRoom(Room northRoom) {
        Room currentRoom = this;
        if (this.northRoom == northRoom) {
            return;}

        this.northRoom = northRoom;
        if(northRoom != null){
            northRoom.setSouthRoom(currentRoom);

        }
       //TODO
    }

    public Room getEastRoom() {

        return this.eastRoom; //TODO
    }

    public void setEastRoom(Room eastRoom) {
        Room currentRoom = this;
        if (this.eastRoom == eastRoom) {
            return;}
        this.eastRoom = eastRoom;
        if(eastRoom != null){
            eastRoom.setWestRoom(currentRoom);
        }
        //TODO
    }

    public Room getSouthRoom() {
        return this.southRoom; //TODO
    }

    public void setSouthRoom(Room southRoom) {
        Room currentRoom = this;
       //TODO
        if (this.southRoom == southRoom) {
            return;}
        this.southRoom = southRoom;
        if(southRoom != null){
            southRoom.setNorthRoom(currentRoom);
        }
    }

    public Room getWestRoom() {
        return null; //TODO
    }

    public void setWestRoom(Room westRoom) {
        Room currentRoom = this;
        //TODO
        if (this.westRoom == westRoom) {
            return;}
        this.westRoom = westRoom;
        if(westRoom != null){
            westRoom.setEastRoom(currentRoom);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Item removeItem(String itemName) {
        Item itemToBeRemoved = findItem(itemName);
        if (itemToBeRemoved != null) {
            return itemToBeRemoved;
            //TODO

        }
        return null;
    }

    public Item findItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
