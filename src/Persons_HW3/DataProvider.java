package Persons_HW3;

import java.util.ArrayList;

/**
 * Created by Anahit Khachatryan  on  30, Sep, 2020
 */
public class DataProvider {
    static ArrayList<Person> person = new ArrayList<>();

    static {
        Job[] jobs = new Job[1];

        Person person = new Person("An", 33, new Address("Komitas", "0033"), jobs);

        Company company = new Company("WF", new Address("Armenakyan 5", "0000"),
                new Person("Ara", 45, new Address("Arabkir", "033")));

        person.job[0] = new Job("QA", company);

        Job[] ceoJobs = new Job[1];
        ceoJobs[0] = new Job("CEO", company);
        person.job[0].company.CEO.job = ceoJobs;

        persons.add(person);
        persons.add(person);
        persons.add(person);
        persons.add(person);
    }

    private DataProvider() {
    }

    static ArrayList<Person> getData() {
        return persons;

    }
}
