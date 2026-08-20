// 2. Menu de Embalagens Crie um programa em Java que apresente um menu interativo sobre diferentes tipos de embalagens.
// O usuário poderá escolher entre três opções: caixa de papelão, sacola plástica e embalagem de vidro.
//  O programa deve exibir uma breve descrição da embalagem escolhida. O menu deve se repetir até que o usuário selecione a opção de sair.
// Caixa de papelão: Ideal para transporte e armazenamento
//Sacola plástica: Leve e prática, mas pouco sustentável
//Embalagem de vidro: Resistente e reutilizável .

import java.util.Scanner;

public class Atvwhile02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;

        while (op != 4) {

            System.out.println("\n====== MENU LOJA DE EMBALAGENS ========");
            System.out.println("1 - Caixa de Papelão");
            System.out.println("2 - Sacola Plástica");
            System.out.println("3 - Embalagem de Vidro");
            System.out.println("4 - Sair");
            System.out.print("Escolha a opção: ");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Caixa de papelão: Ideal para transporte e armazenamento");
                    break;

                case 2:
                    System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável");
                    break;

                case 3:
                    System.out.println("Embalagem de vidro: Resistente e reutilizável.");
                    break;

                case 4:
                    System.out.println("Saindo do Menu.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}