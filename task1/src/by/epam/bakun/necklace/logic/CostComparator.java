package by.epam.bakun.necklace.logic;

import by.epam.bakun.necklace.entity.Stone;

import java.util.Comparator;

public class CostComparator implements Comparator<Stone> {
    @Override
    public int compare(Stone o1, Stone o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }

}
