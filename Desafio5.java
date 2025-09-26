import java.util.Random;
import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        char[][] mar = new char[7][7];

        boolean[][] navios = new boolean[7][7];

        int naviosRestantes = 3;



        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mar[i][j] = '~';
            }
        }



        int colocados = 0;
        while (colocados < 3) {
            int linha = rand.nextInt(7);
            int coluna = rand.nextInt(7);
            if (!navios[linha][coluna]) {
                navios[linha][coluna] = true;
                colocados++;
            }
        }



        while (naviosRestantes > 0) {


            System.out.println("\n🌊 Batalha Naval 🌊");
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(mar[i][j] + " ");
                }
                System.out.println();
            }



            System.out.print("Digite a linha (0-6): ");
            int linha = sc.nextInt();
            System.out.print("Digite a coluna (0-6): ");
            int coluna = sc.nextInt();



            if (linha < 0 || linha > 6 || coluna < 0 || coluna > 6) {
                System.out.println("🚫 Coordenada inválida! Tente novamente.");
                continue;
            }



            if (mar[linha][coluna] != '~') {
                System.out.println("⚠️ Você já atirou aqui!");
                continue;
            }



            if (navios[linha][coluna]) {
                System.out.println("💥 Acertou um navio!");
                mar[linha][coluna] = 'X';
                naviosRestantes--;
            } else {
                System.out.println("🌊 Água...");
                mar[linha][coluna] = 'O';
            }
        }


        0

        System.out.println("\n🏆 Parabéns! Você afundou todos os navios!");
        sc.close();
    }
}
