//Exercício Proposto 3 – Volume de um Silo Cilíndrico
//Problema: O usuário deve informar o raio da base e a altura do silo
//(em metros). O algoritmo deve calcular o volume usando a fórmula:
//V = π . r2. h
import java.util.Scanner;
import java.lang.Math;
public class Ex3 {
    public static void main(String[] args)
    {
        double raio,altura,volume;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Base");
        raio = scanner.nextDouble();
        System.out.println("Altura");
        altura = scanner.nextDouble();
        volume = Math.PI * Math.pow(raio,2)*altura;
        System.out.println("Volume = " + volume);
    }
}
