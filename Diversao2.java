package Diversao;
import java.util.Scanner;

public class Diversao2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um número positivo: ");
            numero = sc.nextInt();
        }

        System.out.println("Número negativo digitado. Programa encerrado.");

        sc.close();
    }
}