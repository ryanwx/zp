package ryan.day7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PracticeFile {
    public static void main(String[] args) throws Exception {
        File file = new File("src/ryan/day7/PracticeFile");

        System.out.println(file.getAbsolutePath());

        System.out.println(System.getProperty("user.dir"));

        readFle("./src/ryan/day7/PracticeFile.java");
    }

    static void readFle(String filepath) throws IOException {
        try (InputStream fileInputStream = new FileInputStream(filepath)){
            // System.out.println(fileInputStream.);
            int n;
            while ((n = fileInputStream.read()) != -1){
                System.out.printf("%s", n);
            }
        }
    }

}
