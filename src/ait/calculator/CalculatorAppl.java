package ait.calculator;

import java.util.Scanner;

public class CalculatorAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input number 1 :");
            double a = scanner.nextDouble();
            System.out.println("Input number 2 :");
            double b = scanner.nextDouble();
            System.out.println("Input operation :");
            String oper = scanner.next();
            double res = calculator(a, b, oper);
            System.out.println(res);
            System.out.println("Continue? (Yes/No): ");
            String choice = scanner.next();
            if (choice.equals("No")) {
                System.out.println("Thank you!");
                return;
            }
        }
    }

    public static double calculator(double a, double b, String oper) {
        double res;
        switch (oper) {
            case "add":
                res = a + b;
                break;
            case "sub":
                res = a - b;
                break;
            case "mul":
                res = a * b;
                break;
            case "div":
                res = a / b;
                break;
            default:
                System.out.println("Wrong operation");
                return 0./0;
        }
        return res;
    }

}
