package main.java;

import java.util.List;

public class Floor {
    List<Room> rooms;

    int id;
    public Floor(List<Room> rooms, int id) {
        this.rooms = rooms;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "rooms=" + rooms +
                '}';
    }
}
