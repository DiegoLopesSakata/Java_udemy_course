import java.util.Scanner;

void main() {
    var sc = new Scanner(System.in);

    double radius = sc.nextDouble();
    double circumference = Calculator.circumference(radius);
    double volume = Calculator.volume(radius);

    System.out.printf("Circumference: %.2f\n", circumference);
    System.out.printf("Volume: %.2f\n", volume);
    System.out.printf("PI Value: %.2f", Calculator.PI);

    sc.close();
}
