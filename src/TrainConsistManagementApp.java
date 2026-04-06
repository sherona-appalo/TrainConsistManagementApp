import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   UC17 - Sort Bogie Names   ");
        System.out.println("=================================");

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println();
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        Arrays.sort(bogieNames);

        System.out.println();
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println();
        System.out.println("UC17 sorting completed...");
    }
}