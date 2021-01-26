import java.awt.*;
/**
 * This class takes the default constructor and methods of SolarBody, and adds on a name and velocity
 */
public class Planet extends SolarBody{
    private Star centre;
    private int Velocity;

    /**
     * Takes default SolarBody constructor and overloads it with a name, centre planet, and velocity
     * @param name Name of planet
     * @param Velocity Speed at which planet revolves around the sun
     */
    public Planet(String name, double distance, double angle, double diameter, String col, int Velocity)
    {
        super(distance, angle, diameter, col);
        this.Velocity = Velocity;
    }

    /**
     * Default
     * @param MilkyWay Instance of the SolarSystem window
     */
    public void Move(SolarSystem MilkyWay)
    {
        this.setAngle(this.getAngle() + Velocity);
        MilkyWay.drawSolarObject(this.getDistance(), this.getAngle(), this.getDiameter(), this.getCol());
    }
}