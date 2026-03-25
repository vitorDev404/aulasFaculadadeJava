import java.util.Scanner;
//Exercício Proposto 4 – Conversor de moedas
//Enunciado: Crie um conversor de moedas que transforme um valor
//monetário de Reais para Dólares (considere a cotação fixa de 5.00).
public class Ex4DadosEVariaveis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double real, dolar;
        System.out.println("Real R$");
        real = scanner.nextDouble();
        dolar = real*5.00;
        System.out.println("Dolar $ "+dolar);
    }
}
