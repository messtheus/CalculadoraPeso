import java.util.Scanner;

public class ConversorRealParaPesoArgentino {
    public static void main(String[] args) {
        // Definindo a taxa de câmbio (1 real brasileiro = 13,38 pesos argentinos)
        double taxaDeCambio = 169.8586; // 13.38;

        // Criando um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando a quantidade em reais para conversão
        System.out.print("Digite a quantidade em reais brasileiros: ");
        double quantidadeEmReais = scanner.nextDouble();

        // Calculando a quantidade equivalente em pesos argentinos
        double quantidadeEmPesosArgentinos = quantidadeEmReais * taxaDeCambio;

        // Exibindo o resultado da conversão
        System.out.println(quantidadeEmReais + " reais brasileiros equivalem a " + quantidadeEmPesosArgentinos + " pesos argentinos.");

        // Fechando o scanner
        scanner.close();
    }
}
