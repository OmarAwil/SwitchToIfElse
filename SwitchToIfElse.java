import java.util.Scanner;

public class SwitchToIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        String dayString1 = "";
        String dayString2 = "";
        String dayString3 = "";

        if (day == 1) {
            dayString1 = "Saturday";
        } else if (day == 2) {
            dayString2 = "Sunday";
        } else if (day == 3) {
            dayString3 = "Monday";
        } else if (day == 4) {
            dayString1 = "Tuesday";
        } else if (day == 5) {
            dayString2 = "Wednesday";
        } else {
            dayString3 = "Invalid day";
        }

        System.out.println("dayString1: " + dayString1);
        System.out.println("dayString2: " + dayString2);
        System.out.println("dayString3: " + dayString3);

        scanner.close();
    }
}
