import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String choix;
        int valeur = 0;
        System.out.print("Entrer la taille de votre tableau: ");
        Scanner scannerr = new Scanner(System.in);
        int taille = scannerr.nextInt();
        TriSimple tableau = new TriSimple(taille);
        String valeurr;
        do {
            System.out.println("********************");
            System.out.print("Entrer a pour inserer\n");
            System.out.print("Entrer s pour suprimer\n");
            System.out.println("Entrer f pour afficher tt la table");
            System.out.print("Entrer q pour quiter\n");
            System.out.println("********************");
            System.out.print("Votre choix est: ");
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextLine();
            switch (choix) {

                case "a": {
                    System.out.print("Entrer une valeur à insert: ");
                    Scanner scannerrr = new Scanner(System.in);
                    valeur = scanner.nextInt();
                    tableau.insert(valeur);
                    break;
                }
                case "s": {
                    System.out.print("Entrer une valeur à supprimer: ");
                    Scanner scannerrr = new Scanner(System.in);
                    valeur = scanner.nextInt();
                    tableau.supprimer(valeur);
                    break;
                }
                case "f": System.out.println(tableau); break;
                case "q":
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choix);
            }
        } while ( !choix.equals("q"));

    }
}
