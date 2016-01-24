package fr.unice.i3s.sparks.spinefm.domainmodeling;

import fr.unice.i3s.sparks.spinefm.featuremodeling.FeatureModel;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by urli on 25/01/2016.
 */
public class Concept {

    private String name;

    private Multiplicity multiplicity;

    private Set<Association> associations;

    private FeatureModel featureModel;

    public Concept(String name) {
        this.name = name;
        this.associations = new HashSet<Association>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FeatureModel getFeatureModel() {
        return featureModel;
    }

    public void setFeatureModel(FeatureModel featureModel) {
        this.featureModel = featureModel;
    }

    public Multiplicity getMultiplicity() {
        return multiplicity;
    }

    public void setMultiplicity(Multiplicity multiplicity) {
        this.multiplicity = multiplicity;
    }

    public Set<Association> getAssociations() {
        return associations;
    }

    public void addAssociation(Association a) {
        this.associations.add(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Concept concept = (Concept) o;

        if (name != null ? !name.equals(concept.name) : concept.name != null) return false;
        if (multiplicity != null ? !multiplicity.equals(concept.multiplicity) : concept.multiplicity != null)
            return false;
        if (associations != null ? !associations.equals(concept.associations) : concept.associations != null)
            return false;
        return featureModel != null ? featureModel.equals(concept.featureModel) : concept.featureModel == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (multiplicity != null ? multiplicity.hashCode() : 0);
        result = 31 * result + (associations != null ? associations.hashCode() : 0);
        result = 31 * result + (featureModel != null ? featureModel.hashCode() : 0);
        return result;
    }
}
