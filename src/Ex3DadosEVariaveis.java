import java.util.Scanner;
//Exercício Proposto 3 – Cálculo da média
//Enunciado: Leia três notas, calcule a média aritmética e exiba o
//resultado com duas casas decimais.
public class Ex3DadosEVariaveis {
    public static void mian(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nota1,nota2,nota3,media;
        System.out.println("Nota 1");
        nota1 = scanner.nextDouble();
        System.out.println("Nota 2");
        nota2 = scanner.nextDouble();
        System.out.println("Nota 3");
        nota3 = scanner.nextDouble();
        media = (nota1+nota2+nota3)/3;
        System.out.println("Media = " + media);
    }
}
