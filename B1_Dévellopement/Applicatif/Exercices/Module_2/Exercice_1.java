package B1_Dévellopement.Applicatif.Exercices.Module_2;
import java.util.Scanner;

public class Exercice_1 {
    public static void main(String[] args) throws Exception {
        // Récupérer l'entier
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int entier = clavier.nextInt();
        clavier.close();

        // Vérifier sa divisibilité par 2
        if (entier % 2 == 0) {
            System.out.print(entier + " est pair.");
        } else {
            System.out.print(entier + " n'est pas pair.");
        }
    }
}