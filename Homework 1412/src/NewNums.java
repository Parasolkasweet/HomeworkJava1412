import java.sql.SQLOutput;
import java.util.Scanner;

public class NewNums {
    public static void main(String[] args) {
//        Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер) и напечатает максимум из трех чисел.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 1st num ");
        System.out.println("Write 1st num ");
        int num1 = scanner.nextInt();
        System.out.println("Write 2d num ");
        int num2 = scanner.nextInt();
        System.out.println("Write 3d num ");
        int num3 = scanner.nextInt();
        int maxNumber = findMax(num1, num2, num3);
        System.out.println("max num = " + maxNumber);


    }

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        return max;
    }
}
