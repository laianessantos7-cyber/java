//1-Escreva um programa que solicite ao usuário uma senha numérica de 4 dígitos. O programa deve repetir
// a leitura até que a senha digitada seja igual a 2024. Quando acertar, exiba "Acesso Permitido".

package auladwwhile;


import java.util.Scanner;

public class Atvwhile01 {
     public static void main(String[] args) {

      Scanner sc= new Scanner (System.in);
      String senha= "";
      
      while (!senha.equals("2024")) {
      System.out.println("Informe a senha: ");
      senha=sc.nextLine();
      }
        System.out.println("Acesso permitido!");



        sc.close();
      }
    }