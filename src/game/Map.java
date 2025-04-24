package game;

public class Map {

    private Room startRoom;

    public void buildMap() {
        //create room
        Room room1 = new Room("Outside", "forrest outside a cave - the cave-entrance splits in two different directions.");
        room1.addItem("an old rusty flashlight");
        room1.addItem("a crinkly paper map with a big X in the middle", "map");
        Room room2 = new Room("Narrow cave", "narrow cave that seems to bend up and down almost infinitely");
        Room room3 = new Room("Large grotto", "large grotto with an opening very far above where sunlight shines through.");
        room3.addItem("a wicker bird cage");
        Room room4 = new Room("Wet cave", "large dark cave - the floor is quite wet and slippery here.");
        room4.addItem("a dead bird");
        Room room5 = new Room("Dead cave","seems to be a dead end cave");
        room5.addItem("A strange looking stick","Magic staff");
        room5.addItem("a bag","bag for holding stuff");
        Room room6 = new Room("Perculiar passage","a long and strange passage leading nowhere but further");
        room6.addItem("a perculiar looking shape","lizard");
        Room room7 = new Room("Curious corner","Maze looking turning corner where nothing is seen and everything is covered in fog");
        room7.addItem("sharp and reflecting surface of a sward","sword");
        Room room8 = new Room("Various roads", "A place where you can go almost everywhere but where to go?");
        Room room9 = new Room("Citrous corner", "a long but citrous smelling corner, quite pleasant");
        room9.addItem("citrous fruit");

        //TODO create rest of the 9 rooms in cave

        // Connect rooms
        room1.setEastRoom(room2);
        room1.setSouthRoom(room4);

        room2.setEastRoom(room3);
        room2.setWestRoom(room1);

        room3.setSouthRoom(room6);
        room3.setWestRoom(room2);

        room4.setNorthRoom(room1);
        room4.setSouthRoom(room7);

        room5.setSouthRoom(room8);

        room6.setNorthRoom(room3);
        room6.setSouthRoom(room9);

        room7.setNorthRoom(room4);
        room7.setEastRoom(room8);

        room8.setNorthRoom(room5);
        room8.setWestRoom(room7);
        room8.setEastRoom(room9);

        room9.setNorthRoom(room6);
        room9.setWestRoom(room8);
        //TODO connect all rooms according to the specified map

        //TODO Set start room to room1
        startRoom = room1;
    }

    public Room getStartRoom() {
        return startRoom;
    }
}
