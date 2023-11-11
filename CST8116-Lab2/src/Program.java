

import java.util.Scanner;//import scanner



public class Program {
    public static void main(String[] args) {
        // Variable declarations
        String textInput;
        int numberInput;
        Motorcycle motorcycle = new Motorcycle();
        String report;

        Scanner scanner = new Scanner(System.in);

        // Prompt and input for vehicle identification number (VIN)
        System.out.print("Please enter vehicle identification number: ");
        textInput = scanner.nextLine();
        motorcycle.setVehicleIdentificationNumber(textInput);
 

        // Prompt and input for engine size (cc)
        System.out.print("Please enter engine size (cc): ");
        numberInput = scanner.nextInt();
        motorcycle.setEngineSize(numberInput);

        // Prompt and input for invoice price
        System.out.print("Please enter invoice price: ");
        double doubleInput = scanner.nextDouble();
        motorcycle.setInvoicePrice(doubleInput);

        scanner.close();

        // Generate report
        report = motorcycle.toString();

        // Output the report
        System.out.println(report);
        System.out.println("Program by Wenqi Tang");
    }
}

