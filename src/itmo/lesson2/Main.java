package itmo.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Task 1**/
        Scanner scanner = new Scanner(System.in);
        int firstNUM = 56;
        int secondNUM = 6;
        double firstNUMD = 56D;
        double secondNUMD = 6;
        long firstNUML = 56L;
        long secondNUML = 6;

        System.out.println("Choose operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int menu1 = scanner.nextInt();
        Calculator calculator = new Calculator();
        switch (menu1) {
            case 1:
                calculator.addition(firstNUM, secondNUM);
                calculator.addition(firstNUMD, secondNUMD);
                calculator.addition(firstNUML, secondNUML);
                break;
            case 2:
                calculator.subtraction(firstNUM,secondNUM);
                calculator.subtraction(firstNUMD,secondNUMD);
                calculator.subtraction(firstNUML,secondNUML);
                break;
            case 3:
                calculator.multiplication(firstNUM,secondNUM);
                calculator.multiplication(firstNUMD,secondNUMD);
                calculator.multiplication(firstNUML,secondNUML);
                break;
            case 4:
                calculator.division(firstNUM,secondNUM);
                calculator.division(firstNUMD,secondNUMD);
                calculator.division(firstNUML,secondNUML);
                break;
        }
        /**Task 2**/
        System.out.println("Class NoParameters with constructor without parameters:");
        NoParameters noP = new NoParameters();
        System.out.println(noP.x);
        System.out.println("Class WithParameters with constructor with parameters:");
        WithParameters withP = new WithParameters(10,20,30);
        System.out.println(withP.x+ withP.y* withP.z);
    }

}

