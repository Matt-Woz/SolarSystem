import java.util.ArrayList;
/**
 * This class creates all the instances of the milky way solar system
 * This class should be changed in order to change the layout of the simulated solar system
 */
public class OurSolarSystem {
    public void Create(){
        SolarSystem MilkyWay = new SolarSystem(1000, 1000); //Creates instance of SolarSystem, makes window
        ArrayList<Moon> SaturnsRings = new ArrayList<>(); //Creates list for the rings of saturn
        ArrayList<SolarBody> AsteroidBelt = new ArrayList<>(); //Creates list for asteroid belt
        ArrayList<Planet> Planets = new ArrayList<>(); //Creates list for planets
        ArrayList<Moon> Moons = new ArrayList<>(); //Creates list for moons
        Star Sun = new Star(0, 0, 100, "YELLOW"); //Creates the sun
        //Creation of planets and their main moons
        Planets.add(new Planet("Mercury", 80, 10, 10, "DARK_GRAY", 10)); //Index: 0
        Planets.add(new Planet("Venus", 120, 10, 10, "DARK_GRAY", 8)); //1
        Planets.add(new Planet("Earth", 170, 20, 20, "BLUE", 6)); //2
        Planets.add(new Planet("Mars", 210, 25, 12, "RED", 5)); //3
        Planets.add(new Planet("Jupiter", 280, 30, 45, "YELLOW", 4)); //4
        Planets.add(new Planet("Saturn", 370, 35, 40, "#AB604A", 3)); //5
        Planets.add(new Planet("Uranus", 460, 40, 20, "#ADD8E6", 2)); //6
        Planets.add(new Planet("Neptune", 480, 45, 20, "BLUE", 1)); //7
        Moons.add(new Moon("earthsMoon", 20, 90, 5, "WHITE", Planets.get(2), 10));
        Moons.add(new Moon("Phobos", 15, 40, 2, "RED", Planets.get(3), 8));
        Moons.add(new Moon("Deimos", 21, 90, 2, "RED", Planets.get(3), 7));
        Moons.add(new Moon("Ganymede", 35, 90, 8, "#594E42", Planets.get(4), 8));
        Moons.add(new Moon("Europa", 32, 45, 4, "WHITE", Planets.get(4), 6));
        Moons.add(new Moon("Callisto", 40, 150, 8, "BROWN", Planets.get(4), 7));
        Moons.add(new Moon("Io", 45, 210, 6, "YELLOW", Planets.get(4), 6));
        Moons.add(new Moon("Titan", 45, 20, 8, "YELLOW", Planets.get(5), 7));
        Moons.add(new Moon("Enceladus", 47, 50, 2, "WHITE", Planets.get(5), 10));
        Moons.add(new Moon("Tethys", 46, 90, 3, "WHITE", Planets.get(5), 8));
        Moons.add(new Moon("Dione", 49, 140, 3, "WHITE", Planets.get(5), 7));
        Moons.add(new Moon("Umbriel", 20, 10, 3, "GRAY", Planets.get(6), 10));
        Moons.add(new Moon("Miranda", 23, 90, 2, "WHITE", Planets.get(6), 8));
        Moons.add(new Moon("Oberon", 26, 150, 4, "LIGHT_GRAY", Planets.get(6), 6));
        Moons.add(new Moon("Triton", 20, 150, 4, "WHITE", Planets.get(7), 7));
        Moons.add(new Moon("Proteus", 25, 270, 2, "LIGHT_GRAY", Planets.get(7), 10));
        for(int i = 0; i < 60; i++){ //Creates many instances of the moon class to simulate saturn's rings
            SaturnsRings.add(new Moon("i",30, Math.pow(i, 1.5), 5, "ORANGE", Planets.get(5),15));
        }
        double midPoint = (Planets.get(3).getDistance() + Planets.get(4).getDistance()) / 2; //Calculates midpoint between mars and jupiter for asteroid belt
        for(int i = 0; i < 60; i++){ //Creates many instances of Planet class to model the asteroid belt (Orbit sun between mars and jupiter)
            AsteroidBelt.add(new Planet("i", midPoint, Math.pow(i, 1.5), 5, "GRAY", 10));
        }
        //While loop for constant updating
        while(true)
        {
            Sun.Draw(MilkyWay); //Draw sun onto the solar system
            //Calls move methods for all solar objects
            for(Planet planet : Planets)
            {
                planet.Move(MilkyWay);
            }
            for(Moon moon : Moons)
            {
                moon.Move(MilkyWay);
            }
            for (Moon saturnsRing : SaturnsRings) { //For each 'moon' in saturns ring
                saturnsRing.Move(MilkyWay);
            }
            for (SolarBody Asteroids : AsteroidBelt){ //For each asteroid in asteroid belt
                Asteroids.Move(MilkyWay);
            }
            MilkyWay.finishedDrawing();
        }
    }
}
