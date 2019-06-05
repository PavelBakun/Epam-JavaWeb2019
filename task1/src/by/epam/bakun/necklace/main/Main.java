package by.epam.bakun.necklace.main;

import by.epam.bakun.necklace.entity.*;
import by.epam.bakun.necklace.logic.CostComparator;
import by.epam.bakun.necklace.logic.TypeComparator;
import org.apache.logging.log4j.util.PropertySource;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Decor decor = new Decor();
        String path = "./src/by/epam/bakun/necklace/data/necklaceOne";
        decor.createDecor(path);
        System.out.println(decor.toString());

        TypeComparator typeComparator = new TypeComparator();
        Comparator<Stone> scomp = new TypeComparator().thenComparing(new CostComparator());

        decor.getDecor().sort(typeComparator);
        System.out.println(decor.toString());

        decor.addStone("DIAMOND", "20", "20", "20", "Activ", "40");
        decor.delStone(TypeOfStone.DIAMOND,20.0, 100.0, 80);

        decor.getDecor().sort((scomp));
        System.out.println(decor.toString());

        ArrayList<Stone> find = decor.findStoneFromTransparency(0, 40);
            for (Stone stone: find) {
            System.out.println(stone.toString());
        }
        System.out.println(find.size());

        System.out.println("Cost = " + decor.calcCost());
        System.out.println("Weight = " + decor.calcWeight());
    }

}
