import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelManagement hotelManagement = new HotelManagement();
        while (true) {
            ShowMenu();
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    hotelManagement.AddNewPersonToPersonList();
                    break;
                case 2:
                    System.out.println("Enter credential id to delete");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    hotelManagement.RemovePersonFromPersonList(id);

                    System.out.println("PersonList after remove: ");
                    hotelManagement.ShowAllPerson();
                    break;
                case 3:
                    hotelManagement.ShowAllPerson();
                    break;
                case 4:
                    System.out.println("Enter credential id: ");
                    int credentialId = scanner.nextInt();
                    scanner.nextLine();
                    double price = hotelManagement.CalculatorPrice(credentialId);
                    System.out.println("Price: " + price + "$");
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }

    }

    public static void ShowMenu() {
        System.out.println("1. Add new person");
        System.out.println("2. Delete a person");
        System.out.println("3. Show list person");
        System.out.println("4. Calculator price");
    }
}