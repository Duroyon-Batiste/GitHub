package B1_Dévellopement.Applicatif.Exercices.Module_2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.MonthDay;

public class Exercice_14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Moi de naissance (1-12) : ");
        int month = scanner.nextInt();
        System.out.print("Jour de naissance (1-31) : ");
        int day = scanner.nextInt();
        scanner.close();

        MonthDay birthDate = MonthDay.of(month, day);
        LocalDate currentDate = LocalDate.now();
        if (birthDate.isBefore(MonthDay.from(currentDate))) {
            LocalDate nextBirthday = birthDate.atYear(currentDate.getYear() + 1);
            long rest = ChronoUnit.DAYS.between(currentDate, nextBirthday);
            System.out.println("Il reste " + rest + " dodos avant ton anniversaire.");
        }
    }
}