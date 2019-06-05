package by.epam.bakun.textParser.helper;

import java.io.*;

public class ReaderFile {
    String path;
    private BufferedReader br;

    public ReaderFile(String path) {
        this.path = path;
    }

    private void openFile() {
        try {
            this.br = new BufferedReader(new FileReader((path)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String readFile() {
        openFile();
        String text = "";
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            text = sb.toString();
        } catch (IOException e) {
            System.out.println("FileException");
        }
        return text;
    }
}


