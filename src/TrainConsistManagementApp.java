public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   UC18 - Linear Search Bogie ID   ");
        System.out.println("=================================");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        System.out.println();
        System.out.print("Bogie IDs: ");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Searching for: " + searchKey);
        System.out.println("Bogie Found? : " + found);

        System.out.println();
        System.out.println("UC18 search completed...");
    }
}