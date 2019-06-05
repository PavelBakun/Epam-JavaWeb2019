package by.epam.bakun.necklace.entity;

import java.util.Objects;

public class NaturalStone extends Stone {
    private  String magicProperty;
    private int magicForce; // 0...100

    public NaturalStone(){
        super();
    }

    public NaturalStone(TypeOfStone typeStone, double weight, double cost, int transparency,
                        String magicProperty, int magicForce) {
        super(typeStone, weight, cost, transparency);
        this.magicProperty = magicProperty;
        this.magicForce = magicForce;
    }

    public String getMagicProperty() {
        return magicProperty;
    }

    public void setMagicProperty(String magicProperty) {
        this.magicProperty = magicProperty;
    }

    public int getMagicForce() {
        return magicForce;
    }

    public void setMagicForce(int magicForce) {
        this.magicForce = magicForce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NaturalStone naturalStone = (NaturalStone) o;
        return magicForce == naturalStone.magicForce &&
               magicProperty.equals(naturalStone.magicProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), magicProperty, magicForce);
    }

    @Override
    public String toString() {
        return "NaturalStone{" + super.toString()+
                ", magicProperty='" + magicProperty + '\'' +
                ", magicForce=" + magicForce +
                '}';
    }
}
