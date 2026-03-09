import oldExercises.Employee;

import java.util.Scanner;

void main() {
    var sc = new Scanner(System.in);

    System.out.println("How many employees will be registered? ");
    int n = sc.nextInt();
    sc.nextLine();

    List<Employee> employees = new ArrayList<>();

    for(int i = 0; i < n; i++){
        System.out.printf("oldExercises.Employee #%d\n\n", i+1);

        System.out.println("Enter the employee id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter the employee salary: ");
        double salary = sc.nextDouble();

        var employee = new Employee(id, name, salary);
        employees.add(employee);
    }

    System.out.println("Enter the employee id that will have a salary increase: ");
    int id = sc.nextInt();
    Employee result = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

    if(result != null){
        System.out.println("Enter the percentage: ");
        double percentage = sc.nextDouble();
        employees.get(employees.indexOf(result)).salaryIncrease(percentage);
    }
    else{
        System.out.println("This id does not exist!");
    }

    for(Employee x : employees){
        System.out.println(x);
    }

    sc.close();
}
