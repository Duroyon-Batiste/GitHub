package B1_Dévellopement.Applicatif.Exercices.Module_3;

public class Motif_13 {
    public static void main(String[] args) {
        int width = 32;
        int height = 9;
        for (int line = 0; line < height; line++) {
            for (int pos = 0; pos < width; pos++) {
                if (pos == line || pos == width - 1 - line) {
                    System.out.print("/");
                } else if (pos > line && pos < width - 1 - line) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
