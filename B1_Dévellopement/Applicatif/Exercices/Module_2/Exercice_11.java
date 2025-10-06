package B1_Dévellopement.Applicatif.Exercices.Module_2;

import java.time.YearMonth;
import java.util.Scanner;

public class Exercice_11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mois (1-12) : ");
        int moi = scanner.nextInt();
        System.out.print("Entrez une annee : ");
        int annee = scanner.nextInt();
        scanner.close();

        YearMonth yearMonth = YearMonth.of(annee, moi);
        int daysInMonth = yearMonth.lengthOfMonth();

        System.out.print(daysInMonth);
    }
}
