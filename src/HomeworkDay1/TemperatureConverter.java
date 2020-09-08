package HomeworkDay1;

import java.sql.SQLOutput;

/**
 * Created by Anahit Khachatryan  on  08, Sep, 2020
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        int F = 212;
        int C = (F - 32) * 5 / 9;
        System.out.println("Fahrenheit value is:" + F);
        System.out.println("Celsius value is:" + C);
    }
}
