import entities.Apartament;
import entities.People;
import entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Apartament apartament = new Apartament(10);

        for (Room room : apartament.rooms) {
            System.out.println(room.getNumber());
        }

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");

        int roomsRented = sc.nextInt();

        for (int i = 0; i < roomsRented; i ++) {
            System.out.println("Room number?");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("People name?");
            String peopleName = sc.nextLine();
            sc.nextLine();
            System.out.println("People email?");
            String peopleEmail = sc.nextLine();

            People people = new People(peopleName, peopleEmail);

            apartament.getRooms()[roomNumber].setPeople(people);
        }

        apartament.printBusyRooms();
    }
}