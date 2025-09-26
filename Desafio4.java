import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[5];
        double[][] notas = new double[5][2];
        double[] medias = new double[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            alunos[i] = sc.nextLine();

            for (int j = 0; j < 2; j++) {
                System.out.print("Nota " + (j + 1) + " de " + alunos[i] + ": ");
                notas[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }


        for (int i = 0; i < 5; i++) {
            medias[i] = (notas[i][0] + notas[i][1]) / 2.0;
        }


        System.out.println("\n📊 Médias dos Alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s → Média: %.2f%n", alunos[i], medias[i]);
        }

        sc.close();
    }
}
