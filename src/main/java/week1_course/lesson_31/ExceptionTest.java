package week1_course.lesson_31;

import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数 intMath1: ");
        int intMath1 = scanner.nextInt();

        System.out.print("请输入第二个数 intMath2: ");
        int intMath2 = scanner.nextInt();

        scanner.close();

        try {
            if (intMath1 - intMath2 <= 0) {
                throw new UnderFlowException("Value is Under Err: " + (intMath1 - intMath2));
            } else if (intMath1 - intMath2 >= 1000) {
                throw new OverFlowException("Value is Over Err: " + (intMath1 - intMath2));
            }
            // 如果没有抛出异常，执行下面的代码
            System.out.println("Result: " + (intMath1 - intMath2));
        } catch (UnderFlowException | OverFlowException e) {
            System.err.println(e.getMessage());
        }
    }
}
