package Bay;

import Enums.*;
public class FBay extends FigherBay{

    private int Capacity;
    private String StarDestroyerType;

    public FBay(String bayName, String bayID) {
        super("Forward Bay", "FB-1");
        setBayType("Tie Fighter F");
        this.Capacity = 96;
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
        System.out.println("Tie Fighter" + "\nFighter Type: " + TieFighter.TieFighter_S.getTFtype() + "\nLength: " + TieFighter.TieFighter_S.getTFlength() + "\nWidth: " + TieFighter.TieFighter_S.getTFwidth() + "\nStatus: " + TieFighter.TieFighter_S.getTFstatus());
    }

    @Override
    public void displayBayInfo() {
        System.out.println("\nForward Fighter Bay ID: " + this.getBayID() + "\n" + this.getBayName() + "\n" + this.getBayID() + "\n" + this.getBayName() + "\nFighter Capacity: " + this.Capacity);
    }   
}
