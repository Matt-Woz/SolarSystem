/**
 * This is the overarching parent class of all the different solar system entities
 * @author Mateusz Wozakowski
 */
public class SolarBody {
    private double distance;
    private double angle;
    private double diameter;
    private String col;
    private int Velocity;

    /**
     * Default solar entity constructor. Parameters as defined in SolarSystem class, drawSolarObject method (@author Joe Finney)
     *  @param distance the distance from the sun to the object.
     *  @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     *  @param diameter the size of the object.
     *  @param col the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY,
     *  MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW. Alternatively, a 24 bit hexadecimal string representation of an RGB colour is also accepted, e.g. "#FF0000"</p>
     **/
    public SolarBody(double distance, double angle, double diameter, String col){
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }

    /**
     * Default Method which allows movement of solar entities
     * @param MilkyWay Instance of the SolarSystem window
     */
    public void Move(SolarSystem MilkyWay)
    {
        this.setAngle(this.getAngle() + Velocity); //Set angle to simulate movement
        MilkyWay.drawSolarObject(this.getDistance(), this.getAngle(), this.getDiameter(), this.getCol()); //Draws object onto solarSystem
    }
    //Setters and getters

    public void setAngle(double angle) {
        this.angle = angle;
    }
    public double getAngle() {
        return angle;
    }

    public double getDistance() {
        return distance;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getCol() {
        return col;
    }
}
