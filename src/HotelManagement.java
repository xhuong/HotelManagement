import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManagement {
    List<Person> personList;

    public HotelManagement() {
        personList = new ArrayList<>();
    }

    public void AddNewPersonToPersonList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter number of rental days: ");
        int numberRent = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter room: ");
        String roomOption = scanner.nextLine().toUpperCase();
        Room room = null;

        if (roomOption.equals("A")) {
            System.out.println("choose room A");
            room = new RoomA();
        } else if (roomOption.equals("B")) {
            System.out.println("choose room B");
            room = new RoomB();
        } else if (roomOption.equals("C")) {
            System.out.println("choose room C");
            room = new RoomC();
        }

        System.out.println("Enter credential id: ");
        int credentialId = scanner.nextInt();
        scanner.nextLine();
        Person person = new Person(name, age, credentialId, room, numberRent);
        personList.add(person);
    }

    public void RemovePersonFromPersonList(int credentialId) {
        personList.removeIf(person -> person.getCredenticalId() == credentialId);
    }

    public void ShowAllPerson() {
        personList.forEach(person -> {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Number of rental days: " + person.getNumberRent());
            System.out.println("CredentialId: " + person.getCredenticalId());
            System.out.println("Room: " + person.getRoom());
        });
    }

    public double CalculatorPrice(int credentialId) {
        Person per = personList.stream().filter(person -> person.getCredenticalId() == credentialId).findFirst().get();
        return per.getNumberRent() * per.getRoom().getPrice();
    }
}
