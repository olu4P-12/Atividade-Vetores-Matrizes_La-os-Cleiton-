import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][2];
        int[][] transposta = new int[2][3];


        System.out.println("Digite os valores da matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }


        System.out.println("\nMatriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nMatriz Transposta 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }


    }
}


