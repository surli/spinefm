package fr.unice.i3s.sparks.spinefm.featuremodeling;

import fr.familiar.parser.FeatureNotFoundException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by urli on 22/01/2016.
 */
public class FeatureModel {

    private String name;

    private Feature root;

    private Map<String,Feature> allFeatures;

    private Set<Constraint> constraints;

    public FeatureModel() {
        this("",null);
    }

    public FeatureModel(String name) {
        this(name,null);
    }

    public FeatureModel(String name, Feature root) {
        this.name = name;
        this.root = root;
        this.constraints = new HashSet<Constraint>();
        this.allFeatures = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Feature getRoot() {
        return root;
    }

    public void setRoot(Feature root) {
        this.allFeatures = null;
        this.root = root;
    }

    public Feature getFeatureFromName(String s) throws FeatureNotFoundException {
        if (this.allFeatures == null) {
            this.allFeatures = new HashMap<String, Feature>();
            this.recursivelyGetAllFeatures(this.root);
        }

        if (this.allFeatures.containsKey(s)) {
            return this.allFeatures.get(s);
        } else {
            throw new FeatureNotFoundException("The feature '"+s+"' can not be found in FM: "+this.name);
        }
    }

    private void recursivelyGetAllFeatures(Feature root) {
        this.allFeatures.put(root.getName(), root);

        for (Feature f : root.getChildrenFeatures()) {
            this.recursivelyGetAllFeatures(f);
        }
    }

    public void addConstraint(Constraint c) {
        this.constraints.add(c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeatureModel that = (FeatureModel) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (root != null ? !root.equals(that.root) : that.root != null) return false;
        return constraints != null ? constraints.equals(that.constraints) : that.constraints == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (root != null ? root.hashCode() : 0);
        result = 31 * result + (constraints != null ? constraints.hashCode() : 0);
        return result;
    }
}
