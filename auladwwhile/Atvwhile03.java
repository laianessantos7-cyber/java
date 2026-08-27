// 3-Menu de Canetas
// Implemente um programa em Java que exiba um menu com três tipos de canetas: esferográfica, gel e tinteiro. 
// Ao escolher uma opção, o programa deve apresentar uma descrição sobre a caneta selecionada.
// O menu deve continuar sendo exibido até que o usuário escolha sair.
//Caneta Esferográfica: Econômica e de longa duração
//Caneta Gel: Tinta mais pigmentada e escrita suave
//Caneta Tinteiro: Clássica e elegante, usada para caligrafia

package auladwwhile;

import java.util.Scanner;

public class Atvwhile03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;

        while (op != 4) {

            System.out.println("\n====== MENU LOJA DE CANETAS ========");
            System.out.println("1 - Caneta Esferográfica");
            System.out.println("2 - Caneta Gel");
            System.out.println("3 - Caneta Tinteiro");
            System.out.println("4 - Sair");
            System.out.print("Escolha a opção: ");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println(" Caneta Esferográfica: Econômica e de longa duração.");
                    break;

                case 2:
                    System.out.println("Caneta Gel: Tinta mais pigmentada e escrita suave");
                    break;

                case 3:
                    System.out.println("Caneta Tinteiro: Clássica e elegante, usada para caligrafia");
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