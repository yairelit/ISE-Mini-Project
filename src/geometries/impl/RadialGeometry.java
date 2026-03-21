package geometries.impl;

import geometries.api.Geometry;

abstract class RadialGeometry extends Geometry {
    protected double _radius;
    protected double _radiusSquared;

    /**
     * Constructs a radial geometry with the specified radius.
     * @param  radius the radius of the geometry
     * @throws IllegalArgumentException if the radius is not positive
     */
    public RadialGeometry(double radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("Radius must be positive");
        _radius = radius;
    }

    public double getRadius() { return _radius; }

    public double get_radiusSquared() {
        return _radiusSquared;
    }
}
