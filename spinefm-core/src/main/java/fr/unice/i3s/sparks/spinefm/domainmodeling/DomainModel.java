package fr.unice.i3s.sparks.spinefm.domainmodeling;

import fr.unice.i3s.sparks.spinefm.domainmodeling.exceptions.ObjectNotFoundException;

import java.util.*;

/**
 * Created by urli on 25/01/2016.
 */
public class DomainModel {

    private String name;

    private Map<String, Concept> concepts;
    private Set<Association> associations;

    public DomainModel(String name) {
        this.name = name;
        this.concepts = new HashMap<String, Concept>();
        this.associations = new HashSet<Association>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Concept> getConcepts() {
        return concepts.values();
    }

    public Concept getConceptByName(String name) throws ObjectNotFoundException {
        if (this.concepts.containsKey(name)) {
            return this.concepts.get(name);
        } else {
            throw new ObjectNotFoundException();
        }
    }

    public Set<Association> getAssociations() {
        return associations;
    }

    public void addConcept(Concept c) {
        this.concepts.put(c.getName(), c);
    }

    public void addAssociation(Association a) {
        this.associations.add(a);
    }
}
