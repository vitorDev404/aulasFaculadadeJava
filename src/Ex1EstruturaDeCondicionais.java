//Exercício Proposto 1 – Fixação
//• Enunciado: Receba um número inteiro e exiba se ele é Positivo ou
//Negativo (considere zero como positivo).
import java.util.Scanner;
public class Ex1EstruturaDeCondicionais {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1;
        System.out.println("Numero");
        n1 = scanner.nextInt();
        if (n1 < 0){
            System.out.print("Numero negativo");
        }
        else{
            System.out.print("Numero positivo");
        }
    }
}
