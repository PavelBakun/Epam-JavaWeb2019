package by.epam.bakun.textParser.parserTextTest;

import by.epam.bakun.textParser.parserText.NewParser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedTextTest {
    @Test(description = "try to sort the text")
    public void parseTest() {
        String text = "dlkfjs. sdf. asdfj;.\nabc!\nhkl? asdfjk.\n";
        NewParser newParser = new NewParser(text);
        String actual = newParser.sortParagraph();
        String expected = "abc!\nhkl? asdfjk.\ndlkfjs. sdf. asdfj;.\n";
        Assert.assertEquals(actual, expected);
    }
}
