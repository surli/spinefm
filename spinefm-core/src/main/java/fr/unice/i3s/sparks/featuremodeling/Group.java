package fr.unice.i3s.sparks.featuremodeling;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by urli on 22/01/2016.
 */
public class Group {

    private Set<Feature> features;

    private GroupState state;

    public Group() {
        this.features = new HashSet<Feature>();
    }

    public GroupState getState() {
        return state;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void addFeature(Feature f) {
        this.features.add(f);
    }

    public void setState(GroupState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (!features.equals(group.features)) return false;
        return state == group.state;

    }

    @Override
    public int hashCode() {
        int result = features.hashCode();
        result = 31 * result + state.hashCode();
        return result;
    }
}
