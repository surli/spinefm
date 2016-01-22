package fr.unice.i3s.sparks.featuremodeling;

/**
 * Created by urli on 22/01/2016.
 */
public class FeatureModel {

    private String name;

    private Feature root;

    public FeatureModel(String name, Feature root) {
        this.name = name;
        this.root = root;
    }

    public String getName() {
        return name;
    }

    public Feature getRoot() {
        return root;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeatureModel that = (FeatureModel) o;

        if (!name.equals(that.name)) return false;
        return root.equals(that.root);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + root.hashCode();
        return result;
    }
}
