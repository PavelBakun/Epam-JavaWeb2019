package by.epam.bakun.necklace.logic;

import by.epam.bakun.necklace.entity.Stone;
import by.epam.bakun.necklace.entity.TypeOfStone;

import java.util.Comparator;

public class TypeComparator implements Comparator<Stone> {

    @Override
    public int compare(Stone o1, Stone o2) {
        return o1.getTypeStone().compareTo(o2.getTypeStone());
    }
}
