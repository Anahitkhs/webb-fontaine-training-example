package Persons_HW3;

/**
 * Created by Anahit Khachatryan  on  26, Sep, 2020
 */
public class Company {
    String name;
    //String CEOName;
    Person CEO;
    // String address;
    Address address;

    public Company(String name, Address address, Person CEO) {
        this.name = name;
        this.address = address;
        this.CEO = CEO;
    }

    public Company(String name, Person CEO) {
        this(name, null, CEO);
    }

    public Company(String name) {
        this(name, null, null);
    }

    @Override
    public String toString(){
        return  String.format("{name:%s, address:%s, CEO-name:%s}",name,address,CEO.name);
    }

}
