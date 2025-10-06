package B1_Dévellopement.Applicatif.Exercices.Module_2;

import java.util.Scanner;

public class Exercice_9 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une annee : ");
        int annee = scanner.nextInt();
        scanner.close();

        if (annee % 4 == 0) {
            if (annee % 100 == 0) {
                if (annee % 400 == 0) {
                    System.out.print("Cette année est bissextile.");
                } else {
                    System.out.print("Cette année n'est pas bissextile.");
                }
            } else {
                System.out.print("Cette année est bissextile.");
            }
        } else {
            System.out.print("Cette année n'est pas bissextile.");
        }
    }
}
