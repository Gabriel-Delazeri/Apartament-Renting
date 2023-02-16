package entities;

public class Apartament {
    public Room[] rooms;

    public Apartament(int numberOfRooms) {
        this.rooms = new Room[numberOfRooms];
        this.setRooms(numberOfRooms);
    }

    public void setRooms(int numberOfRooms) {
        for (int i = 0; i < numberOfRooms ; i ++) {
            this.rooms[i] = new Room(i);
        }
    }

    public Room[] getRooms() {
        return this.rooms;
    }

    public void printBusyRooms() {
        System.out.println("Busy rooms:");

        for (Room room : this.getRooms()) {
            if (room.getPeople() != null) {
                System.out.println(room.getNumber() + " : " + room.getPeople().getName() + " , " + room.getPeople().getEmail());
            }
        }
    }
}
