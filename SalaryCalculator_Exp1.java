import java.util.Scanner;

public class SalaryCalculator_Exp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int empno = scanner.nextInt();

        System.out.print("Enter employee name: ");
        String empname = scanner.next();

        System.out.print("Enter basic salary (ba): Rs ");
        double ba = scanner.nextDouble();

        // Calculate DA, HRA, CCA, PF, PT based on the given percentages and values
        double da = 0.7 * ba;
        double hra = 0.3 * ba;
        double cca = 240;
        double pf = 0.1 * ba;
        double pt = 100;

        // Calculate the gross salary and net salary
        double grossSalary = ba + da + hra + cca;
        double netSalary = grossSalary - pf - pt;

        // Display the results
        System.out.println("\nEmployee Details:");
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + empname);

        System.out.println("\nSalary Details:");
        System.out.println("Basic Salary (ba): Rs " + ba);
        System.out.println("DA: Rs " + da);
        System.out.println("HRA: Rs " + hra);
        System.out.println("CCA: Rs " + cca);
        System.out.println("PF: Rs " + pf);
        System.out.println("PT: Rs " + pt);

        System.out.println("\nGross Salary: Rs " + grossSalary);
        System.out.println("Net Salary: Rs " + netSalary);

        scanner.close();
    }
}
