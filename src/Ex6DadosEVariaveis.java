//Exercício Proposto 6 – Transformação de base de tempo
//• Enunciado: Receba um valor em segundos e transforme em: Horas,
//Minutos e Segundos (Dica: use / e %).
import java.util.Scanner;
public class Ex6DadosEVariaveis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double segundosTotal,horas,minutos,segundos;
        System.out.println("Segundos: ");
        segundosTotal= scanner.nextDouble();
        horas = segundosTotal/3600;
        minutos = (segundosTotal%3600)/60;
        segundos = segundosTotal%60;
        System.out.printf("Tempo: %.0f:%.0f:%.0f", horas,minutos,segundos);
    }
}
