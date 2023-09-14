import java.util.Scanner;

public class Voto {
    public static void SituacaoDeVoto() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();

        if(idade == 16 || idade == 17 || idade > 59) {
            System.out.print("Voto opcional.");
            return;
        }
        if(idade >= 18 && idade <= 59) {
            System.out.print("Voto obrigatório.");
            return;
        }
        System.out.print("Voto proibido.");
    }
}
