//Exercício Proposto 3 – Lógica
//• Enunciado: Receba duas notas, calcule a média aritmética entre as
//notas e imprima o resultado:
//"Aprovado" (média >= 6.0); ou
//"Exame" (média < 6.0).
//• Obs.: Utilize if-else.
import java.util.Scanner;
public class Ex2EstruturaDeCondicional {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2,media;
        System.out.print("Nota 1");
        nota1= scanner.nextDouble();
        System.out.print("Nota 2");
        nota2= scanner.nextDouble();
        media=(nota1+nota2)/2;
        if (media >= 6.0){
            System.out.println("Aprovado: "+media);
        }
        else{
            System.out.println("Exame: "+media);
        }
    }
}
