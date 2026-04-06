import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   UC10 - Count Total Seats in Train   ");
        System.out.println("=================================");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 20));

        System.out.println();
        System.out.println("Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println();
        System.out.println("Total Seating Capacity: " + totalSeats);

        System.out.println();
        System.out.println("UC10 aggregation completed...");
    }
}