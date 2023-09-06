package week1_course.lesson_02;

import org.junit.jupiter.api.Test;

public class TestEmployee {

    public static void main(String[] args) {

    }

    @Test
    public void Test(){

        SalesEmployee salesEmployee = new SalesEmployee(1002,"Jack");

        System.out.println("salesEmployee information");
        System.out.println(salesEmployee.toString());
        System.out.println(salesEmployee.getMonthlyPay());


        Manager manager = new Manager(1001,"Tom");
        System.out.println("manager information ");
        System.out.println(manager.toString());
        System.out.println(manager.getMonthlyPay());


        System.out.println("compare ");
        System.out.println(manager.compareTo(salesEmployee));
    }
}
