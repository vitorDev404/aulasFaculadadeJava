//Exercício Proposto 5 – Lógica
//• Enunciado: Receba um número e informe se ele é múltiplo de 5 e
//múltiplo de 3 ao mesmo tempo.
import java.util.Scanner;
public class Ex5EstruturaDeCondicionais {
    public static void main(String[] args){
        int numero1;
        Scanner scanner = new Scanner(System.in);
        numero1 = scanner.nextInt();
        if (numero1%5==0 && numero1%3==0){
            System.out.println("Numero divisivel por 3 e 5");
        }
        else{
            System.out.println("Numero nao divisivel por 3 e 5");
        }
    }
}
