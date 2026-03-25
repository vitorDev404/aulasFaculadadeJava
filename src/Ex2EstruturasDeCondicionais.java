//Exercício Proposto 2 – Fixação
//• Enunciado: Receba a idade de um nadador e imprima "Categoria
//Adulta" se ele tiver 18 anos ou mais.
import java.util.Scanner;
public class Ex2EstruturasDeCondicionais {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.print("Idade:");
        idade = scanner.nextInt();
        if (idade > 18) {
            System.out.print("Categoria Adulta");
        }
        else{
            System.out.print("Categoria Infantil");
        }
    }
}
