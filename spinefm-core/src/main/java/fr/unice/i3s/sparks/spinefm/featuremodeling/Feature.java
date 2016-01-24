package fr.unice.i3s.sparks.spinefm.featuremodeling;

import fr.unice.i3s.sparks.spinefm.featuremodeling.exceptions.ExistingGroupException;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by urli on 22/01/2016.
 */
public class Feature {
    private String name;

    private Set<Group> children;

    public Feature() {
        this("");
    }

    public Feature(String name) {
        this.name = name;
        this.children = new HashSet<Group>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Group> getChildren() {
        return children;
    }

    public void addChild(Group g) throws ExistingGroupException {
        if (this.children.contains(g))
            throw new ExistingGroupException();
        else
            this.children.add(g);
    }

    public Set<Feature> getChildrenFeatures() {
        Set<Feature> result = new HashSet<Feature>();

        for (Group group : this.children) {
            result.addAll(group.getFeatures());
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feature feature = (Feature) o;

        return name != null ? name.equals(feature.name) : feature.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
