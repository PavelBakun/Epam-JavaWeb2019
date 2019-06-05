package by.epam.bakun.textParser;

import by.epam.bakun.textParser.helper.ReaderFile;
import by.epam.bakun.textParser.parserText.NewParser;


public class Main {
    public static void main(String[] args) {
        String path = "./src/by/epam/bakun/textParser/data/textTask2";
        ReaderFile file = new ReaderFile(path);
        String text = file.readFile();
        //SimpleParser simpleParser = new SimpleParser(text);
        System.out.println(text);
        System.out.println("after building composite");
        NewParser newParser = new NewParser(text);
        System.out.println(newParser.getText());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(newParser.sortParagraph());
        //simpleParser.findSymbol(text, ",|'");
    }
}
