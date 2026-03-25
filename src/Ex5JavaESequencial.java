//Exercício Proposto 5 – Cálculo de Custo de Pavimentação
//• Problema O usuário informa o raio da praça e o valor do metro
//quadrado (m2) do piso desejado. O programa deve calcular:
//A área total da praça e o custo total do material.
import java.util.Scanner;
import java.lang.Math;
public class Ex5JavaESequencial {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double raio,valor,area;
        System.out.println("Raio");
        raio = scanner.nextDouble();
        System.out.println("Valor");
        valor = scanner.nextDouble();
        area = (Math.PI*Math.pow(raio,2))*valor;
        System.out.println("area" + area);
    }
}
