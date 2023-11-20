import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores cada vetor vai ter ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        System.out.println("Digite os valores do vetor A ");
        int[] vetorA = new int[n];
        for (int i = 0; i < n; i++) {
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B ");
        int[] vetorB = new int[n];
        for (int i = 0; i < n; i++) {
            vetorB[i] = sc.nextInt();
        }
        System.out.println("Vetor resultante, que é a soma dos elementos de A e B ");
        int[] vetorResultante = new int[n];
        for (int i = 0; i < n; i++) {
            vetorResultante[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorResultante[i]);
        }
    sc.close();
    }
}
