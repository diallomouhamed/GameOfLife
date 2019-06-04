import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteFile {

    public WriteFile() { }

    public void sauvegarde(Plateau plateau, File fichier) throws IOException {

        int taille = plateau.taille;
        FileWriter out = new FileWriter(fichier, true);

        for(int i = 0; i < taille; i++) {
            for(int j = 0; j < taille; j++) {
                out.write(plateau.plateau[i][j]+" ");
            }
            out.write("\n");
        }
        out.write("\n");

        out.close();
    }

}
