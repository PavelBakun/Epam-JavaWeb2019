package by.epam.bakun.necklace.entity;

import java.util.Objects;

public class ArtificalStone extends Stone {
    private String countryProduction;
    private int yearProduction;

    public ArtificalStone(){
        super();
    }

    public ArtificalStone(TypeOfStone typeStone, double weight, double cost, int transparency,
                     String countryProduction, int yearProduction) {
        super(typeStone, weight, cost, transparency);
        this.countryProduction = countryProduction;
        this.yearProduction = yearProduction;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public void setCountryProduction(String countryProduction) {
        this.countryProduction = countryProduction;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ArtificalStone artificalStone = (ArtificalStone) o;
        return yearProduction == artificalStone.yearProduction &&
                Objects.equals(countryProduction, artificalStone.countryProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countryProduction, yearProduction);
    }

    @Override
    public String toString() {
        return "ArtificalStone{" + super.toString() +
                ", countryProduction='" + countryProduction + '\'' +
                ", yearProduction=" + yearProduction +
                '}';
    }
}
