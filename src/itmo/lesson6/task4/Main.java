package itmo.lesson6.task4;

import java.util.Scanner;

public class Main {
    public int intNum;

    public Main(int num){
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        intNum = num;
    }
}
