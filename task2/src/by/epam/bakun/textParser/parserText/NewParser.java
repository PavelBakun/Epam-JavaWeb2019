package by.epam.bakun.textParser.parserText;

import by.epam.bakun.textParser.entity.implement.Composite;
import by.epam.bakun.textParser.entity.implement.Leaf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import static by.epam.bakun.textParser.parserText.TypeText.PARAGRAPH;
import static by.epam.bakun.textParser.parserText.TypeText.TEXT;

public class NewParser {

    static Logger logger = Logger.getLogger(NewParser.class.getName());

    private String text;

    //constructor NewParser
    public NewParser(String text) {
        this.text = text;
    }

    public String getText() {
        Composite restore = parseText(text, TEXT);
        return restore.getText();
    }

    public Composite parseText(String text, TypeText typeText) {
        logger.debug("create pattern");
        Pattern p = Pattern.compile(typeText.getRegexForSplit()); //create the pattern
        logger.debug("find matcher");
        Matcher m = p.matcher(text);
        String[] array = p.split(text);
        Composite restore = new Composite();
        int i = 0; //count of matches
        logger.debug("create and append composite");
        while (m.find()) {
            if (typeText == TEXT) {
                logger.debug("append composite by sentences");
                restore.add(parseText(array[i], PARAGRAPH));
            } else {
                logger.debug("append composite by paragraph (composites of sentences)");
                Leaf leafSent = new Leaf(array[i]);
                restore.add(leafSent);
            }
            logger.debug("append service symbol");
            Leaf leaf = new Leaf(m.group());
            restore.add(leaf);
            i += 1;
        }
        return restore;
    }

    public String sortParagraph() {
        //local inner class
        class Paragraph implements Comparable<Paragraph> {
            String text;
            int numberOfParagraph;

            public Paragraph(String text, int numberOfParagraph) {
                this.text = text;
                this.numberOfParagraph = numberOfParagraph;
            }

            public String getPar() {
                return text;
            }

            public int compareTo(Paragraph anotherParagr) {
                if (this.numberOfParagraph == anotherParagr.numberOfParagraph) {
                    return 0;
                } else if (this.numberOfParagraph < anotherParagr.numberOfParagraph) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }//close inner class

        String newText = "";
        String[] textPar = text.split(TEXT.getRegexForSplit());
        logger.debug("create collecton of paragraph");
        ArrayList<Paragraph> collection = new ArrayList<>();
        for (int i = 0; i < textPar.length; i++) {
            String[] arrSent = textPar[i].split(PARAGRAPH.getRegexForSplit());
            collection.add(new Paragraph(textPar[i], arrSent.length));
        }
        logger.debug("sorted collection");
        Collections.sort(collection);
        for (Paragraph par : collection) {
            newText = newText + par.getPar() + "\n";
        }
        return newText;
    }
}
