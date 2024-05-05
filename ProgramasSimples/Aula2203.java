import java.util.Scanner;

public class Aula2203 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        int a1, a2, a3, notafinal;

        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();
        System.out.println("Digite A1:");
        a1 = leitor.nextInt();
        System.out.println("Digite A2:");
        a2 = leitor.nextInt();
        System.out.println("Digite A3:");
        a3 = leitor.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("A1: " + a1);
        System.out.println("A2: " + a2);
        System.out.println("A3: " + a3);

        notafinal = (int) (0.3 * a1 + 0.3 * a2 + 0.4 * a3);

        if (notafinal >= 70) {
            System.out.println("Aprovado");
        } else if (notafinal > 30) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Nota Final: " + notafinal);
        leitor.close();
    }
}
