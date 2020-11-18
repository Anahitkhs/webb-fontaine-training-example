package Persons_HW3;

import java.util.ArrayList;

/**
 * Created by Anahit Khachatryan  on  30, Sep, 2020
 */
public class PersonAPI {
    public static ArrayList<Person>[] getPersonsByCompanyName(ArrayList<Person> persons, String companyName) {
        // Person[] sameCompanyPersons = new Person[persons.length];

        ArrayList<Person> sameCompanyPersons = new ArrayList<>();

        // int currentIndex = 0;
        for (Person person : persons) {
            if (person.job[0].company.name.equals(companyName)) {
                sameCompanyPersons.add(person);
                //  currentIndex++;
            }
        }
        return sameCompanyPersons;


        public static ArrayList<Person>[] getPersonsByCEOName (ArrayList < Person > persons, String ceoName){

            ArrayList<Person> sameCompanyPersons = new ArrayList<>();

            for (Person person : persons) {
                if (person.job[0].company.CEO.name.equals(ceoName)) {
                    sameCompanyPersons.add(person);
                }
            }
            return sameCompanyPersons;
        }
    }
}
