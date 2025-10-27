import java.util.Scanner;

void main() {
    var sc = new Scanner(System.in);
    var cond = new estruturaCondicional();
    char cont = 's';

    do {
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        cond.parImpar(valor);
        cond.negativo(valor);

        System.out.println("Digite dois valores para ver se são multiplos:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        cond.multiplos(a, b);

        System.out.println("Digite o horario inicial e final de um jogo: ");
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        cond.duracaoJogo(horaInicial, horaFinal);

        System.out.println("Digite o seu salário: ");
        float salario = sc.nextFloat();

        cond.impostoRenda(salario);

        System.out.println("Deseja continuar? (s/n): ");
        cont = sc.next().charAt(0);
    }while(cont != 'n');

    sc.close();
}
