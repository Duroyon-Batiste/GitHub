package B1_Dévellopement.Applicatif.Exercices.Module_1;
public class Exercice_1 {

    public static void main(String[] args) throws Exception {
            
            int heure = 15 * 3600;
            int minute = 24 *60 ;
            int seconde = 9 *1 ;
            

            int temps = heure + minute + seconde ;
            System.out.println("il est "+ heure +" H "+minute+" min "+seconde+" s .") ;
            System.out.println("il s'est écoulé "+temps+ " seconde depuis minuit");
        }
}