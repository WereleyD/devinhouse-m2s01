import java.util.Scanner;

public class Imc {
    public static void CalcularImc() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.print("Seu IMC é " + imc);
    }
}
