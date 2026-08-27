package aulacondicional;

import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        if (numero > 0) {
            System.out.println("O número " + numero + " é POSITIVO.");
        }
        else if (numero < 0) {
            System.out.println("O número " + numero + " é NEGATIVO.");
        }
        else {
            System.out.println("O número é NULO (zero).");
        }
        
        sc.close();
    }
}