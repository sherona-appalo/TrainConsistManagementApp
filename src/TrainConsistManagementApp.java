import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   UC20 - Prevent Search on Empty Train   ");
        System.out.println("=================================");

        List<String> bogieIds = new ArrayList<>();

        String searchKey = "BG101";

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        System.out.println("Searching for: " + searchKey);
        System.out.println("Bogie Found? : " + found);

        System.out.println();
        System.out.println("UC20 execution completed...");
    }
}