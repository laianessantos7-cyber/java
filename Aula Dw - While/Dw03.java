import java.util.Scanner;

public class Dw03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Digite o numero: ");
        int limite =sc.nextInt();
        

        int numero=1;
        do{
            System.out.println(numero);
        }while(numero<=limite);
    sc.close();

    }
}
