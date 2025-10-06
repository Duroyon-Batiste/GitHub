package B1_Dévellopement.Applicatif.Exercices.Module_2;
import java.util.Scanner;
public class Exercice_5 {
    public static void main(String[] args) throws Exception {
        // Récupérer lé couleur
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez une string : ");
        String input = clavier.next();
        clavier.close();
        
        char premiercarac = input.charAt(0);
        System.out.print(Character.isUpperCase(premiercarac));
    }
}