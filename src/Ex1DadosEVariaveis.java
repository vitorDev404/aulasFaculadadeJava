//▪ Exercício Proposto 1 – Armazenamento e apresentação
//• Enunciado: Crie variáveis para armazenar seu nome, idade e altura.
//Exiba-as formatadas no console.
import java.util.Scanner;
import java.lang.String;
public class Ex1DadosEVariaveis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        System.out.println("Nome");
        nome = scanner.nextLine();
        System.out.println("Idade");
        idade = scanner.nextInt();
        System.out.println("Altura");
        altura = scanner.nextDouble();
        System.out.println(nome + idade +altura);
    }
}
