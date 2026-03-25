//Exercício Proposto 7 – Desafio
//• Enunciado: Receba três valores (A, B, C) e verifique se eles podem
//formar um triângulo (A soma de dois lados deve ser sempre maior que
//o terceiro).
import java.util.Scanner;
public class Ex7EstruturaDeCondicionais {
    public static void main(String[] args){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a+b > c){
            System.out.println("Pode formar um tringulo");
        }
        else{
            System.out.println("Não pode formar um tringulo");
        }
    }
}
