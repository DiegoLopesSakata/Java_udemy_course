import java.util.Scanner;

void main() {
    var sc = new Scanner(System.in);

    var employee = new Employee();
    employee.name = sc.nextLine();
    employee.grossSalary = sc.nextDouble();
    employee.tax = sc.nextDouble();

    double liquidSalary = employee.netSalary();

    System.out.printf("Data: name: %s, grossSalary: $ %.2f, liquidSalary: $ %.2f\n", employee.name, employee.grossSalary, liquidSalary);

    employee.increaseSalary(25);

    sc.close();
}
