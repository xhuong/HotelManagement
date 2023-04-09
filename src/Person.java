
public class Person {
    private String name;
    private int age;
    private int credenticalId;

    private int numberRent;

    private Room room;

    public Person() {
    }

    public Person(String name, int age, int credenticalId, Room room, int numberRent) {
        this.age = age;
        this.name = name;
        this.credenticalId = credenticalId;
        this.room = room;
        this.numberRent = numberRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCredenticalId() {
        return credenticalId;
    }

    public void setCredenticalId(int credenticalId) {
        this.credenticalId = credenticalId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }
}
