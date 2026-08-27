package aulacondicional;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1;
        double n2;
        double resultado;
        char operador;

        System.out.println("Informe o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("Digite uma operação (+, -, * ou /): ");
        operador = sc.next().charAt(0);

        if (operador == '+') {
            resultado = n1 + n2;
            System.out.println("Resultado: " + resultado);
        } 
        else if (operador == '-') {
            resultado = n1 - n2;
            System.out.println("Resultado: " + resultado);
        } 
        else if (operador == '*') {
            resultado = n1 * n2;
            System.out.println("Resultado: " + resultado);
        } 
        else if (operador == '/') {
            resultado = n1 / n2;
            System.out.println("Resultado: " + resultado);
        } 
        else {
            System.out.println("Operação inválida!");
        }

        sc.close();
    }
}