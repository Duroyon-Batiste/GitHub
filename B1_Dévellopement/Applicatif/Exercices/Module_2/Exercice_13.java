package B1_Dévellopement.Applicatif.Exercices.Module_2;

import java.util.Scanner;

public class Exercice_13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une string : ");
        String input = scanner.nextLine();
        scanner.close();

        String reversed = new StringBuilder(input).reverse().toString().toLowerCase();
        System.out.println(reversed.equals(input.toLowerCase()));
    }
}
