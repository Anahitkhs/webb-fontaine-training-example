package Persons_HW3;

import javax.swing.plaf.IconUIResource;

/**
 * Created by Anahit Khachatryan  on  26, Sep, 2020
 */
public class Address {
    static  final String DEFAULT_COUNTRY ="Armenia";
    static  final String DEFAULT_CITY ="Yerevan";

    String country;
    String city;
    String address;
    String zipCode;

    public Address(String country, String city, String address, String zipCode){
        this.country= country;
        this.city= city;
        this.address= address;
        this.zipCode=zipCode;
    }
    public Address(String address, String zipCode){
        this(DEFAULT_COUNTRY, DEFAULT_CITY, address, zipCode);
    }

    @Override
    public String toString(){
        return  String.format("{country:%s, city:%s, address:%s, zipCode:%s}",country,city,address,zipCode);
    }
}
