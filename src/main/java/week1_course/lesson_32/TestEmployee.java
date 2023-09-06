package week1_course.lesson_32;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Employee> employeeMap = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("请输入第 " + (i + 1) + " 个员工的姓名：");
                String name = scanner.nextLine();

                System.out.println("请输入第 " + (i + 1) + " 个员工的薪水：");
                double salary = readDoubleFromConsole(scanner);

                Employee employee = new Employee(name, salary);
                employeeMap.put(name, employee);
            } catch (InputDoubleException e) {
                System.err.println("输入的薪水格式不正确，请重新输入。");
                i--; // 重新输入当前员工信息
            }
        }

        scanner.close();

        // 遍历HashMap并将数据写入文件
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("c:/EmployeeInfo.txt"))) {
            for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            System.out.println("员工信息已写入到 c:/EmployeeInfo.txt 文件中。");
        } catch (IOException e) {
            System.err.println("写入文件时发生错误：" + e.getMessage());
        }
    }

    private static double readDoubleFromConsole(Scanner scanner) throws InputDoubleException {
        String input = scanner.nextLine();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new InputDoubleException("输入的薪水不是有效的double类型。");
        }
    }
}

