import java.util.Scanner;

//Exercício Proposto 4 – Consumo Energético Residencial
//Problema: Leia a potência de um aparelho (em Watts), as horas de uso
//por dia e o preço do KWh cobrado pela concessionária. Calcule o custo
//mensal (30 dias) desse aparelho.
//Requisito: Exiba o custo final formatado com System.out.printf("%.2f").

public class Ex4JavaESequencial {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double potencia, horas, valor, custoTotal;
        System.out.println("Potecnia");
        potencia = scanner.nextDouble();
        System.out.println("Horas usadas");
        horas = scanner.nextDouble();
        System.out.println("Valor");
        valor = scanner.nextDouble();
        custoTotal = (potencia * horas) * valor;
        System.out.printf("Custo total é igual a %.2f:", custoTotal);
    }
}

