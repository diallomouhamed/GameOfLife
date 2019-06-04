public class Main {
    public static void main(String [] args) {
        vivre();
    }

    public static void vivre() {
        Plateau plateau = new Plateau(3);

        try {
            WriteFile fichier = new WriteFile("GameOfLife.txt");
            // int i = 0;
            while /*(i < 10) { */ (!plateau.estVide()) {
                fichier.sauvegarde(plateau);
                plateau.affiche();
                plateau.gagneUnAn();
                // i++;
            }
        } catch(Exception e) {
            System.out.println("Le fichier n'a pas pu être ouvert.");
        }

    }
}
