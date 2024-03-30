package Class;

abstract class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private char gender;

    public Employee(int id, String firstName, String lastName, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
}
