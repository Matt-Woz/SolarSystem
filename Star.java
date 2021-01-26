/**
 * This is the star class used for creating stars in the solar system
 */
public class Star extends SolarBody{
    /** Takes default constructor of SolarBody -
     *
     * @param distance Distance from the centre, Not forced to 0 to allow for potential different configurations e.g binary star systems
     * @param angle Makes no difference unless distance is not set to 0
     * @param diameter Size of star
     * @param col Colour of star
     */
    public Star(double distance, double angle, double diameter, String col)
    {
        super(distance, angle, diameter, col);
    }

    /**
     * Draws Star onto solar system
     * @param MilkyWay Instanace of solar system
     */
    public void Draw(SolarSystem MilkyWay)
    {
        MilkyWay.drawSolarObject(this.getDistance(), this.getAngle(), this.getDiameter(), this.getCol());
    }
}