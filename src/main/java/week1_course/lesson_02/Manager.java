package week1_course.lesson_02;

public class Manager extends Employee {
    double bonus = 1000;

    public Manager(int ID, String name) {
        super(ID, name);
        salary = 2000;  // 覆盖父类的 salary
    }

    @Override
    public double getMonthlyPay() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

