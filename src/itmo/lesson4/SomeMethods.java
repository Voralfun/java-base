package itmo.lesson4;

import java.util.Scanner;

public class SomeMethods {
    public static void findOddN() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void numWD35() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static boolean isEqual(int firstN,int secondN,int thirdN){
        boolean isEqual;
        if (firstN+secondN == thirdN){
            isEqual = true;
        }else{
            isEqual = false;
        }
        return isEqual;
    }

    public static boolean isOver(int firstN,int secondN,int thirdN){
        boolean isOver;
        if (secondN > firstN && thirdN > secondN) {
            isOver = true;
        }else {
            isOver = false;
        }
        return isOver;
    }
    public static boolean isNumb3(int[] arr) {
        boolean isNumb3 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == 3 || arr[arr.length - 1] == 3) {
                isNumb3 = true;
                break;
            } else {
                isNumb3 = false;
            }
        }
        return isNumb3;
    }

    public static boolean isNumb13(int[] arr) {
        boolean isNumb13 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                isNumb13 = true;
                break;
            } else {
                isNumb13 = false;
            }

        }
        return isNumb13;
    }

    //Part 2
    public static void isSorted(int [] arr){
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted == true) {
            System.out.println("Okay");
        } else {
            System.out.println("Please, try again");
        }
    }
    public static void enterArray(int arrSize,int [] arr){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter number:");
            arr[i] = scanner.nextInt();
        }
    }
    public static int[] arraySwap(int[] array) {
        int x = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = x;
        return array;
    }

    public static void findUnique(int[] arr){
        int first = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                if (first == 0) {
                    System.out.println("Unique numbers:" + arr[i]);
                    first++;
                }
            }
        }
    }
}

