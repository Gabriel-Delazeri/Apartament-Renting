package entities;

public class Room {

    private int number;

    private People people;

    public Room(int number) {
        this.setNumber(number);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public People getPeople() {
        return this.people;
    }
}
