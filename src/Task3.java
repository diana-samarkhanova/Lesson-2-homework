//Leap year
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int normalyear = 365;
        int leapyear = 366;
        System.out.println("Enter a year in 'yyyy' format");
        int enteredyear = in.nextInt();

        if(enteredyear%400 == 0 || enteredyear % 4 == 0){
            System.out.println("Number of days: " + leapyear);
        } else if (enteredyear%100 == 0) {
            System.out.println("Number of days: " + normalyear);
        } else {
            System.out.println("Number of days: " + normalyear);
        }
    }
}
