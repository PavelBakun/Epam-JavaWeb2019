package by.epam.bakun.textParser.entity.implement;

import by.epam.bakun.textParser.entity.Component;

public class Leaf implements Component {
    private String symbol;

    public Leaf(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String getText() {
        return symbol;
    }
}
