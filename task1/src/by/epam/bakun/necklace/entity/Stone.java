package by.epam.bakun.necklace.entity;

import java.util.Objects;

public class Stone {


    private TypeOfStone typeStone;
    private double weight;
    private double cost;
    private int transparency;

    public Stone() {
       super();
    }

    public Stone(TypeOfStone typeStone, double weight, double cost, int transparency) {
        this.typeStone = typeStone;
        this.weight = weight;
        this.cost = cost;
        this.transparency = transparency;
    }

    public TypeOfStone getTypeStone() {
        return typeStone;
    }

    public void setTypeStone(TypeOfStone typeStone) {
        this.typeStone = typeStone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    @Override
    public String toString() {
        return  "typeStone=" + typeStone +
                ", weight=" + weight +
                ", cost=" + cost +
                ", transparency=" + transparency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stone stone = (Stone) o;
        return Double.compare(stone.weight, weight) == 0 &&
                Double.compare(stone.cost, cost) == 0 &&
                transparency == stone.transparency &&
                typeStone == stone.typeStone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeStone, weight, cost, transparency);
    }
}
