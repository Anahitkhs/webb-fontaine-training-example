package Persons_HW3;

/**
 * Created by Anahit Khachatryan  on  29, Sep, 2020
 */
public class Job {
    String jobTitle;
    Company company;

    public Job(String jobTitle, Company company) {
        this.jobTitle = jobTitle;
        this.company = company;
    }

    public Job(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return String.format("{title:%s, company:%s}", jobTitle, company);
    }
}
