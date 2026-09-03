import java.util.Scanner;
public class Avaliativa{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int[] avioes = new int[4];
        int[] assentos = new int[4];


        String[] passageiros = new String[20];
        int[] aviaoReserva = new int[20];

        int qtdAvioes = 0;
        int qtdReservas = 0;
        int opcao = 0;

        while (opcao != 8) {

            System.out.println("\n=========================================");
            System.out.println("      SWEET FLIGHT - SISTEMA DE RESERVAS");
            System.out.println("=========================================");
            System.out.println("1 - Cadastrar aviões");
            System.out.println("2 - Cadastrar quantidade de assentos");
            System.out.println("3 - Listar aviões");
            System.out.println("4 - Realizar reserva");
            System.out.println("5 - Consultar reservas de um avião");
            System.out.println("6 - Pesquisar passageiro");
            System.out.println("7 - Mostrar resumo");
            System.out.println("8 - Sair");
            System.out.println("=========================================");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n============== CADASTRO DE AVIÕES ===============");

                    int quantidade;

                    System.out.print("Quantos aviões deseja cadastrar? ");
                    quantidade = sc.nextInt();

                    while (quantidade < 1 || quantidade > 4) {
                        System.out.println("Quantidade Inválida! Digite um número entre 1 e 4.");
                        System.out.print("Quantos aviões deseja cadastrar? ");
                        quantidade = sc.nextInt();
                    }

                    qtdAvioes = 0;

                    for (int i = 0; i < quantidade; i++) {

                        int numero;
                        boolean repetido;

                        System.out.print("Digite o número do avião " + (i + 1) + ": ");
                        numero = sc.nextInt();

                        repetido = true;

                        while (repetido) {

                            repetido = false;

                            for (int j = 0; j < i; j++) {

                                if (avioes[j] == numero) {
                                    repetido = true;
                                }
                            }

                            if (repetido) {
                                System.out.println("Esse avião já foi cadastrado!");
                                System.out.print("Digite outro número: ");
                                numero = sc.nextInt();
                            }
                        }

                        avioes[i] = numero;
                        qtdAvioes++;
                    }

                    System.out.println("Aviões cadastrados com sucesso!");

                    break;

        
                case 2:
                    System.out.println("\n============== CADASTRO DE ASSENTOS ===============");


                    if (qtdAvioes == 0) {

                        System.out.println("Nenhum avião cadastrado.");

                    } else {

                        for (int i = 0; i < qtdAvioes; i++) {

                            System.out.print(
                                    "Digite a quantidade de assentos do avião "
                                    + avioes[i] + ": "
                            );

                            assentos[i] = sc.nextInt();

                            while (assentos[i] < 0 || assentos[i] > 20) {

                                System.out.println("Quantidade Inválida! Digite um número entre 0 e 20.");

                                System.out.print("Digite novamente: ");
                                assentos[i] = sc.nextInt();
                            }
                        }

                        System.out.println("Assentos cadastrados com sucesso!!");
                    }
                    break;
                case 3:
                    System.out.println("\n============== LISTA DE TODOS OS AVIÕES ===============");
                    if (qtdAvioes == 0) {

                        System.out.println("Nenhum avião cadastrado.");

                    } else {

                        System.out.println("\n ===== AVIÕES CADASTRADOS =====");

                        for (int i = 0; i < qtdAvioes; i++) {

                            System.out.println(
                                    "Avião: " + avioes[i]
                                    + " | Assentos disponíveis: "
                                    + assentos[i]
                            );
                        }
                    }

                    break;

                case 4:

                    if (qtdAvioes == 0) {

                        System.out.println("Nenhum avião cadastrado.");

                    } else if (qtdReservas >= 20) {

                        System.out.println("Limite de 20 reservas atingido!");

                    } else {

                        int numeroAviao;
                        int posicao = -1;

                        System.out.print("Digite o número do avião: ");
                        numeroAviao = sc.nextInt();
                        sc.nextLine();

                    
            
                        for (int i = 0; i < qtdAvioes; i++) {

                            if (avioes[i] == numeroAviao) {
                                posicao = i;
                            }
                        }

                        if (posicao == -1) {

                            System.out.println("Este avião não existe!");

                        } else if (assentos[posicao] == 0) {

                            System.out.println(
                                    "Não há assentos disponíveis para este avião!"
                            );

                        } else {

                            String nome;

                            System.out.print("Digite o nome do passageiro: ");
                            nome = sc.nextLine();

                            while (nome.trim().isEmpty()) {

                                System.out.println("O nome não pode ficar vazio!");
                                System.out.print("Digite o nome do passageiro: ");
                                nome = sc.nextLine();
                            }

                            passageiros[qtdReservas] = nome;
                            aviaoReserva[qtdReservas] = numeroAviao;

                            assentos[posicao]--;
                            qtdReservas++;

                            System.out.println("Reserva realizada com sucesso!");
                        }
                    }

                    break;

        
                case 5:

                    if (qtdAvioes == 0) {

                        System.out.println("Nenhum avião cadastrado.");

                    } else {

                        int numeroAviao;
                        boolean existe = false;
                        boolean encontrouReserva = false;

                        System.out.print("Digite o número do avião: ");
                        numeroAviao = sc.nextInt();

                        // Verificar se o avião existe
                        for (int i = 0; i < qtdAvioes; i++) {

                            if (avioes[i] == numeroAviao) {
                                existe = true;
                            }
                        }

                        if (!existe) {

                            System.out.println("Este avião não existe!");

                        } else {

                            System.out.println("\n--- RESERVAS DO AVIÃO "
                                    + numeroAviao + " ---");

                            for (int i = 0; i < qtdReservas; i++) {

                                if (aviaoReserva[i] == numeroAviao) {

                                    System.out.println(
                                            "Passageiro: " + passageiros[i]
                                    );

                                    encontrouReserva = true;
                                }
                            }

                            if (!encontrouReserva) {

                                System.out.println(
                                        "Não há reservas realizadas para este avião!"
                                );
                            }
                        }
                    }

                    break;

                
                case 6:
                        System.out.println("\n============== PESQUISAR PASSAGEIRO ===============");


                    if (qtdReservas == 0) {

                        System.out.println(
                                "Não há reservas realizadas para este passageiro!"
                        );

                    } else {

                        String nomePesquisa;
                        boolean encontrou = false;

                        System.out.print("Digite o nome do passageiro: ");
                        nomePesquisa = sc.nextLine();

                        for (int i = 0; i < qtdReservas; i++) {

                            if (passageiros[i].equalsIgnoreCase(nomePesquisa)) {

                                System.out.println(
                                        "Passageiro: " + passageiros[i]
                                        + " | Avião: " + aviaoReserva[i]
                                );

                                encontrou = true;
                            }
                        }

                        if (!encontrou) {

                            System.out.println(
                                    "Não há reservas realizadas para este passageiro!"
                            );
                        }
                    }

                    break;


                case 7:

                    if (qtdAvioes == 0) {

                        System.out.println("Nenhum avião cadastrado.");

                    } else {

                        int totalAssentos = 0;
                        int avioesComAssentos = 0;
                        int avioesSemAssentos = 0;

                        int maiorAssento = assentos[0];
                        int aviaoMaiorAssento = avioes[0];

                        for (int i = 0; i < qtdAvioes; i++) {

                            totalAssentos += assentos[i];

                            if (assentos[i] > 0) {
                                avioesComAssentos++;
                            }

                            if (assentos[i] == 0) {
                                avioesSemAssentos++;
                            }

                            if (assentos[i] > maiorAssento) {

                                maiorAssento = assentos[i];
                                aviaoMaiorAssento = avioes[i];
                            }
                        }

                        System.out.println("\n========== RESUMO ==========");
                        System.out.println(
                                "Quantidade de aviões cadastrados: "
                                + qtdAvioes
                        );

                        System.out.println(
                                "Quantidade total de reservas: "
                                + qtdReservas
                        );

                        System.out.println(
                                "Quantidade total de assentos disponíveis: "
                                + totalAssentos
                        );

                        System.out.println(
                                "Aviões com assentos disponíveis: "
                                + avioesComAssentos
                        );

                        System.out.println(
                                "Aviões sem assentos disponíveis: "
                                + avioesSemAssentos
                        );

                        System.out.println(
                                "Avião com maior quantidade de assentos: "
                                + aviaoMaiorAssento
                                + " (" + maiorAssento + " assentos)"
                        );
                    }

                    break;


                case 8:

                    System.out.println("Sistema encerrado. Até logo!");

                    break;


                default:

                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}