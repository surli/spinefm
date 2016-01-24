package fr.unice.i3s.sparks.spinefm.domainmodeling;

/**
 * Created by urli on 25/01/2016.
 */
public class Association {

    private AssociationEnd leftEnd;
    private AssociationEnd rightEnd;

    public Association() {}

    public AssociationEnd getLeftEnd() {
        return leftEnd;
    }

    public void setLeftEnd(AssociationEnd leftEnd) {
        this.leftEnd = leftEnd;
    }

    public AssociationEnd getRightEnd() {
        return rightEnd;
    }

    public void setRightEnd(AssociationEnd rightEnd) {
        this.rightEnd = rightEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Association that = (Association) o;

        if (leftEnd != null ? !leftEnd.equals(that.leftEnd) : that.leftEnd != null) return false;
        return rightEnd != null ? rightEnd.equals(that.rightEnd) : that.rightEnd == null;

    }

    @Override
    public int hashCode() {
        int result = leftEnd != null ? leftEnd.hashCode() : 0;
        result = 31 * result + (rightEnd != null ? rightEnd.hashCode() : 0);
        return result;
    }
}
