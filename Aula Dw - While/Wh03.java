import java.util.Scanner;

public class Wh03 {
    public static void main(String[] args) {
      System.out.println("Informe o numero: ");
      Scanner sc= new Scanner (System.in);

      int limite = sc.nextInt();
      int numero =1;
      while (numero<=limite){
        System.out.println(numero);
        numero++;
        sc.close();
      }
    }
}
