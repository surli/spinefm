package fr.unice.i3s.sparks.spinefm.domainmodeling;

/**
 * Created by urli on 25/01/2016.
 */
public class AssociationEnd {

    private Concept concept;
    private Multiplicity multiplicity;

    public AssociationEnd() {}

    public Concept getConcept() {
        return concept;
    }

    public void setConcept(Concept concept) {
        this.concept = concept;
    }

    public Multiplicity getMultiplicity() {
        return multiplicity;
    }

    public void setMultiplicity(Multiplicity multiplicity) {
        this.multiplicity = multiplicity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssociationEnd that = (AssociationEnd) o;

        if (concept != null ? !concept.equals(that.concept) : that.concept != null) return false;
        return multiplicity != null ? multiplicity.equals(that.multiplicity) : that.multiplicity == null;

    }

    @Override
    public int hashCode() {
        int result = concept != null ? concept.hashCode() : 0;
        result = 31 * result + (multiplicity != null ? multiplicity.hashCode() : 0);
        return result;
    }
}
