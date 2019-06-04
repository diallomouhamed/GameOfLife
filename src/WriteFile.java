import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteFile extends FileWriter {

    public WriteFile(String pathname) throws IOException {
        super(pathname, true);
    }

    public void sauvegarde(Plateau plateau) {
        BufferedWriter bw = new BufferedWriter(this);
        PrintWriter out = new PrintWriter(bw);
        out.println(plateau.plateau);
    }

}
