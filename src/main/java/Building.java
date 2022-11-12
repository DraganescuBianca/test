package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Building {

    List<Floor> floors = new ArrayList<>();
    List<Room> rooms1 = new ArrayList<>();
    List<Room> rooms2 = new ArrayList<>();
    List<Room> rooms3 = new ArrayList<>();
    Floor floor1 = new Floor(rooms1, 1);
    Floor floor2 = new Floor(rooms2, 2);

    Floor floor3 = new Floor(rooms3, 3);

    HashMap<String, Integer> furniture = new HashMap<String, Integer>();
    Room room1 = new Room(TypeOfRoom.Office,furniture);
    Room room2 = new Room(TypeOfRoom.Toilet, furniture);
    Room room3 = new Room(TypeOfRoom.Toilet, furniture);
    Room room4 = new Room(TypeOfRoom.Kitchen, furniture);
    Room room5 = new Room(TypeOfRoom.ConferenceRoom, furniture);
    Room room6 = new Room(TypeOfRoom.ConferenceRoom, furniture);
    Room room7 = new Room(TypeOfRoom.ConferenceRoom, furniture);

    Room room20 = new Room(TypeOfRoom.Office,furniture);
    Room room21 = new Room(TypeOfRoom.Office,furniture);
    Room room22 = new Room(TypeOfRoom.Toilet, furniture);
    Room room23= new Room(TypeOfRoom.Toilet, furniture);
    Room room24 = new Room(TypeOfRoom.Kitchen, furniture);
    Room room25 = new Room(TypeOfRoom.ConferenceRoom, furniture);
    Room room26 = new Room(TypeOfRoom.ConferenceRoom, furniture);
    Room room27 = new Room(TypeOfRoom.ConferenceRoom, furniture);
    Room room28 = new Room(TypeOfRoom.ConferenceRoom, furniture);

    Room room31 = new Room(TypeOfRoom.Toilet,furniture);
    Room room32 = new Room(TypeOfRoom.Toilet, furniture);
    Room room33= new Room(TypeOfRoom.LargeConferenceRoom, furniture);
    Room room34 = new Room(TypeOfRoom.ConferenceRoom, furniture);
    Room room35 = new Room(TypeOfRoom.ConferenceRoom, furniture);
    Room room36 = new Room(TypeOfRoom.ConferenceRoom, furniture);
    Room room37 = new Room(TypeOfRoom.ConferenceRoom, furniture);
    Room room38 = new Room(TypeOfRoom.ConferenceRoom, furniture);
    public Building() {
        floors.add(floor1);
        room1.furniture.put("desk", 10);
        room4.furniture.put("coffeemachine", 1);
        room4.furniture.put("waterdispenser",1);
        room4.furniture.put("frigde",1);
        room5.furniture.put("seats", 10);
        room5.furniture.put("tv",1);
        room6.furniture.put("seats", 10);
        room6.furniture.put("tv",1);
        room7.furniture.put("seats", 10);
        room7.furniture.put("tv",1);
        rooms1.add(room1);
        rooms1.add(room2);
        rooms1.add(room3);
        rooms1.add(room4);
        rooms1.add(room5);
        rooms1.add(room6);
        rooms1.add(room7);

        floors.add(floor2);
        room20.furniture.put("desk", 10);
        room21.furniture.put("desk", 10);
        room24.furniture.put("coffeemachine", 1);
        room24.furniture.put("waterdispenser",1);
        room24.furniture.put("frigde",1);
        room25.furniture.put("seats", 8);
        room25.furniture.put("tv",1);
        room26.furniture.put("seats", 8);
        room26.furniture.put("tv",1);
        room27.furniture.put("seats", 8);
        room27.furniture.put("tv",1);
        room28.furniture.put("seats", 8);
        room28.furniture.put("tv",1);
        rooms3.add(room20);
        rooms3.add(room21);
        rooms3.add(room22);
        rooms3.add(room23);
        rooms3.add(room24);
        rooms3.add(room25);
        rooms3.add(room26);
        rooms3.add(room27);
        rooms3.add(room28);


        floors.add(floor3);
        room33.furniture.put("videoProjector", 1);
        room33.furniture.put("seats", 30);
        room34.furniture.put("tv", 1);
        room34.furniture.put("seats", 20);
        room34.furniture.put("telepresence", 1);
        room35.furniture.put("tv", 1);
        room35.furniture.put("seats", 10);
        room35.furniture.put("telepresence", 1);
        room36.furniture.put("tv", 1);
        room36.furniture.put("seats", 10);
        room36.furniture.put("telepresence", 1);
        room37.furniture.put("tv", 1);
        room37.furniture.put("seats", 10);
        room37.furniture.put("telepresence", 1);
        room38.furniture.put("tv", 1);
        room38.furniture.put("seats", 10);
        room38.furniture.put("telepresence", 1);
        rooms1.add(room31);
        rooms1.add(room32);
        rooms1.add(room33);
        rooms1.add(room34);
        rooms1.add(room35);
        rooms1.add(room36);
        rooms1.add(room37);


    }

    @Override
    public String toString() {
        return "Building has " + Integer.toString(floors.size())+
                " floors " + floors +
                ", floor1=" + floor1 + Integer.toString(floor1.id) +
                ", rooms1=" + rooms1 +
                ", rooms2=" + rooms2 +
                ", rooms3=" + rooms3 +
                ", floor2=" + floor2 +
                ", floor3=" + floor3 +
                ", furniture=" + furniture +
                ", room1=" + room1 +
                ", room2=" + room2 +
                ", room3=" + room3 +
                ", room4=" + room4 +
                ", room5=" + room5 +
                ", room6=" + room6 +
                ", room7=" + room7 +
                ", room20=" + room20 +
                ", room21=" + room21 +
                ", room22=" + room22 +
                ", room23=" + room23 +
                ", room24=" + room24 +
                ", room25=" + room25 +
                ", room26=" + room26 +
                ", room27=" + room27 +
                ", room28=" + room28 +
                ", room31=" + room31 +
                ", room32=" + room32 +
                ", room33=" + room33 +
                ", room34=" + room34 +
                ", room35=" + room35 +
                ", room36=" + room36 +
                ", room37=" + room37 +
                ", room38=" + room38 +
                '}';
    }
}
