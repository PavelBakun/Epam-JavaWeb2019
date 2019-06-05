package by.epam.bakun.necklace.logic;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    ArrayList<String[]> listRow = new ArrayList<>();
    Scanner scn;
    String path;

    public FileReader(String path){
        this.path = path;
    }

    public ArrayList<String[]> readFile() {
        try {
            scn = new Scanner((new File(path)));
        } catch (Exception e) {
            System.out.println("FileException");
        }

        //begin to reade
        while (scn.hasNext()) {
            String row = scn.nextLine();
            String[] value = row.split(" ");
            listRow.add(value);
        }
        return listRow;

    }

}
