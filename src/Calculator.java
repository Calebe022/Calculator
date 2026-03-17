import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        System.out.println("===== CALCULADORA =====");

        while (opcao != 5) {

            // Mostrar o menu
            System.out.println("\n1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            // Ler a opção do usuário
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            //  Verificar se é sair
            if (opcao == 5) {
                System.out.println("Saindo da calculadora...");
                break; // sai do loop
            }

            // Pedir os números
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = teclado.nextInt();
            System.out.print("Digite o segundo número: ");
            int segundoNumero = teclado.nextInt();

            // Executar a operação escolhida
            if (opcao == 1) {
                int resultado = primeiroNumero + segundoNumero;
                System.out.println("Resultado da soma: " + resultado);
            } else if (opcao == 2) {
                int resultado = primeiroNumero - segundoNumero;
                System.out.println("Resultado da subtração: " + resultado);
            } else if (opcao == 3) {
                int resultado = primeiroNumero * segundoNumero;
                System.out.println("Resultado da multiplicação: " + resultado);
            } else if (opcao == 4) {
                if (segundoNumero != 0) {
                    double resultado = (double) primeiroNumero / segundoNumero;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        teclado.close(); // fecha scanner
    }
}