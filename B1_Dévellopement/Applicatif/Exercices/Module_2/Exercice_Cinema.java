package B1_Dévellopement.Applicatif.Exercices.Module_2;

public class Exercice_Cinema {
    public static void main(String[] args) throws Exception {
        int age = 14;
        boolean withAdult = false;
        boolean banished = false;

        if ((age < 14 || withAdult == true)&& banished == false) {
            System.out.println("Vous pouvez entrer");
        } else {
            System.out.println("Vous ne pouvez pas entrer");
        }
    }
}