//Exercício Proposto 2 – Conversor de Moedas para Viagens
//• Problema: Leia o valor em Reais (R$) disponível e a cotação atual do
//dólar. Calcule e exiba quanto o aluno terá em Dólares (US$).
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double real,dolar;
        System.out.println("Digite um valor em R$ ");
        real = scanner.nextDouble();
        dolar = real*5.28;
        System.out.println("Dolar $ "+dolar);
    }
}