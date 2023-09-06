package week1_course.lesson_02;

public class SalesEmployee extends Employee {


    double profit;


    public SalesEmployee(int ID, String name) {
        super(ID, name);
        double salary = 1000;
    }

    @Override
    public double getMonthlyPay() {
        return salary;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" + "profit=" + profit + ", ID=" + ID + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
