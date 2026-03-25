//Exercício Proposto 6 – Desafio
//• Enunciado: Leia o ano de nascimento de uma pessoa e o ano atual.
//Informe se ela já tem idade para votar (16 anos ou mais) e se possui
//idade para dirigir (18 anos ou mais).
import java.util.Scanner;
public class Ex6EstruturasDeCondicionais {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int anoNasc, anoAtual,idade;
        System.out.println("Ano de nasc:");
        anoNasc = scanner.nextInt();
        System.out.println("Ano atual:");
        anoAtual = scanner.nextInt();
        idade = anoAtual - anoNasc;
        if (idade >= 16){
            System.out.println("Pode votar");
        }
        else{
            System.out.println("Não pode votar");
        }
    }
}
