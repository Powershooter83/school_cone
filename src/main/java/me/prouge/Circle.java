package me.prouge;

public class Circle {

    private double diameter;

    public Circle(final double diameter){
        this.diameter = diameter;
    }

    public Circle(){
        this.diameter = 0;
    }

    /**
     * Fetches the circle diameter
     *
     * @return circle diameter
     *
     */
    public double getDiameter(){
        return this.diameter;
    }

    /**
     * Calculates the radius of the circle with the help of the diameter
     *
     * @return circle radius
     *
     */
    public double getRadius(){
        return this.diameter / 2;
    }

    /**
     * Calculates the area of the circle using pi and the radius.
     *
     * @return circle area
     *
     */
    public double getArea(){
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    /**
     * Sets the new diameter of the circle by doubling the radius.
     *
     * @param circle radius
     *
     */
    public void setRadius(final double radius){
        this.diameter = radius * 2;
    }

    /**
     * Sets the new diameter of the circle.
     *
     * @param circle diameter
     *
     */
    public void setDiameter(final double diameter){
        this.diameter = diameter;
    }

}
