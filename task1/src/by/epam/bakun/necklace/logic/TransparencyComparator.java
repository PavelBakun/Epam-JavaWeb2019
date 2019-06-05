package by.epam.bakun.necklace.logic;

import by.epam.bakun.necklace.entity.Stone;

import java.util.Comparator;

public class TransparencyComparator implements Comparator<Stone> {

    @Override
    public int compare(Stone o1, Stone o2) {
        return Integer.compare(o1.getTransparency(), o2.getTransparency());
    }
}
