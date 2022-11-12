package main.java;

import java.util.HashMap;

public class Room {

    TypeOfRoom type;

    HashMap<String, Integer> furniture = new HashMap<String, Integer>();

    public Room(TypeOfRoom type, HashMap<String, Integer> furniture) {
        this.type = TypeOfRoom.Office;
        this.furniture = furniture;
        furniture.put("desk", 20);
    }

    @Override
    public String toString() {
        return type +
                ":" + furniture.keySet().toString();
    }
}
