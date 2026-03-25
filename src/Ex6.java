//Exercício Proposto 6 – Teorema de Pitágoras Aplicado
//• Problema Leia os valores dos dois catetos de um triângulo retângulo.
//Calcule e exiba o valor da hipotenusa usando a fórmula de Pitágoras.
//• Requisito: Utilize Math.sqrt() para a raiz quadrada e realize o cálculo
//em uma única linha de processamento.
import java.util.Scanner;
import java.lang.Math;
public class Ex6 {
    public static void main (String[] args){
        double cateto1,cateto2,hip,cateto1Quad,cateto2Quad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cateto 1");
        cateto1 = scanner.nextInt();
        System.out.println("Cateto 2");
        cateto2 = scanner.nextInt();
        cateto1Quad = Math.pow(cateto1,2);
        cateto2Quad = Math.pow(cateto2,2);
        hip = Math.sqrt(cateto1Quad+cateto2Quad);
        System.out.println("Hipotenusa = "+hip);
    }
}
