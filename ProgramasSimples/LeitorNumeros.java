import java.util.Scanner;

public class LeitorNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite três números inteiros:");

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        // Encontrando o maior número
        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        // Encontrando o menor número
        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        // Encontrando o segundo maior número
        int segundomaior = a + b + c - maior - menor;

        System.out.println("O maior número é: " + maior);
        System.out.println("O segundo maior número é: " + segundomaior);
        System.out.println("O menor número é: " + menor);
    }
}
