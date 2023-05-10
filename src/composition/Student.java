package composition;

public class Student{

    private String name;
    private int age;

    Address adr = new Address();
    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        streetAddress = adr.getStreetAddress();
        zipCode = adr.getZipCode();
        state = adr.getState();
        phone = adr.getPhone();
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
