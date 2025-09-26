import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    char[][] tabuleiro = new char[3][3];


        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            tabuleiro[i][j] = ' ';
        }
    }

    boolean jogadorX = true;


        for (int jogada = 1; jogada <= 9; jogada++) {
        System.out.println("\nJogador " + (jogadorX ? "X" : "O"));


        System.out.print("Digite a linha (0-2): ");
        int linha = sc.nextInt();
        System.out.print("Digite a coluna (0-2): ");
        int coluna = sc.nextInt();


        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
            System.out.println("Posição inválida! Tente novamente.");
            jogada--;
            continue;
        }


        tabuleiro[linha][coluna] = jogadorX ? 'X' : 'O';


        exibirTabuleiro(tabuleiro);


        jogadorX = !jogadorX;
    }

        sc.close();
}


public static void exibirTabuleiro(char[][] tabuleiro) {
    System.out.println("\nTabuleiro:");
    for (int i = 0; i < 3; i++) {
        System.out.print(" ");
        for (int j = 0; j < 3; j++) {
            System.out.print(tabuleiro[i][j]);
            if (j < 2) System.out.print(" | ");
        }
        System.out.println();
        if (i < 2) System.out.println("---+---+---");
    }
}
}

