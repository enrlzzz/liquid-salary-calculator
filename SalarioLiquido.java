package salarioliquido;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora-aula (em R$): ");
        double valorHoraAula = scanner.nextDouble();

        System.out.print("Digite o número de aulas dadas no mês: ");
        double numeroAulas = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto do INSS (ex: 8.5 para 8.5%): ");
        double percentualINSS = scanner.nextDouble();

        scanner.close();

        double salarioBruto = valorHoraAula * numeroAulas;

        double valorINSS = salarioBruto * (percentualINSS / 100);

        double salarioLiquido = salarioBruto - valorINSS;

        System.out.println("\n--- Resumo do Salário ---");
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto do INSS (%.1f%%): R$ %.2f%n", percentualINSS, valorINSS);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

    }

}
