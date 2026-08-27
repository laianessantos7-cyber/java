package aulasiniciais;
import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = sc.nextDouble();

        System.out.println("Digite o terceiro número:");
        double numero3 = sc.nextDouble();

        double media = (numero1 + numero2 + numero3) /3;

        System.out.println("A média é: " + media);
        sc.close();
    }
}
