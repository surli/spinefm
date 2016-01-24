package fr.unice.i3s.sparks.spinefm.domainmodeling;

import java.util.Set;

/**
 * Created by urli on 25/01/2016.
 */
public class DomainModel {

    private String name;

    private Set<Concept> concepts;
    private Set<Association> associations;

    public DomainModel() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Concept> getConcepts() {
        return concepts;
    }

    public Set<Association> getAssociations() {
        return associations;
    }

    public void addConcept(Concept c) {
        this.concepts.add(c);
    }

    public void addAssociation(Association a) {
        this.associations.add(a);
    }
}
