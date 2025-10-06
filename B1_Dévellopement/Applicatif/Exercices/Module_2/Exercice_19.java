package B1_Dévellopement.Applicatif.Exercices.Module_2;

import java.util.Random;
import java.util.Scanner;

public class Exercice_19 {
    public static void main(String[] args) throws Exception {
        Scanner clavier = new Scanner(System.in);
        Random randomNumbers = new Random();

        int random = randomNumbers.nextInt(100) + 1;

        System.out.println("je pense à un nombre entre 1 et 100 inclus. Devines lequel");
        System.out.println("entrez un nombre ");
        int nb = clavier.nextInt();
        clavier.close();

        System.out.println("Vous proposez : " + nb);
        System.out.println("le nombre auquel je pense était : " + random);

        int diff = random - nb;
        if (diff > 0) {
            System.out.println("Dommage, il vous manquait " + diff);
        } else if (diff < 0) {
            System.out.println("Dommage, vous avez dépassez de " + (-diff));
        } else {
            System.out.println("Bravo, vous avez trouvé le nombre auquel je pensais !");
        }
    }
}