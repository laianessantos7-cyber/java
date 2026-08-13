import java.util.Scanner;

public class questao1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        String numero1 = sc.nextLine();
        double N1 = Double.parseDouble(numero1);
        System.out.println("Informe o segundo número:");
        String numero2 = sc.nextLine();
        double N2 = Double.parseDouble(numero2);

        double soma = N1 + N2;
        double subtracao = N1 - N2;
        double multiplicacao = N1 * N2;
        double divisao = N1 / N2;


        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

    }
}
