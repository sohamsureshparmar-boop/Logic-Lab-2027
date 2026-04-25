import java.io.*;

public class ProjectPersistence {

    public static void writeToFile(String fileName, String data) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
            pw.println(data);
        }
    }

    public static void readFromFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String file = "logic_lab.txt";
        writeToFile(file, "ISC Java - ProjectPersistence test entry.");
        readFromFile(file);
    }
}
