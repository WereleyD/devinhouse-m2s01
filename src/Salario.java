import java.util.Scanner;

public class Salario {
    public static void ReajustarSalario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();
        double novoSalario = 0;

        if(salario <= 1200) {
            novoSalario = salario * 1.2;
            System.out.printf("Salário inicial: R$ %.2f", salario);
            System.out.println("\nPercentual de aumento: 20%");
            System.out.printf("Valor do aumento: R$ %.2f", novoSalario - salario);
            System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
            return;
        }
        if(salario > 1200 && salario <= 1700) {
            novoSalario = salario * 1.15;
            System.out.printf("Salário inicial: R$ %.2f", salario);
            System.out.println("\nPercentual de aumento: 15%");
            System.out.printf("Valor do aumento: R$ %.2f", novoSalario - salario);
            System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
            return;
        }
        if(salario > 1700 && salario <= 2500) {
            novoSalario = salario * 1.1;
            System.out.printf("Salário inicial: R$ %.2f", salario);
            System.out.println("\nPercentual de aumento: 10%");
            System.out.printf("Valor do aumento: R$ %.2f", novoSalario - salario);
            System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
            return;
        }
        novoSalario = salario * 1.05;
        System.out.printf("Salário inicial: R$ %.2f", salario);
        System.out.println("\nPercentual de aumento: 5%");
        System.out.printf("Valor do aumento: R$ %.2f", novoSalario - salario);
        System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
    }
}
