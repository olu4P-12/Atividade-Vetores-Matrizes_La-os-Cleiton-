import java.util.Random;
import java.util.Scanner;

public class Vetores2 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];
        System.out.println("Receba 15 numeros Aleatorios entre 1 e 100");

        for (int i = 0; i < 15; i++) {
            numeros[i] = random.nextInt(100) + 1;


        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " È PAR");
            } else {
                System.out.println(numeros[i] + " È IMPAR");
            }


        }
    }
}
