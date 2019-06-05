package by.epam.bakun.textParser.Exception;

import java.io.FileNotFoundException;

public class InvalFileException extends Exception {
    public String e = "InvalidFileException";
    public void throwException() {
        System.out.println(e);
    }
}
