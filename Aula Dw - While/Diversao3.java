import java.util.Scanner;

public class Diversao3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "";

        while (!nome.equals("Anderson")) {
            System.out.print("Digite o nome do professor mais fofo do SENAI: ");
            nome = sc.nextLine();
        }

        System.out.println("Acertou.");

        sc.close();
    }
}