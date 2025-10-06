package B1_Dévellopement.Applicatif.Exercices.Module_2;
import java.util.Scanner;

public class Exercice_4 {
    public static void main(String[] args) throws Exception {
        // Récupérer lé couleur
        Scanner clavier = new Scanner(System.in);
        System.out.print("Quelle couleur souhaitez vous : ");
        String input = clavier.next();
        clavier.close();
        input.toUpperCase();

        if (input.equals("R")) {
            System.out.print("Vous avez choisi le Rouge");
        } else if (input.equals("V")) {
            System.out.print("Vous avez choisi le Vert");
        } else if (input.equals("B")) {
            System.out.print("Vous avez choisi le Bleu");
        } else {
            System.out.print("connais pas");
        }
    }
}