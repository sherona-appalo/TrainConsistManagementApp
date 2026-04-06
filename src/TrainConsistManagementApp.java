import java.util.regex.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   UC11 - Validate Train ID & Cargo Code   ");
        System.out.println("=================================");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        System.out.println();
        System.out.println("Train ID: " + trainId);
        System.out.println("Is Train ID Valid? : " + trainMatcher.matches());

        System.out.println();
        System.out.println("Cargo Code: " + cargoCode);
        System.out.println("Is Cargo Code Valid? : " + cargoMatcher.matches());

        System.out.println();
        System.out.println("UC11 validation completed...");
    }
}