import java.util.Objects;

public final class Occurance {
    private final String name;
    private final int occurance;

    public Occurance(String name, int occurance) {
        this.name = name;
        this.occurance = occurance;
    }

    public String name() {
        return name;
    }

    public int occurance() {
        return occurance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Occurance) obj;
        return Objects.equals(this.name, that.name) &&
                this.occurance == that.occurance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occurance);
    }

    @Override
    public String toString() {
        return "{" +
                "name: " + name + ", " +
                "occurance: " + occurance + '}';
    }
}
