package aulasiniciais;
import java.util.Scanner;

public class questao4{
    public static void main(String[] args) {

        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Digite a Força:");
        double F = sc.nextDouble();
        
        System.out.println("Digite a Distância:");
        double D = sc.nextDouble();

        double T = F * D;
        System.out.println("O Trabalho é: " +T);


        sc.close();
    }
}

