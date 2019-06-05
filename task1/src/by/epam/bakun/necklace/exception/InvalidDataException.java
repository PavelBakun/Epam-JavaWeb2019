package by.epam.bakun.necklace.exception;

public class InvalidDataException extends Throwable {
    public String e = "InvalidDataException";
    public void throwException() {
        System.out.println(e);
    }

}
