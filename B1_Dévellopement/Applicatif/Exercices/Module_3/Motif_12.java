package B1_Dévellopement.Applicatif.Exercices.Module_3;

public class Motif_12 {
    public static void main(String[] args) {
        int size = 2;
        int rows = 2;
        int cols = 2;
        for (int row = 0; row <= rows; row++) {
            System.out.print("+");
            for (int col = 0; col < cols; col++) {
                for (int eq = 0; eq < size; eq++)
                    System.out.print("=");
                System.out.print("+");
            }
            System.out.println();
            if (row == rows)
                break;
            for (int t = 0; t < size; t++) {
                for (int col = 0; col <= cols; col++) {
                    System.out.print("|");
                    for (int sp = 0; sp < size; sp++)
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
