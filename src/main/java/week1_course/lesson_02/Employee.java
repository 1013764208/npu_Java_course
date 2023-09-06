package week1_course.lesson_02;

import java.sql.PreparedStatement;

public abstract class Employee {

    int ID;
    String name;
    protected double salary;

    /**
     * @param ID
     * @param name
     */
    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        int res =  Double.compare(this.salary, employee.salary);
        if (res > 0){
            System.out.println(this + "大于" + employee);
        } else if (res < 0) {
            System.out.println(this + "小于" + employee);
        } else {
            System.out.println("等于");
        }
        return res;
    }

    public abstract double getMonthlyPay();
}
