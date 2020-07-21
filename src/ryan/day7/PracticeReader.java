package ryan.day7;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PracticeReader {
    public static void main(String[] args) throws IOException {
        String fp = "src/ryan/day7/PracticeReader.java";
        Reader reader = new FileReader(fp, StandardCharsets.UTF_8);
        char[] buffer = new char[50];
        int n;
        StringBuilder s;
        while((n = reader.read(buffer)) != -1){
            s = new StringBuilder();
            for (char c : buffer){
                s.append(c);
            }
            System.out.printf("read data: %s\n", s);
        }

        Writer writer = new FileWriter(fp + ".bak");
        writer.append("z");
        writer.flush();

        Reader reader2 = new FileReader(fp, StandardCharsets.UTF_8);
        StringBuilder ss = readAll(reader2);
        System.out.printf("read the file, all bytes:\n%s", ss);
    }

    static StringBuilder readAll(Reader reader) throws IOException{
        int n;
        char[] buffer = new char[100];
        StringBuilder res = new StringBuilder();
        while ((n = reader.read(buffer)) != -1){
            res.append(buffer);
        }
        return res;
    }
}
