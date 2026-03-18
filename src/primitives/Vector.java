package primitives;

public class Vector extends Point{

    public Vector(double x, double y, double z) {
        super(x, y, z);
        if (_xyz.equals(Double3.ZERO))
            throw new IllegalArgumentException("Zero vector is not allowed");
    }

    public Vector(Double3 xyz) {
        super(xyz);
        if (xyz.equals(Double3.ZERO))
            throw new IllegalArgumentException("Zero vector is not allowed");
    }

     /**
      * Computes the cross product of this vector with another vector.
      * @param  rhs the other vector
      * @return     a new {@code Vector} containing the cross product
      */
     public Vector crossProduct(Vector rhs) {
         double x1 = _xyz._d1(), y1 = _xyz._d2(), z1 = _xyz._d3();
         double x2 = rhs._xyz._d1(), y2 = rhs._xyz._d2(), z2 = rhs._xyz._d3();
         return new Vector(y1 * z2 - z1 * y2, z1 * x2 - x1 * z2, x1 * y2 - y1 * x2);
     }

     /**
      * Computes the dot product of this vector with another vector.
      * @param  rhs the other vector
      * @return     the dot product as a {@code double}
      */
     public double dotProduct(Vector rhs) {
         return _xyz._d1() * rhs._xyz._d1() + _xyz._d2() * rhs._xyz._d2() + _xyz._d3() * rhs._xyz._d3();
     }

     /**
      * Computes the length (magnitude) of this vector.
      * @return the length as a {@code double}
      */
     public double length() { return Math.sqrt(dotProduct(this)); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        return _xyz.equals(((Vector) obj)._xyz);
    }

    @Override
    public int hashCode() { return _xyz.hashCode(); }

    @Override
    public String toString() { return "" + _xyz; }
}
