package aulacondicional;
import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        String senhaCorreta = "Acesso1234";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a senha de acesso: ");
        
        String senha= sc.nextLine();
        
        if (senha.equals(senhaCorreta)) {
            System.out.println("PORTA ABERTA");
        } else {
            System.out.println("SENHA NAO CONFERE");
        }
        
        sc.close();
    }
}