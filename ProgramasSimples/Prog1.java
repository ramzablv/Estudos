import java.util.Scanner;

public class Prog1 {
    public static void main(String args []){
    Scanner leitor = new Scanner(System.in);
    String nome;
    int idade;

    System.out.println("Digite seu nome:");
    nome = leitor.nextLine();
    System.out.println("Seu nome é: "+nome);

    System.out.println("Digite sua idade: ");
    idade = leitor.nextInt();
    System.out.println("Sua idade é: "+idade);
    }
}