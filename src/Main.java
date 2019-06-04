import java.io.File;

public class Main {
    public static void main(String [] args) {
        vivre();
    }

    public static void vivre() {
        Plateau plateau = new Plateau(3);

        try {
            File fichier = new File("GameOfLife.txt");
            WriteFile ecritureFichier = new WriteFile();

            while(!plateau.estVide()) {
                ecritureFichier.sauvegarde(plateau, fichier);
                plateau.affiche();
                plateau.gagneUnAn();
            }

        } catch(Exception e) {
            System.out.println("Le fichier n'a pas pu être ouvert.");
        }
    }
}