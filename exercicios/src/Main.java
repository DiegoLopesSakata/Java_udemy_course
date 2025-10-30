//Fazer um programa para ler as medidas dos lados de dois triangulos X e Y (suponhamos medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui maior área.
//Fórmula: area = sqrt(p*(p-a)*(p-b)*(p-c))
//onde p = (a + b + c) / 2

//Com Orientação a Objetos

import java.util.Scanner;

void main() {
    var sc = new Scanner(System.in);

    System.out.println("Enter the measures of triangle X: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    var triangleX = new Triangle(a, b, c);

    System.out.println("Enter the measures of triangle Y: ");
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    var triangleY = new Triangle(a, b, c);

    var areaX = triangleX.area();
    var areaY = triangleY.area();

    if(areaX > areaY){
        System.out.println("Larger area: X");
    }
    else{
        System.out.println("Larger area: Y");
    }

    sc.close();
}
