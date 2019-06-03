import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteFile extends File {

    public WriteFile(String pathname) {
        super(pathname);
    }

    public void SaveFile(Plateau plateau) {
        try(FileWriter fw = new FileWriter("myfile.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(plateau.plateau);
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }

}
