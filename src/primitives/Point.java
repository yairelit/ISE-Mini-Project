package primitives;

public class Point {
    public static final Point ZERO = new Point(Double3.ZERO);

    protected final Double3 _xyz;

    public Point(double x, double y, double z) { this._xyz = new Double3(x, y, z); }

    public Point(Double3 xyz) { this._xyz = xyz; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return _xyz.equals(((Point)obj)._xyz);
    }

    @Override
    public int hashCode() { return _xyz.hashCode(); }

    @Override
    public String toString() { return "" + _xyz; }
}
