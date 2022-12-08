package me.prouge;

public class TruncatedCone extends Circle {

    private final Circle baseCircle;
    private final Circle coverCircle;
    private double height;

    public TruncatedCone(final double radiusBaseCircle,
                         final double radiusCoverCircle,
                         final double height){
        this.baseCircle = new Circle(radiusBaseCircle * 2);
        this.coverCircle = new Circle(radiusCoverCircle * 2);
        this.height = height;
    }

    public TruncatedCone(final Circle baseCircle,
                         final Circle coverCircle,
                         final double height){
        this.baseCircle = baseCircle;
        this.coverCircle = coverCircle;
        this.height = height;
    }

    /**
     * Calculates the surface line of the truncated cone.
     *
     * @return truncated cone surface line
     *
     */
    public double getSurfaceLine(){
        return Math.sqrt(Math.pow(this.baseCircle.getRadius() - this.coverCircle.getRadius(), 2) + Math.pow(this.height, 2));
    }

    /**
     * Calculates the lateral surface area of the truncated cone.
     *
     * @return truncated cone lateral surface area
     *
     */
    public double getLateralSurfaceArea(){
        return Math.PI * this.getSurfaceLine() * (this.baseCircle.getRadius() + this.coverCircle.getRadius());
    }

    /**
     * Calculates the surface area of the truncated cone.
     *
     * @return truncated cone surface area
     *
     */
    public double getSurfaceArea(){
        return this.getLateralSurfaceArea() + this.baseCircle.getArea() + this.coverCircle.getArea();
    }

    /**
     * Calculates the total volume of the truncated cone.
     *
     * @return truncated cone volume
     *
     */
    public double getVolume(){
        return (1.0 / 3.0) * Math.PI * this.height * (Math.pow(this.baseCircle.getRadius(), 2) +
                Math.pow(this.coverCircle.getRadius(), 2) +
                (this.baseCircle.getRadius() * this.coverCircle.getRadius()));
    }

    /**
     * Sets the height of the truncated cone.
     *
     * @param truncated cone height
     *
     */
    public void setHeight(final double height){
        this.height = height;
    }

    /**
     * Outputs the main calculations of the truncated cone in the console.
     *
     */
    public void printToConsole(){
        System.out.println("Surface Area: " + this.getSurfaceArea());
        System.out.println("Lateral Surface Area: " + this.getLateralSurfaceArea());
        System.out.println("Surface Line: " + this.getSurfaceLine());
        System.out.println("Volume: " + this.getVolume());
    }

}
