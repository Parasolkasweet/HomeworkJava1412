import java.util.Scanner;

public class LeapJahr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write year ");
        int year = scanner.nextInt();
        boolean leapYear = isleap(year);
        if (leapYear){
            System.out.println(year + " is Leap");
        } else{
            System.out.println(year + " is not Leap");
        }

    }
    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
