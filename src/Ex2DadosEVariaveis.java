import java.util.Scanner;
//Exercício Proposto 2 – Área de um quadrado
//Enunciado: Faça um programa que calcule a área de um quadrado.
public class Ex2DadosEVariaveis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero1,numero2,area;
        System.out.println("Numero 1");
        numero1 = scanner.nextInt();
        System.out.println("Numero 2");
        numero2 = scanner.nextInt();
        area = numero1*numero2;
        System.out.println("Area = " + area);
    }
}
