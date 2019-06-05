package by.epam.bakun.textParser.parserText;

public enum TypeText {
    TEXT, PARAGRAPH;

    private static final TypeText[] values = values();

    private String RegexForSplit;

    static {
        TEXT.RegexForSplit = "\\n";
        PARAGRAPH.RegexForSplit = "(\\.+|\\!|\\!+|\\?+)(?=\\ |\\r|\\n|$)";
    }

    public String getRegexForSplit() {
        return RegexForSplit;
    }
}
