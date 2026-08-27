package Aulas;
public class NotaFiscal {
    public static void main(String[] args) {
        
        String nome_cliente = " João Silva";
        String produto = " Mouse Gamer";
        int quantidade =3;
        double preco_unitario= 45.90;
        double total = quantidade * preco_unitario;


        System.out.println("---------- NOTA FISCAL ----------");

        System.out.printf("Cliente: %s%n", nome_cliente);
        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Preço Unitário: R$ %.2f%n", preco_unitario);
        System.out.printf("Total: R$ %.2f%n", total);
        System.out.println("----------------------------------");



        }
    
}
