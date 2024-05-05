import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lado1, lado2, lado3;
        int perimetro;
        double area;

        System.out.println("Digite o valor 1 do triangulo: ");
        lado1 = leitor.nextInt();
        System.out.println("Digite o valor 2 do triangulo: ");
        lado2 = leitor.nextInt();
        System.out.println("Digite o valor 3 do triangulo: ");
        lado3 = leitor.nextInt();

        perimetro = lado1+lado2+lado3;

       // formula de Heron
        double s = (lado1 + lado2 + lado3) / 2.0;
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        System.out.println("O perimetro do triangulo é: "+perimetro);
        System.out.println("a area do triangulo é: "+area);
        

    }
    
}
