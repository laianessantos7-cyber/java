import java.util.Scanner;

public class VetArray07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        // Cadastrar
        System.out.println("=== Cadastro de Nomes ===");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] = sc.nextLine();
        }

        // Listar
        System.out.println("\nLista atual:");
        listar(nomes);

        // Alterar
        System.out.println("\nDigite a posição para alterar (0 a 2): ");
        int posAlterar = sc.nextInt();
        sc.nextLine();

        if (posAlterar >= 0 && posAlterar < nomes.length) {
            System.out.println("Digite o novo nome: ");
            nomes[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista atualizada:");
        listar(nomes);

        // Remover
        System.out.println("\nDigite a posição para remover (0 a 2): ");
        int posRemover = sc.nextInt();

        if (posRemover >= 0 && posRemover < nomes.length) {

            for (int i = posRemover; i < nomes.length - 1; i++) {
                nomes[i] = nomes[i + 1];
            }

            nomes[nomes.length - 1] = null;

            System.out.println("\nLista após remoção:");
            listar(nomes);

        } else {
            System.out.println("Posição inválida!");
        }

        sc.close();
    }

    public static void listar(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }
}