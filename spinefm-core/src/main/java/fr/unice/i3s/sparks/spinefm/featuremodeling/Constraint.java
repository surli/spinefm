package fr.unice.i3s.sparks.spinefm.featuremodeling;

/**
 * Created by urli on 24/01/2016.
 */
public class Constraint {
    private String rule;

    public Constraint() {

    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Constraint that = (Constraint) o;

        return rule != null ? rule.equals(that.rule) : that.rule == null;

    }

    @Override
    public int hashCode() {
        return rule != null ? rule.hashCode() : 0;
    }
}
