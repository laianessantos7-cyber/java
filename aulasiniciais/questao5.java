package aulasiniciais;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        scanner.close();
    }
}