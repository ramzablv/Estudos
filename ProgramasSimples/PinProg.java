import java.util.Scanner;

public class PinProg {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int n = reader.nextInt();

        int x = 4;

        for (int i = n; i <= 100; i++) {
            System.out.println("Número: " + i);
            if (i == x) {
                System.out.println("Número: pin");
                x = x + 4;
            }
        }
    }
}
