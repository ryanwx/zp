package ryan.day7;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your source file: ");
        String sourceFile = scanner.nextLine();
        System.out.println("input your dest file: ");
        String descFile = scanner.nextLine();

        try(InputStream inputStream = new FileInputStream(sourceFile); OutputStream outputStream = new FileOutputStream(descFile)){
            copy(inputStream, outputStream);
            System.out.println("SUCCESS");
        }catch (Exception e){
            System.out.printf("Failed, error: %s", e.toString());
        }
    }

    static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n;
        while ((n = inputStream.read()) != -1){
            outputStream.write(n);
        }
    }
}
