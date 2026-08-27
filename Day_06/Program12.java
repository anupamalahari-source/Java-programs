package Day_06;
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Vehicle Speed (km/h): ");
        int speed = sc.nextInt();

        System.out.print("Enter Speed Limit (km/h): ");
        int speedLimit = sc.nextInt();

        System.out.print("Enter Driver Age: ");
        int age = sc.nextInt();

        System.out.print("Helmet worn? (true/false): ");
        boolean helmet = sc.nextBoolean();

        System.out.print("Seat Belt worn? (true/false): ");
        boolean seatBelt = sc.nextBoolean();

        System.out.print("Valid License? (true/false): ");
        boolean license = sc.nextBoolean();

        System.out.print("Emergency Vehicle? (true/false): ");
        boolean emergency = sc.nextBoolean();

        // Variables
        int excessSpeed = 0;
        int fine = 0;
        int violationFlags = 0;

        // Integer flags
        // 1 = Overspeed
        // 2 = Helmet violation
        // 4 = Seat-belt violation
        // 8 = License violation

        // Check overspeed
        if (speed > speedLimit && !emergency) {
            excessSpeed = speed - speedLimit;
            fine += 1000;
            violationFlags |= 1;
        }

        // Check helmet
        if (!helmet && !emergency) {
            fine += 1000;
            violationFlags |= 2;
        }

        // Check seat belt
        if (!seatBelt && !emergency) {
            fine += 1500;
            violationFlags |= 4;
        }

        // Check license
        if (!license) {
            fine += 2000;
            violationFlags |= 8;
        }

        // Speed status
        String speedStatus;

        if (speed > speedLimit && !emergency) {
            speedStatus = "OVER SPEED";
        } else {
            speedStatus = "NORMAL";
        }

        // Helmet status
        String helmetStatus = helmet ? "VALID" : "VIOLATION";

        // Seat belt status
        String seatBeltStatus = seatBelt ? "VALID" : "VIOLATION";

        // License status
        String licenseStatus = license ? "VALID" : "INVALID";

        // Risk level
        String riskLevel;

        if (violationFlags >= 5 || !license) {
            riskLevel = "HIGH";
        } else if (violationFlags > 0) {
            riskLevel = "MEDIUM";
        } else {
            riskLevel = "LOW";
        }

        // Emergency vehicle adjustment
        if (emergency) {
            fine = 0;
            violationFlags = 0;
            excessSpeed = 0;
            speedStatus = "EXEMPT";
            riskLevel = "LOW";
        }

        // Final report
        System.out.println();
        System.out.println("====================================");
        System.out.println("        SMART TRAFFIC ANALYZER");
        System.out.println("====================================");

        System.out.println();
        System.out.println("Vehicle Number  : " + vehicleNumber);
        System.out.println("Speed           : " + speed + " km/h");
        System.out.println("Speed Limit     : " + speedLimit + " km/h");
        System.out.println("Excess Speed    : " + excessSpeed + " km/h");

        System.out.println();
        System.out.println("Speed Status    : " + speedStatus);
        System.out.println("Helmet Status   : " + helmetStatus);
        System.out.println("Seat Belt Status: " + seatBeltStatus);
        System.out.println("License Status  : " + licenseStatus);

        System.out.println();
        System.out.println("Total Fine      : ₹" + fine);

        System.out.println();
        System.out.println("Risk Level      : " + riskLevel);

        System.out.println();
        System.out.println("Violation Flags : " + violationFlags);

        System.out.println();
        System.out.println("====================================");

        sc.close();
    }
}

