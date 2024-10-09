import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        leMarathonDeCalculs();
    }

    public static void leMarathonDeCalculs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");

        int nb = scanner.nextInt();
        int somme = 0;
        int[] sommesPartielles = new int[nb];

        for (int i = 1; i <= nb; i++) {
            somme += i;
            sommesPartielles[i - 1] = somme;
        }

        System.out.println("Sommes partielles : " + Arrays.toString(sommesPartielles));
        scanner.close();
    }
}