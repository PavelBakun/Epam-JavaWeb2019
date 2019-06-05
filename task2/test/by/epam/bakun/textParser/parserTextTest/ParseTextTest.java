package by.epam.bakun.textParser.parserTextTest;

import by.epam.bakun.textParser.parserText.NewParser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParseTextTest {
    @Test(description = "try to parse the text")
    public void parseTest() {
        String text = "abc! dlkfjs.\nsdf. asdfj;.\n";
        NewParser newParser = new NewParser(text);
        String actual = newParser.getText();
        String expected = new String(text);
        Assert.assertEquals(actual, expected);
    }
}
