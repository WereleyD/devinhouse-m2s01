import java.util.Scanner;

public class Nome {
    public static void MostrarNome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Seu nome é " + nomeCompleto);
        System.out.println("Seu nome tem " + nome.length() + " letras.");
    }
}
