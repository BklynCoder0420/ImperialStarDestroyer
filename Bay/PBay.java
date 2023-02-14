package Bay;

import Enums.*;
public class PBay extends FigherBay{

    private int Capacity;
    private String StarDestroyerType;

    public PBay(String bayName, String bayID) {
        super("Port Bay", "PB-1");
        setBayType("Tie Fighter P");
        this.Capacity = 48;
    }

    public String getStarDestroyerType() {
        return StarDestroyerType;
    }

    public void setStarDestroyerType(String starDestroyerType) {
        this.StarDestroyerType = starDestroyerType;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public void displayTieFighters() {
        System.out.println("Tie Fighter" + "\nFighter Type: " + TieFighter.TieFighter_I.getTFtype() + "\nLength: " + TieFighter.TieFighter_I.getTFlength() + "\nWidth: " + TieFighter.TieFighter_I.getTFwidth() + "\nStatus: " + TieFighter.TieFighter_I.getTFstatus());
    }

    @Override
    public void displayBayInfo() {
        System.out.println("\nPort Fighter Bay ID: " + this.getBayID() + "\n" + this.getBayName() + "\n" + this.getBayID() + "\n" + this.getBayName() + "\nFighter Capacity: " + this.Capacity + "\n");
    }
}
