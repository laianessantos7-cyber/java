import java.util.Scanner;
public class diversaoarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];

        int[] quantidade = new int[5];

        int qtd = 0;

        int opcao;

        do {

            System.out.println("\n=== SISTEMA DA LOJA ===");

            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair");

            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            // 1- Cadastrar

            if (opcao == 1) {

                if (qtd < 5) {

                    System.out.println("Digite o nome do produto:");

                    nomes[qtd] = sc.nextLine();

                    System.out.println("Digite a quantidade:");

                    quantidade[qtd] = sc.nextInt();

                    sc.nextLine();

                    qtd++;

                    System.out.println("Produto Cadastrado!");

                } else {

                    System.out.println("Quantidade máxima atingida!");
                }
            }

            //2-  Listar

            if (opcao == 2) {

                System.out.println("\n=========== PRODUTOS CADASTRADOS ==========");

                for (int i = 0; i < qtd; i++) {

                    System.out.println(
                        "Índice: " + i +
                        " | Nome: " + nomes[i] +
                        " | Quantidade: " + quantidade[i]
                    );
                }
            }

            //3- Pesquisar

            if (opcao == 3) {

                System.out.println("Digite o nome do produto:");

                String pesquisa = sc.nextLine();

                for (int i = 0; i < qtd; i++) {

                    if (nomes[i].equalsIgnoreCase(pesquisa)) {

                        System.out.println("Produto encontrado!");

                        System.out.println("Indice: " + i);

                        System.out.println("Nome: " + nomes[i]);

                        System.out.println("Quantidade: " + quantidade[i]);
                    }
                }
            }

            //4- Alterar

            if (opcao == 4) {

                System.out.println("Digite o nome do produto que deseja alterar:");

                String pesquisa = sc.nextLine();

                for (int i = 0; i < qtd; i++) {

                    if (nomes[i].equalsIgnoreCase(pesquisa)) {

                        System.out.println("Digite o novo nome:");

                        nomes[i] = sc.nextLine();

                        System.out.println("Digite a nova quantidade:");

                        quantidade[i] = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Produto alterado com sucesso!");
                    }
                }
            }

            // 5- Remover

            if (opcao == 5) {

                System.out.println("Digite o nome do produto que deseja remover:");

                String pesquisa = sc.nextLine();

                for (int i = 0; i < qtd; i++) {

                    if (nomes[i].equalsIgnoreCase(pesquisa)) {

                        for (int j = i; j < qtd - 1; j++) {

                            nomes[j] = nomes[j + 1];

                            quantidade[j] = quantidade[j + 1];
                        }

                        qtd--;

                        nomes[qtd] = null;

                        quantidade[qtd] = 0;

                        System.out.println("Produto removido com sucesso!");
                    }
                    
                }
            }

        } while (opcao != 6); // 6- Sair

        sc.close();
    }
}