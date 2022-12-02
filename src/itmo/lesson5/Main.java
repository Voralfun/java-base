package itmo.lesson5;

import itmo.lesson4.SomeMethods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        String someText = "Each lesson has a preparation task, a reading text and two tasks to check your understanding and to practise a variety of reading skills.";
        StringMethods.findMax(someText);

        //Task 2
        String someWord = "Топоп";
        StringMethods.ifPalindrome(someWord);

        //Task 3
        String justText = "Ты бяка";
        String needChange ="бяка";
        StringMethods.censorText(justText,needChange);
        //Task 4
        String str1 = "KKKADSJLAKSJDLL";
        String str2 = "KK";
        System.out.println("Number: "+StringMethods.countIn(str1,str2));

        //Task 5
        String normalText = "Hello world";
        System.out.println(normalText);
        System.out.println(StringMethods.reverseText(normalText));
    }
}