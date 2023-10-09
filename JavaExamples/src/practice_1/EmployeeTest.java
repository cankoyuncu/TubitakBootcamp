package practice_1;

import practice_1.Employee;

public class EmployeeTest {
    public static void main(String args[]){
        Employee empOne = new Employee("Hans");
        Employee empTwo = new Employee("Mauro");

        empOne.setAge(22);
        empOne.setDesignation("Trader");
        empOne.setSalary(999);
        empOne.printEmployee();

        empTwo.setAge((42));
        empTwo.setDesignation("CEO");
        empTwo.setSalary(999999);
        empTwo.printEmployee();
    }
}
