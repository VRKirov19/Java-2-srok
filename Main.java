import java.io.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        String inputPath = "C:\\Users\\VRKirov19\\source\\repos\\txtFile.txt";
        String outputPath = "C:\\Users\\VRKirov19\\source\\repos\\Output.txt";

        FileReader fileReader = new FileReader(inputPath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
        String nextLine = bufferedReader.readLine();
        int lineNumber = 1;
        while(nextLine != null) {
            bufferedWriter.write(lineNumber + ". " + nextLine);
            bufferedWriter.newLine();
            lineNumber++;
            nextLine = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
