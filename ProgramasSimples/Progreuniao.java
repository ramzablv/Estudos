package Projetos;

// adicionado alguns pacotes

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Reuniao { 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        
// o horario deve ser informado em HH:MM        
        
        System.out.println("Informe o horário de ínicio da reunião:");
        String inicio = leitor.nextLine();
        LocalTime inicioreuniao = LocalTime.parse(inicio, formato);

        System.out.println("Informe o horário de término da reunião");
        String termino = leitor.nextLine();
        LocalTime terminoreuniao = LocalTime.parse(termino, formato);

        long duracaominutos = ChronoUnit.MINUTES.between(inicioreuniao, terminoreuniao);
        
        long horas = duracaominutos / 60;
        long minutos = duracaominutos % 60;

    
        System.out.println("A reunião durou " + horas + " horas e " + minutos + " minutos.");
        
        leitor.close();
    
    }

    
}
