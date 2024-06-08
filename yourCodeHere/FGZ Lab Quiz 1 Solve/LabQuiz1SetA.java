import java.util.Scanner;

public class LabQuiz1SetA {
    public static String analyzeTemperatures(double tempF) {
        double tempC = (tempF - 32) * 5 / 9;
        String state;

        if (tempC <= 0) {
            state = "solid";
        } else if (tempC >= 100) {
            state = "gas";
        } else {
            state = "liquid";
        }

        System.out.printf("At %.1fF (%.2fC), water is in a %s state.%n", tempF, tempC, state);
        return state;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSolid = 0, countLiquid = 0, countGas = 0;

        System.out.println("Enter the number of temperature readings: ");
        int numReadings = scanner.nextInt();

        for (int i = 0; i < numReadings; i++) {
            System.out.println("Enter temperature " + (i + 1) + " in Fahrenheit: ");
            double tempF = scanner.nextDouble();
            String state = analyzeTemperatures(tempF);
            if (state.equals("solid")) {
                countSolid++;
            } else if (state.equals("liquid")) {
                countLiquid++;
            } else {
                countGas++;
            }
        }

        System.out.println("\nTotal solid state readings: " + countSolid);
        System.out.println("Total liquid state readings: " + countLiquid);
        System.out.println("Total gas state readings: " + countGas);

        scanner.close();
    }
}
