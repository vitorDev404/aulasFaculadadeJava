//Exercício Proposto 4 – Lógica
//• Enunciado: Receba duas notas, calcule a média aritmética entre as
//notas e imprima o resultado:
//"Aprovado" (média >= 6.0); ou
//"Exame" (média < 6.0).
//• Obs.: Não utilize else.
import java.util.Scanner;
public class Ex3EstruturasDeCondicionais {
    public static void main(String[] args){
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
        System.out.println("Exame: "+media);
    }
}
