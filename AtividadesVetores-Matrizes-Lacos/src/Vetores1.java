import java.util.Scanner;

public class Vetores1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0, menor = 0;


        int [] numero = new int[10];
        System.out.println("Digite 10 numeros Inteiros: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + ( i + 1) + "° Numero inteiro: ");
            numero[i] = sc.nextInt();

            if (i == 0){
                maior = numero[i];
                menor = numero[i];
            } else {
                if (numero[i] > maior){
                    maior = numero[i];
                }if (numero[i] < menor){
                    menor = numero[i];
                }
            }

        }
        System.out.println("Numeros Digitados: ");
        for (int i = 0; i < 10; i++){
            System.out.println(numero[i]);
            if ( i < 9) System.out.println(", ");
        }
        System.out.println();

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);



    }
}
