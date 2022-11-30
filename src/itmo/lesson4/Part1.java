package itmo.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args){
        //Task 1
        System.out.println("Odd numbers:");
        SomeMethods.findOddN();

        //Task 2
        System.out.println("Numbers which divisible by 3 and 5:");
        SomeMethods.numWD35();

        //Task 3
        Scanner scanner = new Scanner(System.in);
        int firstN;
        int secondN;
        int thirdN;
        System.out.println("Enter first number:");
        firstN = scanner.nextInt();
        System.out.println("Enter second number:");
        secondN = scanner.nextInt();
        System.out.println("Enter third number:");
        thirdN = scanner.nextInt();
        System.out.println("First number:"+firstN);
        System.out.println("Second number:"+secondN);
        System.out.println("Third number:"+thirdN);
        System.out.println("Is equal? "+SomeMethods.isEqual(firstN,secondN,thirdN));

        //Task 4
        int firstN1;
        int secondN1;
        int thirdN1;
        System.out.println("Enter first number:");
        firstN1 = scanner.nextInt();
        System.out.println("Enter second number:");
        secondN1 = scanner.nextInt();
        System.out.println("Enter third number:");
        thirdN1 = scanner.nextInt();
        System.out.println("First number:"+firstN1);
        System.out.println("Second number:"+secondN1);
        System.out.println("Third number:"+thirdN1);
        System.out.println("Is over? "+SomeMethods.isOver(firstN1,secondN1,thirdN1));

        //Task 5
        int [] arr = new int[]{10,4,1,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println("Result:"+SomeMethods.isNumb3(arr));

        //Task 6
        int [] arr1 = new int[]{3,5,22,70,31,2};
        System.out.println(Arrays.toString(arr1));
        System.out.println("Result:"+SomeMethods.isNumb13(arr1));
    }
}
