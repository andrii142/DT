package data_structures;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, int age, String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
}
