import java.util.Scanner;

public class Q7{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cor;
        int preco;

        System.out.println("Digite a cor:");
        cor = sc.nextLine().toUpperCase();

        if (cor.equals("VERDE")) {
            preco = 10;
        } else if (cor.equals("AZUL")) {
            preco = 20;
        } else if (cor.equals("AMARELO")) {
            preco = 30;
        } else if (cor.equals("VERMELHO")) {
            preco = 40;
        } else {
            preco = 0;
        }

        if (preco != 0) {
            System.out.println("O preço é: R$ " + preco);
        } else {
            System.out.println("Cor inválida!");
        }

        sc.close();
    }
}