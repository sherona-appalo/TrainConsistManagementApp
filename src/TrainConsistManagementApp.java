import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   UC19 - Binary Search Bogie ID   ");
        System.out.println("=================================");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = searchKey.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println();
        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));
        System.out.println("Searching for: " + searchKey);
        System.out.println("Bogie Found? : " + found);

        System.out.println();
        System.out.println("UC19 search completed...");
    }
}