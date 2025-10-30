public class EstruturaCondicional {

    public static void parImpar(int n){
        if(n%2==0){
            System.out.println(n + " eh um valor par");
        }
        else{
            System.out.println(n + " eh um valor impar");
        }
    }

    public static void negativo(int n){
        if(n<0){
            System.out.println(n + " eh um valor negativo");
        }
        else{
            System.out.println(n + " eh um valor positivo");
        }
    }

    public static void multiplos(int a, int b){
        if(a > b){
            if(a%b==0){
                System.out.println("São multiplos");
            }
            else{
                System.out.println("Não são multiplos");
            }
        }
        else{
            if(b%a==0){
                System.out.println("São multiplos");
            }
            else{
                System.out.println("Não são multiplos");
            }
        }
    }

    public static void duracaoJogo(int horaInicial, int horaFinal){
        int duracao;

        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }
        else if (horaInicial == horaFinal) {
            duracao = 24;
        }
        else{
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");
    }

    public static void impostoRenda(float salario){
        float imposto;

        if(salario <= 2000){
            imposto = 0;
            System.out.println("Isento");
        }
        else if(salario > 2000 && salario <= 3000){
            imposto = salario* (float) 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else if(salario >3000 && salario <=4500){
            imposto = salario * (float) 0.18;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else{
            imposto = salario * (float) 0.28;
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
