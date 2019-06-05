package by.epam.bakun.textParser.entity.implement;

import by.epam.bakun.textParser.entity.Component;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> composite = new ArrayList<>();
    private String text = "";

    @Override
    public String getText() {
        for (Component childComposite : composite) {
            text += childComposite.getText();
        }
        return text;
    }

    public void add(Component c) {
        composite.add(c);
    }

    public void remove(Component c) {
        composite.remove(c);
    }
}
