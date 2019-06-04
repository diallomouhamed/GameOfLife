public class Plateau {
    int taille;
    int [][] plateau;

    public Plateau(int taille) {
        this.taille = taille;
        plateau = new int [taille][taille];
        initialisation();
    }

    public void initialisation() {
        for(int i = 0; i < taille; i++) {
            for(int j = 0; j < taille; j++) {
                plateau[i][j] = Math.random() > 0.5 ? 0 : 1;
            }
        }
    }

    public boolean estVide() {
        for(int i = 0; i < taille; i++) {
            for(int j = 0; j < taille; j++) {
                if(plateau[i][j] == 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public void gagneUnAn() {
        for(int i = 0; i < taille; i++) {
            for(int j = 0; j < taille; j++) {
                miseAJourCase(i, j);
            }
        }
    }

    public void miseAJourCase(int i, int j) {
        int casesVivantesAdjacentes = compteCasesVivantesAdjacentes(i, j);

        if(plateau[i][j] == 0 && casesVivantesAdjacentes == 3) {
            plateau[i][j] = 1;
        } else if(plateau[i][j] == 1 && casesVivantesAdjacentes != 2 && casesVivantesAdjacentes != 3) {
            plateau[i][j] = 0;
        }
    }

    public int compteCasesVivantesAdjacentes(int i, int j) {
        int res = 0;

        if(i > 0 && j < taille-1 && plateau[i-1][j+1] == 1) res++;
        if(i > 0 && plateau[i-1][j] == 1) res++;
        if(i > 0 && j > 0 && plateau[i-1][j-1] == 1) res++;
        if(j > 0 && plateau[i][j-1] == 1) res++;
        if(i < taille-1 && j > 0 && plateau[i+1][j-1] == 1) res++;
        if(i < taille-1 && plateau[i+1][j] == 1) res++;
        if(i < taille-1 && j < taille-1 && plateau[i+1][j+1] == 1) res++;
        if(j < taille-1 && plateau[i][j+1] == 1) res++;

        return res;
    }

    public void affiche() {
        for(int i = 0; i < taille; i++) {
            for(int j = 0; j < taille; j++) {
                System.out.print(plateau[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
