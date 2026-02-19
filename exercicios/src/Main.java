import java.util.Scanner;

void main() {
    var sc = new Scanner(System.in);

    System.out.println("Quantas pessoas serao digitadas? ");
    int n = sc.nextInt();
    sc.nextLine();

    Person[] people = new Person[n];
    double mediaAltura = 0;
    int menor16 = 0;

    for(int i = 0; i < n; i++){
        System.out.printf("Digite as informações da %dº pessoa:\n", i+1);
        System.out.println("Digite o nome: ");
        String name = sc.nextLine();
        System.out.println("Digite a idade: ");
        int age = sc.nextInt();
        System.out.println("Digite a altura: ");
        double height = sc.nextDouble();
        sc.nextLine();

        people[i] = new Person(name, age, height);
        mediaAltura += height;
        if(age < 16){
            menor16++;
        }
    }

    mediaAltura /= n;
    menor16 = menor16 * 100 / n;

    System.out.printf("A altura media das pessoas é: %.2f\n", mediaAltura);
    System.out.println("A porcentagem de menores de 16 é: " + menor16 + "%");

    for(int i = 0; i < people.length; i++){
        if(people[i].getAge() < 16){
            System.out.println(people[i].getName());
        }
    }

    sc.close();
}
