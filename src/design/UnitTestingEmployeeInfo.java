package design;

public class UnitTestingEmployeeInfo {

    public static <EmployeeInfo> void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

        EmployeeInfo ei = new EmployeeInfo( "Juwel", 10);

        System.out.println("Employee name is " + ei.getName());

        ei.setYearOfEmployeement(10);
        ei.setSalary(7000.00);

        System.out.println("Employee works for this company is about "+ei.getYearOfEmployeement()+" years.");

        System.out.println("Employee's monthly salary is "+ ei.getSalary());

        ei.mailCheck();

        double b = ei.calculateEmployeeBonus(7000.00,"Good");

        System.out.println("Employee bonus is "+b);








    }
}