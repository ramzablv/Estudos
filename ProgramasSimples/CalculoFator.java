import java.util.Scanner;

public class CalculoFator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n;
        System.out.println("Digite n:");
        n = reader.nextInt();
        fatorial(n);
    }

    public static void fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
            System.out.println("Fatorial de " + i + ": " + fat);
        }
    }
}
