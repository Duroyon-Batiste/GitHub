package B1_Dévellopement.Applicatif.Exercices.Module_3;

import java.util.Scanner;

public class Motif_14_bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez la taille du motif : ");
        int size = clavier.nextInt();
        clavier.close();
        int width = size * 4;
        
        for (int line = 0; line < size; line++) {
            System.out.print("*".repeat(line * 2));
            System.out.print("&".repeat((width / 4) - line));
            System.out.print("*".repeat((width / 2) - (line*2)));
            System.out.print("&".repeat((width / 4) - line));
            System.out.print("*".repeat(line * 2));
            System.out.println();
        }
    }
}
