import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[][] matriz = new int[3][3];


            System.out.println("Digite os valores da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }

            System.out.println("\nMatriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }


            System.out.println("\nSoma das linhas:");
            for (int i = 0; i < 3; i++) {
                int somaLinha = 0;
                for (int j = 0; j < 3; j++) {
                    somaLinha += matriz[i][j];
                }
                System.out.println("Linha " + i + ": " + somaLinha);
            }


            System.out.println("\nSoma das colunas:");
            for (int j = 0; j < 3; j++) {
                int somaColuna = 0;
                for (int i = 0; i < 3; i++) {
                    somaColuna += matriz[i][j];
                }
                System.out.println("Coluna " + j + ": " + somaColuna);
            }


        }
    }


