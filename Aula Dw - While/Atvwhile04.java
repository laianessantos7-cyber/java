//4-Menu de Mochilas
//Desenvolva um programa em Java que apresente um menu com três tipos de mochilas: escolar, de viagem e esportiva.
//  O programa deve exibir informações sobre a mochila escolhida e permitir que o usuário continue explorando as opções até que decida encerrar o programa.

import java.util.Scanner;

public class Atvwhile04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;

        while (op != 4) {

            System.out.println("\n====== MENU LOJA DE MOCHILAS ========");
            System.out.println("1 - Mochila Escolar");
            System.out.println("2 - Mochila de Viagem");
            System.out.println("3 - Mochila Esportiva");
            System.out.println("4 - Sair");
            System.out.print("Escolha a opção: ");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println(" Mochila Escolar: Compacta e ideal para estudantes.");
                    break;

                case 2:
                    System.out.println("Mochila de Viagem: Espaçosa, ideal para longas jornadas");
                    break;

                case 3:
                    System.out.println("CMochila Esportiva: Leve, resistente e ergonômica");
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