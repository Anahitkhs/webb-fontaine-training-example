package Persons_HW3;

/**
 * Created by Anahit Khachatryan  on  26, Sep, 2020
 */
public class Person {
    int age;
    String name;
    // String companyName;
    // Company company; //compozition
    Job[] job;
    //address
    Address address;

    public Person(String name, int age, Address address, Job[] jobs) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age, Address address, Job[] job) {
        this(name, age, address);
        this.job = job;
    }

    @Override
    public String toString() {
        return String.format("{name:%s, age:%d,address:%s,jobs:%s}", name, age, address, job[0]);

    }

}
