package itmo.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        //Task 1
        boolean isSorted = true;
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        SomeMethods.isSorted(arr);

        //Task 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int arrSize = scanner.nextInt();
        int[] arr2 = new int[arrSize];
        SomeMethods.enterArray(arrSize,arr2);
        System.out.println(Arrays.toString(arr2));

        //Task 3
        int[] arr3 = new int[]{3, 4, 5, 9};
        System.out.println("Not sorted array:" + Arrays.toString(arr3));
        int[] arrSwap = SomeMethods.arraySwap(arr3);
        System.out.println("Sorted array:" + Arrays.toString(arrSwap));

        //Task 4
        int[] arr4 = new int[]{4, 3, 2, 3, 4, 7, 9, 1, 1};
        System.out.println(Arrays.toString(arr4));
        SomeMethods.findUnique(arr4);
    }
}


