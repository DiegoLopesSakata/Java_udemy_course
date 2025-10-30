//Fazer um programa para ler as medidas dos lados de dois triangulos X e Y (suponhamos medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui maior área.
//Fórmula: area = sqrt(p*(p-a)*(p-b)*(p-c))
//onde p = (a + b + c) / 2

//Sem Orientação a Objetos

import java.util.Scanner;

void main() {
    var sc = new Scanner(System.in);

    System.out.println("Enter the measures of triangle X: ");
    double aX = sc.nextDouble();
    double bX = sc.nextDouble();
    double cX = sc.nextDouble();

    System.out.println("Enter the measures of triangle Y: ");
    double aY = sc.nextDouble();
    double bY = sc.nextDouble();
    double cY = sc.nextDouble();

    double pX = (aX + bX + cX) / 2;
    double pY = (aX + bY + cY) / 2;

    double areaX = Math.sqrt(pX*(pX-aX)*(pX-bX)*(pX-cX));
    double areaY = Math.sqrt(pY*(pY-aY)*(pY-bY)*(pY-cY));

    if(areaX > areaY){
        System.out.println("Larger area: X");
    }
    else{
        System.out.println("Larger area: Y");
    }

    sc.close();
}
