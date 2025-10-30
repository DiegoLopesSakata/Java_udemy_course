public class Triangle {
    double a, b, c;
    double p = (a + b + c) / 2;
    double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
