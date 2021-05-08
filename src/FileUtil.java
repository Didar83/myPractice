import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

    public static boolean contains(String path, String fragment) throws IOException {
        //
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        boolean result = false;
        String concat = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            concat = concat + line + " ";
        }
        if (concat.contains(fragment)) {
            result = true;
        }
        return result;
    }
}
