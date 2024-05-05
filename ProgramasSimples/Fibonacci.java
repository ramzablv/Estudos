import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = reader.nextInt();
        reader.close();

        int resultado = calcularFibonacci(n);
        System.out.println("O " + n + "º número da sequência de Fibonacci é: " + resultado);
    }

    static int calcularFibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            int a = 0;
            int b = 1;
            int temp;
            for (int i = 2; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
}
