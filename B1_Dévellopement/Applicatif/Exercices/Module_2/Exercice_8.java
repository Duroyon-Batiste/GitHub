package B1_Dévellopement.Applicatif.Exercices.Module_2;

import java.util.Scanner;

public class Exercice_8 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un numéro de mois (1-12) : ");
        int moi = scanner.nextInt();
        scanner.close();

        if (moi == 1) {
            System.out.print(31);
        } else if (moi == 2) {
            System.out.print(28);
        } else if (moi == 3) {
            System.out.print(31);
        } else if (moi == 4) {
            System.out.print(30);
        } else if (moi == 5) {
            System.out.print(31);
        } else if (moi == 6) {
            System.out.print(30);
        } else if (moi == 7) {
            System.out.print(31);
        } else if (moi == 8) {
            System.out.print(31);
        } else if (moi == 9) {
            System.out.print(30);
        } else if (moi == 10) {
            System.out.print(31);
        } else if (moi == 11) {
            System.out.print(30);
        } else if (moi == 12) {
            System.out.print(31);
        } else {
            System.out.print("Numéro de mois invalide.");
        }
    }
}