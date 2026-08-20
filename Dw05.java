import java.util.Scanner;

public class Dw05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;

        do {
            System.out.println("1 - Iniciar o jogo");
            System.out.println("2 - Carregar o jogo");
            System.out.println("3 - Configurações");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Iniciando o jogo...");
                    break;

                case 2:
                    System.out.println("Carregando o jogo.");
                    break;

                case 3:
                    System.out.println("Abrindo configurações");
                    break;

                case 0:
                    System.out.println("Saindo.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (op != 0);

        sc.close();
    }
}