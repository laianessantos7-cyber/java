package aulaarray;
public class VetArray03 {

    public static void main(String[] args) {

        int[] numero = {10, 20, 30, 40, 50};

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Posição " + i + " = " + numero[i]);
        }

        for (int n : numero) {
            System.err.println(n);
        }

    }
}