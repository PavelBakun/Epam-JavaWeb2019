package by.epam.bakun.textParser.parserText;

import by.epam.bakun.textParser.entity.Component;
import by.epam.bakun.textParser.entity.implement.Composite;
import by.epam.bakun.textParser.entity.implement.Leaf;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.bakun.textParser.parserText.TypeText.*;


public class SimpleParser {

}
    /*private String text;
    public SimpleParser(String text) {
        this.text = text;
    }
    public String getText() {
        Composite restore = parseTXT();
        return restore.getText();
    }

    public StringBuilder findSymbol(String text, String reg) {
        Pattern pattern = Pattern.compile(reg); //create the pattern
        Matcher matcher = pattern.matcher(text);
        StringBuilder arrServiceSymbol = new StringBuilder();
        while (matcher.find()) {
            char servSymbol = text.charAt(matcher.start()); //find all split Symbol and
            arrServiceSymbol.append(servSymbol);            //create StringBuilder from it's
        }
        return arrServiceSymbol;
    }

    public Composite parseTXT() {
        String[] arrParagr = text.split(TEXT.getRegexForSplit());           //split "text" from Regex.Text
        StringBuilder regSymbol = findSymbol(text, TEXT.getRegexForSplit());//find all split Symbol
        Composite restoreParagr = new Composite();                          //create new collection
        for (int i = 0; i < arrParagr.length; i++) {                        //append this collection
            restoreParagr.add(parseParagr(arrParagr[i]));                   //add composite[composite]
            if (i < regSymbol.length()) {
                Leaf leaf1 = new Leaf(String.valueOf(regSymbol.charAt(i)));  //add service split symbol
                restoreParagr.add(leaf1);                                    // into composite
            }
        }
        return restoreParagr;
    }

    public Composite parseParagr(String text) {
        String[] arrSent = text.split(PARAGRAPH.getRegexForSplit());
        Composite restoreSent = new Composite();
        for (String sent : arrSent) {
            restoreSent.add(parseSent(sent));
            Leaf leaf1 = new Leaf(". ");
            restoreSent.add(leaf1);
        }
        return restoreSent;
    }


   } public Composite parseSent(String text) {
        String[] arrLex = text.split(SENTENCE.getRegexForSplit());
        Composite restoreSent = new Composite();
        for (String lex : arrLex) {
            Leaf leaf = new Leaf(lex);
            restoreSent.add(leaf);
            if (lex != arrLex[arrLex.length - 1]) {
                Leaf leaf1 = new Leaf(" ");
                restoreSent.add(leaf1);
            }
        }
        return restoreSent;
    }*//*

    public String sortParagraf() {
        //local inner class
        class Paragraf implements Comparable<Paragraf> {
            String text;
            int numberOfParagraf;
            public Paragraf(String text, int numberOfParagraf) {
                this.text = text;
                this.numberOfParagraf = numberOfParagraf;
            }
            public String getPar() {
                return text;
            }
            public int compareTo(Paragraf anotherParagr) {
                if (this.numberOfParagraf == anotherParagr.numberOfParagraf) {
                    return 0;
                } else if (this.numberOfParagraf < anotherParagr.numberOfParagraf) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        String newText = "";
        String[] textPar = text.split(TEXT.getRegexForSplit());
        ArrayList<Paragraf> collection = new ArrayList<>();
        for (int i = 0; i < textPar.length; i++) {
            String[] arrSent = textPar[i].split(PARAGRAPH.getRegexForSplit());
            collection.add(new Paragraf(textPar[i], arrSent.length));
        }
        Collections.sort(collection);
        for (Paragraf par : collection) {
            newText = newText + par.getPar() + "\n";
            //System.out.println(e.getKey() + " " + e.getValue());
        }
        return newText;

    }
}
*/