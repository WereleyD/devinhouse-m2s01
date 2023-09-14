import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op = -1;

        while(op != 0) {
            System.out.print("\nSemana 01: \n" +
                    "\n1 - Mostrar Nome\n" +
                    "2 - Calcular IMC\n" +
                    "3 - Par ou Ímpar\n" +
                    "4 - Adivinhar Número\n" +
                    "5 - Calcular Média\n" +
                    "6 - Situação de Voto\n" +
                    "7 - Calculadora\n" +
                    "8 - Calculadora de Pa ou Pg\n" +
                    "9 - Reajuste de Salário\n" +
                    "Escolha uma das opções acima: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    Nome.MostrarNome(); //exercicio 1
                    Ler();
                    break;
                case 2:
                    Imc.CalcularImc(); //exercicio 2
                    Ler();
                    break;
                case 3:
                    Numero.ParOuImpar(); //exercicio 3
                    Ler();
                    break;
                case 4:
                    Numero.AdivinharNumero(); //exercicio 4
                    Ler();
                    break;
                case 5:
                    Numero.CalcularMedia(); //exercicio 5
                    Ler();
                    break;
                case 6:
                    Voto.SituacaoDeVoto(); //exercicio 6
                    Ler();
                    break;
                case 7:
                    Numero.Calculadora(); //exercicio 7
                    Ler();
                    break;
                case 8:
                    Numero.CalculadoraPaPg(); //exercicio 8
                    Ler();
                    break;
                case 9:
                    Salario.ReajustarSalario(); //exercicio 9
                    Ler();
                    break;
                case 0:
                    System.out.println("Fechando aplicação!");
            }
        }
    }

    public static void Ler() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPressione qualquer tecla para continuar . . . ");
        sc.nextLine();
    }


















}