import java.util.Scanner;

public class customerdetails extends roomdetails  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of customers");
        int NumOfCustomers = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        for (int i = 0; i < NumOfCustomers; i++) {
            System.out.println("Enter the customer name:");
            String name = scanner.nextLine();
            System.out.println("Enter the Date of booking:");
            String date = scanner.nextLine();
            System.out.println("Enter the customer  room number:");
            int room = scanner.nextInt();
            scanner.nextLine(); 

           
            customerdetails customer = new customerdetails();
            customer.displayCustomerdetails(name, date, room);
            customer.displayFloorNum();
        }
    }
}

