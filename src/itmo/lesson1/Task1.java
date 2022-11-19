package itmo.lesson1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        //Task 2
        float x;
        x = (46 + 10) * (10f / 3f);
        System.out.println(x);
        int y;
        y = 29 * 4 * (-15);
        System.out.println(y);

        //Task 3
        int number = 10500;
        float result = (number / 10f) / 10f;
        System.out.println(result);

        //Task 4
        float result2 = 3.6f * 4.1f * 5.9f;
        System.out.println(result2);

        //Task 5
        Scanner scanner = new Scanner(System.in);
        int n, m, k;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        System.out.println(n);
        System.out.println(m);
        System.out.println(k);
        //Task 6
        System.out.println("Введите целое число b");
        int b = scanner.nextInt();
        if (b % 2 == 0 && b < 100) {
            System.out.println("Четное");
        }
        if (b % 2 != 0 && b < 100) {
            System.out.println("Нечетное");
        }
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        }
    }


}
