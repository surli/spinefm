package fr.unice.i3s.sparks.spinefm.domainmodeling;

/**
 * Created by urli on 25/01/2016.
 */
public class Multiplicity {

    private LowerMultiplicity lowerBound;
    private UpperMultiplicity upperBound;

    public Multiplicity(LowerMultiplicity lower, UpperMultiplicity upper) {
        this.lowerBound = lower;
        this.upperBound = upper;
    }

    public Multiplicity() {}

    public LowerMultiplicity getLowerBound() {
        return lowerBound;
    }

    public UpperMultiplicity getUpperBound() {
        return upperBound;
    }

    public void setLowerBound(LowerMultiplicity lowerBound) {
        this.lowerBound = lowerBound;
    }

    public void setUpperBound(UpperMultiplicity upperBound) {
        this.upperBound = upperBound;
    }

    public boolean isNumberInRange(int number) {
        if (number < 0)
            return false;

        if (number == 0 && lowerBound == LowerMultiplicity.ONE)
            return false;

        if (number > 1 && upperBound == UpperMultiplicity.ONE)
            return false;

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Multiplicity that = (Multiplicity) o;

        if (lowerBound != that.lowerBound) return false;
        return upperBound == that.upperBound;

    }

    @Override
    public int hashCode() {
        int result = lowerBound != null ? lowerBound.hashCode() : 0;
        result = 31 * result + (upperBound != null ? upperBound.hashCode() : 0);
        return result;
    }
}
