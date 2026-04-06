public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   UC16 - Bubble Sort Capacities   ");
        System.out.println("=================================");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println();
        System.out.println("Before Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("After Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("UC16 sorting completed...");
    }
}