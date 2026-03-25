//Exercício Proposto 1 – Calculadora de Velocidade Média
//Problema: Elabore um algoritmo e um programa Java que receba a
//distância percorrida (em km) e o tempo gasto (em horas). O programa
//deve exibir a velocidade média.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double distancia, tempoGasto, velocidadeMedia;
        System.out.println("Digite a distancia:");
        distancia = scanner.nextDouble();
        System.out.println("Digite o tempo gasto:");
        tempoGasto = scanner.nextDouble();
        velocidadeMedia = distancia/tempoGasto;
        System.out.println("A velocidade media é igual a: "+velocidadeMedia);
    }
}