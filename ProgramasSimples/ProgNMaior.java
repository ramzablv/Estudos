import java.util.Scanner;

public class ProgNMaior {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o número inicial: ");
        int n = reader.nextInt();

        System.out.println("Digite o próximo número (ou digite 0 para encerrar): ");
        int x = reader.nextInt();

        int maior = n; 

        while (x != 0) {  
            if (x > maior) {
                maior = x; 
            }

            System.out.println("Digite o próximo número (ou digite 0 para encerrar): ");
            x = reader.nextInt();
        }

        System.out.println("O maior número é: " + maior);
    }
}
