import java.util.Scanner;
//Exercício Proposto 5 – Cálculo do IMC
//• Enunciado: Calcule o IMC ( Peso / Altura2 ). Use Math.pow ou
//multiplicação simples para obter o quadrado.
public class Ex5DadosEVariaveis {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double peso,altura, imc;
        System.out.println("Peso");
        peso = scanner.nextDouble();
        System.out.println("Altura");
        altura = scanner.nextDouble();
        imc = (peso/Math.pow(altura,2));
        System.out.println("IMC: "+ imc);
    }
}
