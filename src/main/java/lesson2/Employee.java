package lesson2;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private short age;

    public Employee(String fullName, String position, String email, String phoneNumber, short age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee data: {" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
    }

