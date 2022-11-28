package itmo.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args){
        //Task 1
        System.out.println("Odd numbers:");
        for (int i = 1; i<=99;i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        //Task 2
        System.out.println("Numbers which divisible by 3 and 5:");
        for (int i = 1; i<=100;i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }

        //Task 3
        Scanner scanner = new Scanner(System.in);
        int firstN;
        int secondN;
        int thirdN;
        boolean isEqual;
        System.out.println("Enter first number:");
        firstN = scanner.nextInt();
        System.out.println("Enter second number:");
        secondN = scanner.nextInt();
        System.out.println("Enter third number:");
        thirdN = scanner.nextInt();
        if (firstN+secondN == thirdN){
            isEqual = true;
        }else{
            isEqual = false;
        }
        System.out.println("First number:"+firstN);
        System.out.println("Second number:"+secondN);
        System.out.println("Third number:"+thirdN);
        System.out.println("Result:"+isEqual);

        //Task 4
        int firstN1;
        int secondN1;
        int thirdN1;
        boolean isOver;
        System.out.println("Enter first number:");
        firstN1 = scanner.nextInt();
        System.out.println("Enter second number:");
        secondN1 = scanner.nextInt();
        System.out.println("Enter third number:");
        thirdN1 = scanner.nextInt();
        if (secondN1 > firstN1 && thirdN1 > secondN1) {
            isOver = true;
        }else {
            isOver = false;
        }
        System.out.println("Result:"+isOver);

        //Task 5
        boolean isNumb3=false;
        int [] arr = new int[]{10,4,3,2,3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[0]==3 || arr[arr.length-1] == 3) {
                    isNumb3 = true;
                    break;
            }else{
                isNumb3 = false;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Result:"+isNumb3);

        //Task 6
        int [] arr1 = new int[]{3,5,22,70,31,2};
        boolean isNumb13=false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1 || arr1[i] == 3) {
                isNumb13 = true;
                break;
            }else{
                isNumb13 = false;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Result:"+isNumb13);
    }
}
