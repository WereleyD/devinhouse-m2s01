import java.util.Random;
import java.util.Scanner;

public class Numero {
    public static void ParOuImpar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0) {
            System.out.print("O número " + numero + " é par.");
            return;
        }
        System.out.print("O número " + numero + " é ímpar");
    }

    public static void AdivinharNumero() {
        Random random = new Random();
        int randomNumber = random.nextInt(5) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Tente adivinhar o número");
        System.out.print("Digite um número de 1 à 5: ");
        int number = sc.nextInt();

        if(randomNumber == number) {
            System.out.print("Você acertou!");
            return;
        }
        System.out.print("Você errou. O número correto é " + randomNumber);
    }

    public static void CalcularMedia() {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];
        double soma = 0;


        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        System.out.printf("Média das notas: %.2f", (soma / notas.length));
    }

    public static void Calculadora() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha uma das operações abaixo: \n" +
                "1 - Soma\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão\n");
        int operacao = sc.nextInt();

        System.out.println("Digite dois números para realizar a operação: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        switch (operacao) {
            case 1 -> {
                System.out.println("Você escolheu a operação soma.");
                System.out.print("Resultado da operação: " + (num1 + num2));
            }
            case 2 -> {
                System.out.println("Você escolheu a operação subtração.");
                System.out.print("Resultado da operação: " + (num1 - num2));
            }
            case 3 -> {
                System.out.println("Você escolheu a operação multiplicação.");
                System.out.print("Resultado da operação: " + (num1 * num2));
            }
            case 4 -> {
                System.out.println("Você escolheu a operação divisão.");
                System.out.print("Resultado da operação: " + (num1 / num2));
            }
            default -> System.out.print("Operação inválida.");
        }
    }

    public static void CalculadoraPaPg() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inicial: ");
        int inicial = sc.nextInt();
        System.out.print("Digite a raiz: ");
        int raiz = sc.nextInt();
        System.out.println("Escolha uma das opções: \n" +
                "1 - Progressão Aritmética\n" +
                "2 - Progressão Geométrica");
        int op = sc.nextInt();

        if(op == 1) {
            for (int i = 0; i < 10; i++) {
                System.out.print(inicial + ", ");
                inicial += raiz;
            }
            return;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(inicial + ", ");
            inicial *= raiz;
        }
    }
}
