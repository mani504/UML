import java.util.ArrayList;
import java.util.List;

class House{
    List<Room> rooms;

    public House(){
        rooms = new ArrayList<>();
        rooms.add(new Room("Bed room"));
        rooms.add(new Room("Living room"));
    }

    public void showRooms(){
        for(Room room : rooms){
            System.out.println(room.getName());
        }
    }

}

class Room{
    private String name;

    public Room(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class Composition {
    public static void main(String[] args) {
        House house = new House();
        house.showRooms();
    }
}
