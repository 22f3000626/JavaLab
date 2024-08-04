import java.io.*;
public class java28 {
    public static void main(String[] args) {
        String outputFile = "appletstxt.txt";
        String inputFile = "appletstxt.txt";
        try {
            writeToFile(outputFile, "java programming lab >> this is being written");
            String content = readFromFile(inputFile);
            System.out.println("reading from the file:\n" + content);}
          catch (FileNotFoundException e){}
          catch (IOException e) {}
    }
    private static void writeToFile(String filePath, String content) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(filePath)) {
            writer.println(content);
            System.out.println("content succesfully written on the file");
        }
    }
    private static String readFromFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");}}
        return content.toString();
    }
}

