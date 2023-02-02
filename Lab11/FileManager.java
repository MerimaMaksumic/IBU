package lab11;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    private File read;
    Scanner reader;

    public FileManager() {
    	this.reader = new Scanner(System.in);
    }

    public ArrayList<String> read(String file) {
        this.read = new File(file);
        ArrayList<String> list = new ArrayList<String>();

        try {
            reader = new Scanner(read);
        } catch (Exception e) {
            System.out.println("An error occured reading the file. Error: " + e.getMessage());
        }

        while (reader.hasNext()) {
            String line = reader.nextLine();
            list.add(line);
        }

        return list;
    }

    public void save(String fileName, String text) throws Exception {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(text);
            writer.close();
        } catch (Exception e) {
            System.out.println("An error occured writing to hte file. Error: " + e.getMessage());
        }

        System.out.println("Content has been written to the file");
    }

    public void save(String fileName, ArrayList<String> texts) throws Exception {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (String line : texts) {
                writer.write(line + "\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("An error occured reading the file. Error: " + e.getMessage());
        }
        
        System.out.println("Content has been written to the file");
    }
}

