package itmo.lesson5;

import java.util.Arrays;

public class StringMethods {
    public static void findMax(String words){
        int max = 0;
        int num = 0;
        String[] arr = words.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>max) {
                max = arr[i].length();
                num = i;
            }
        }
        System.out.println(arr[num]);
    }

    public static void ifPalindrome(String word){
        boolean isPalindrome = true;
        int left = 0;
        int right = word.length()-1;
        while(left<right){
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(word+" is palindrome");
        }else{
            System.out.println(word+" is not palindrome");
        }
    }
    public static String censorText(String text){
        String censoredText = text.replace("бяка","[вырезано цензурой]");
        return censoredText;
    }
    public static int countIn(String str1,String str2){
        int count = str1.split(str2,-1).length-1;
        return count;
    }

    public static String reverseText(String text){
        String reversedT = "";
        for (int i = 0; i < text.length(); i++) {
            reversedT = text.charAt(i)+reversedT;
        }
        return reversedT;
    }

}
