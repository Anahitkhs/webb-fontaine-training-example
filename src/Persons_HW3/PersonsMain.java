package Persons_HW3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Anahit Khachatryan  on  26, Sep, 2020
 */
public class PersonsMain {
    public static void main(String[] args) {

        ArrayList<Person> persons = DataProvider.getData();

       /* Job[] jobs = new Job[1];

        Person person = new Person("An", 33, new Address("Komitas", "0033"), jobs);

        Company company = new Company("WF", new Address("Armenakyan 5", "0000"),
                new Person("Ara", 45, new Address("Arabkir", "033")));

        person.job[0] = new Job("QA", company);

        Job[] ceoJobs = new Job[1];
        ceoJobs[0] = new Job("CEO", company);
        person.job[0].company.CEO.job = ceoJobs;
        */

        System.out.println(persons);
        System.out.println("PersonAPI.getPersonsByCompanyName(\"WF\")="+PersonAPI.getPersonsByCompanyName(persons,"WF"));
    }

}
