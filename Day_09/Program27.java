package Day_09;
import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Account Creation Step
        System.out.println("========= ACCOUNT CREATION =========");
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        
        double balance = 0;
        // Validation loop for Initial Deposit
        while (true) {
            System.out.print("Enter Initial Deposit: ");
            if (scanner.hasNextDouble()) {
                balance = scanner.nextDouble();
                if (balance > 0) {
                    break;
                } else {
                    System.out.println("Error: Initial Deposit Amount must be > ₹0.");
                }
            } else {
                System.out.println("Error: Invalid numeric input.");
                scanner.next(); // Clear invalid input
            }
        }
        System.out.println("Account created successfully!");
        
        // 2. Main Menu Loop
        int choice = 0;
        do {
            System.out.println("\n========== STUDENT BANK SYSTEM ==========");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                scanner.next(); // Clear invalid input
                continue;
            }
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1: // Deposit Money
                    System.out.print("Enter deposit amount: ");
                    if (scanner.hasNextDouble()) {
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.printf("₹%.2f deposited successfully.%n", depositAmount);
                            System.out.printf("Current Balance: ₹%.2f%n", balance);
                        } else {
                            System.out.println("Error: Amount must be > ₹0.");
                        }
                    } else {
                        System.out.println("Error: Invalid numeric input.");
                        scanner.next();
                    }
                    break;
                    
                case 2: // Withdraw Money
                    System.out.print("Enter withdrawal amount: ");
                    if (scanner.hasNextDouble()) {
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount <= 0) {
                            System.out.println("Error: Amount must be > ₹0.");
                        } else if (withdrawAmount > balance) {
                            System.out.println("Error: Insufficient balance. Transaction denied.");
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Withdrawal successful.");
                            System.out.printf("Current Balance: ₹%.2f%n", balance);
                        }
                    } else {
                        System.out.println("Error: Invalid numeric input.");
                        scanner.next();
                    }
                    break;
                    
                case 3: // Check Balance
                    System.out.printf("Current Balance: ₹%.2f%n", balance);
                    break;
                    
                case 4: // Display Account Details
                    System.out.println("\nAccount Details:");
                    System.out.println("Student Name : " + studentName);
                    System.out.println("Student ID   : " + studentId);
                    System.out.println("Account No   : " + accountNumber);
                    System.out.printf("Balance      : ₹%.2f%n", balance);
                    break;
                    
                case 5: // Calculate Interest
                    System.out.print("Enter the number of years: ");
                    if (scanner.hasNextInt()) {
                        int years = scanner.nextInt();
                        if (years >= 0) {
                            double interestRate = 5.0; // Fixed 5% annual interest rate
                            double interest = (balance * interestRate * years) / 100.0;
                            double newBalance = balance + interest;
                            System.out.printf("Interest earned over %d years at 5%% rate: ₹%.2f%n", years, interest);
                            System.out.printf("New balance (Balance + Interest): ₹%.2f%n", newBalance);
                        } else {
                            System.out.println("Error: Years cannot be negative.");
                        }
                    } else {
                        System.out.println("Error: Invalid input for years.");
                        scanner.next();
                    }
                    break;
                    
                case 6: // Exit
                    System.out.println("\nTerminate the program and display:");
                    System.out.println("Thank you for using Student Bank System!");
                    break;
                    
                default:
                    System.out.println("Invalid menu option. Please choose a valid service (1-6).");
            }
        } while (choice != 6);
        
        scanner.close();
    }
}

