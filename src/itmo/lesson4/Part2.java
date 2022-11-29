package itmo.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        //Task 1
        boolean isSorted = true;
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (isSorted == true) {
            System.out.println("Okay");
        } else {
            System.out.println("Please, try again");
        }


        //Task 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int arrSize = scanner.nextInt();
        int[] arr2 = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter number:");
            arr2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

        //Task 3
        int[] arr3 = new int[]{3, 4, 5, 9};
        System.out.println("Not sorted array:" + Arrays.toString(arr3));
        int[] arrSwap = SomeMethods.arraySwap(arr3);
        System.out.println("Sorted array:" + Arrays.toString(arrSwap));

        //Task 4
        int[] arr4 = new int[]{4, 3, 2, 3, 4, 7, 9, 1, 1};
        int first = 0;
        for (int i = 0; i < arr4.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr4.length; j++) {
                if (arr4[i] == arr4[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                if (first == 0) {
                    System.out.println("Unique numbers:" + arr4[i]);
                    first++;
                }
            }
        }
    }
}


