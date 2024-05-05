import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, unidade, dezena, centena;

        System.out.println("Digite numero entre 1 e 999");
        numero = leitor.nextInt();

        centena = numero / 100;
        dezena = (numero / 10) % 10;
        unidade = numero % 10;

        System.out.println("unidade: "+unidade);
        System.out.println("dezena: "+dezena);
        System.out.println("centena: "+centena);
    

    }
    
}
