/**
 * This is the moon class used for creating moons/other satellites in the solar system.
 */
public class Moon extends SolarBody {
  private Planet Centre; //Planet around which the moon revolves around
  private int Velocity;

    /**
     *
     * Takes default SolarBody constructor and overloads it with a name, centre planet, and velocity
     * @param name Name of moon
     * @param distance Distance from centre planet
     * @param Centre Takes the planet which the created moon revolves around
     * @param Velocity Speed at which the moon rotates around the planet
     */
    public Moon(String name, double distance, double angle, double diameter, String col, Planet Centre, int Velocity)
    {
        super(distance, angle, diameter, col);
        this.Centre = Centre;
        this.Velocity = Velocity;
    }

    /**
     * Overload of Move method in SolarBody to allow constant movement around planet
     */
    public void Move(SolarSystem MilkyWay)
    {
        this.setAngle(this.getAngle() + this.Velocity);
        MilkyWay.drawSolarObjectAbout(this.getDistance(), this.getAngle(), this.getDiameter(), this.getCol(), Centre.getDistance(), Centre.getAngle());
    }
}


