package by.epam.bakun.necklace.entity;

import by.epam.bakun.necklace.factory.StoneFactory;
import by.epam.bakun.necklace.logic.FileReader;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Decor {

    static Logger logger = Logger.getLogger(Decor.class.getName());

    private ArrayList<Stone> decor = new ArrayList<>();

    private ArrayList<Stone> findStone = new ArrayList<>();

    public ArrayList<Stone> getDecor() {
        return decor;
    }

    public void createDecor(String path) {
        logger.debug("create factory");
        StoneFactory factory = new StoneFactory();
        logger.debug("create fileReader, read File");
        FileReader fileReader = new FileReader(path);
        ArrayList<String[]> dataFile = fileReader.readFile();
        logger.info("create collection ofStone");
        for(String[] rowFile: dataFile) {
            try {
                decor.add(factory.createStone(rowFile));
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid data in " + dataFile.indexOf(rowFile) + " row of File " + path);
                logger.error("wrong data in File", e);
            }
        }
    }

    public double calcWeight() {
        double weightNecklace = 0;
        for (Stone stone: decor) {
            weightNecklace += stone.getWeight();
        }
        return weightNecklace;
    }

    public double calcCost() {
        double costNecklace = 0;
        for (Stone stone: decor) {
            costNecklace += stone.getCost();
        }
        return costNecklace;
    }

    public ArrayList<Stone> findStoneFromTransparency(int minVal, int maxVal) {
        if ((maxVal-minVal) < 0 || (maxVal < 0) || (minVal < 0) || (minVal > 100) || (maxVal > 100)) {
            return null;
        } else {
            for (Stone stone: decor) {
                int value = stone.getTransparency();
                if ((value < maxVal + 1) && (value > minVal - 1)) {
                    findStone.add(stone);
                }
            }
        }
        return findStone;
    }

    public void addStone(String type, String w, String c, String t, String x, String y) {
        String[] param = {type, w, c, t, x, y};
        StoneFactory factory = new StoneFactory();
        try {
            decor.add(factory.createStone(param));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid data in parameters of method addStone");
        }
    }

    public void delStone(TypeOfStone type, double w, double c, int t){
        boolean isPresentStone = false;
        Stone delStone = new Stone();
        for (Stone stone: decor) {
            if ((type == stone.getTypeStone()) &&
                w == stone.getWeight() &&
                c == stone.getCost() &&
                t == stone.getTransparency()) {
                isPresentStone = true;
                delStone = stone;
            }
        }
        if (isPresentStone) {
            decor.remove(delStone);
        }
    }

    @Override
    public String toString() {
        String neklace = "";
        for(Stone stone: decor) {
            neklace += stone.toString() + " \n";
        }
        return "Decor{" +
                "decor= \n" + neklace +
                '}';
    }
}
