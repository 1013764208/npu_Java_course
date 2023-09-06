package week1_course.lesson_01;
import java.util.Scanner;

public class Lab1_1 {

    public int fib(int n) {

        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        try {
            int input = scanner.nextInt();
            Lab1_1 lab1 = new Lab1_1();
            System.out.println("斐波那契数列的结果为：" + lab1.fib(input));
        } catch (java.util.InputMismatchException e) {
            System.out.println("输入错误：请确保输入的是整数。");
        }
        scanner.close();
    }
}